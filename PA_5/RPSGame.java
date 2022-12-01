import java.util.*;

public class RPSGame
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        //Variables 
        int input;
        int statIn; 
        String move = ""; 
        String cpuMove = ""; 
        //Players 
        RPSGamePlayer Player1 = new RPSGamePlayer(); 
        RPSGamePlayer Player2 = new RPSGamePlayer(); 
        //Explaining the Rules 
        System.out.println("Welcome to Magical Rock Paper Scissors");
        System.out.println("You will use attacks and spells to eliminate your opponent; however, note that each move has a counter.");
        //Getting User Input for the Stats 
        System.out.println("Now, would you like to set your stats or randomly generate them? Type in 1 if you would like to set your stats and 2 if you want them to be random:");
        input = in.nextInt();
        if(input == 1)
        {
            System.out.println("Set health stat between 1-10:"); 
            statIn = in.nextInt();
            if(statIn > 10 || statIn < 1)
            {
                System.out.println("Bad Input"); 
                System.exit(0); 
            }
            Player1.setHealth(statIn);
            System.out.println("Set armor stat between 1-5:"); 
            statIn = in.nextInt();
            if(statIn > 5 || statIn < 1)
            {
                System.out.println("Bad Input"); 
                System.exit(0); 
            }
            Player1.setArmor(statIn);
            System.out.println("Set magic armor stat between 1-5:"); 
            statIn = in.nextInt();
            if(statIn > 10 || statIn < 1)
            {
                System.out.println("Bad Input"); 
                System.exit(0); 
            }
            Player1.setMagicArmor(statIn);
        }
        else if(input == 2)
        {
            statIn = (int)(Math.random() * 10) + 1; 
            Player1.setHealth(statIn);
            statIn = (int)(Math.random() * 5) + 1; 
            Player1.setArmor(statIn); 
            statIn = (int)(Math.random() * 5) + 1; 
            Player1.setMagicArmor(statIn);  
        }
        else 
        {
            System.out.println("Bad input"); 
            System.exit(0); 
        }
        //Generating the AI's Stats 
        System.out.println("What difficulty would you like to set for the AI?");
        System.out.println("Type 1 for easy, 2 for difficult, and 3 for impossible");
        input = in.nextInt();
        if(input == 1)
        {
            statIn = (int)(Math.random() * 5) + 1; 
            Player2.setHealth(statIn);
            statIn = (int)(Math.random() * 3) + 1; 
            Player2.setArmor(statIn); 
            statIn = (int)(Math.random() * 3) + 1; 
            Player2.setMagicArmor(statIn);  
        }
        else if(input == 2)
        {
            statIn = (int)(Math.random() * 5) + 5; 
            Player2.setHealth(statIn);
            statIn = (int)(Math.random() * 3) + 3; 
            Player2.setArmor(statIn); 
            statIn = (int)(Math.random() * 3) + 3; 
            Player2.setMagicArmor(statIn);  
        }
        else
        {
            statIn = (int)(Math.random() * 100) + 10; 
            Player2.setHealth(statIn);
            statIn = (int)(Math.random() * 100) + 10; 
            Player2.setArmor(statIn); 
            statIn = (int)(Math.random() * 100) + 10;      
        }
        //Playing the Game 
        System.out.println(); 
        System.out.println("The game will now begin"); 
        System.out.println();
        Player1.actionList(); //Showing the player their options 
        System.out.println(); 
        while(Player1.getHealth() > 0 && Player2.getHealth() > 0)
        {
            System.out.println("Your stats: "); //Displaying your stats 
            System.out.println("Health: " + Player1.getHealth()); 
            System.out.println("Armor: " + Player1.getArmor());
            System.out.println("Magic Armor: " + Player1.getMagicArmor());  
            System.out.println(); 
            System.out.println("Your opponent's stats: "); //Displaying the AI's stats 
            System.out.println("Health: " + Player2.getHealth()); 
            System.out.println("Armor: " + Player2.getArmor());
            System.out.println("Magic Armor: " + Player2.getMagicArmor());
            System.out.println(); 
            System.out.println("What move would you like to make: "); //User Input for their move
            input = in.nextInt(); 
            if(input == 1)
            {
                move = "Attack"; 
            }
            if(input == 2)
            {
                move = "Spell"; 
            }
            if(input == 3)
            {
                move = "Defend"; 
            }
            if(input == 4)
            {
                move = "Heal"; 
            }
            statIn = (int)(Math.random() * 4) + 1; //Generating the cpu's move
            if(statIn == 1)
            {
                cpuMove = "Attack"; 
            }
            if(statIn == 2)
            {
                cpuMove = "Spell"; 
            }
            if(statIn == 3)
            {
                cpuMove = "Defend"; 
            }
            if(statIn == 4)
            {
                cpuMove = "Heal"; 
            }
            Player1.combatCheck(move, cpuMove, Player1, Player2); 
        }
        //Stating the results
        if(Player1.getHealth() == 0)
        {
            System.out.println("The CPU has won"); 
        }
        else
        {
            System.out.println("You have won!"); 
        }
    }
}
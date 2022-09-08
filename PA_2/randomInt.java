import java.util.*; 

public class randomInt
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in); 
        //Variables
        int val = (int) (Math.random()*10)+1; 
        int input = 0;  
        int score = 1;

        //Guess 
        System.out.println("The range of integers is from 1-10 "); 
        do
        {
        System.out.println("Guess the number: "); 
        input = in.nextInt(); 
        if(input < 1 || input > 10)
        {
            System.out.print("Bad input, input numbers within the value range "); 
            System.exit(0); 
        }
        if(input != val)
        {
            System.out.println("You guessed wrong"); 
            score++; 
            if(input > val)
            {
                System.out.println("Hint: Your number is greater than the actual number "); 
            }
            else 
            {
                System.out.println("Hint: Your number is less than the actual number ");
            }
        }
        } while(input != val);   
        //Informing the user they got it correct 
        System.out.print("You successfully guessed the number: " + val + ", in " + score + " tries"); 

        
    }
}
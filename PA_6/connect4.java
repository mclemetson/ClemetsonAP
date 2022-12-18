import java.util.*; 

public class connect4
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        //Variables 
        int val; 
        int input; 
        boolean check = false;  
        //Board declaration
        connect4Board gameBoard = new connect4Board(); 
        //Setting the board so it is empty 
        for(int row = 0; row < gameBoard.getBoard().length; row++)
        {
            for(int col = 0; col < gameBoard.getBoard()[row].length; col++)
            {
                gameBoard.getBoard()[row][col] = 0; 
            }
        }
        //Printing out the rules 
        System.out.println("Welcome to Connect 4, get 4 in a row to win!"); 
        System.out.println("Player 1 will be represented by the 1s on the board, and player 2 will be represented by the 2s."); 
        System.out.println("The game will now begin."); 
        while(check == false)
        {
            //Printing the Board
            gameBoard.print(gameBoard.getBoard()); 
            //Getting Input from Player 1
            do 
            {
                System.out.print("Player 1, you are up. List which column you would like to drop your piece (1-7): ");  
                input = in.nextInt(); 
                input--; 
                System.out.println(); 
                //Checking to make sure the column is in range 
                if(input < 0 || input > 6)
                {
                    input = -1; 
                    System.out.println("Bad input: input a column within the range"); 
                }
                //Checking to see if the column is full 
                else if(gameBoard.getBoard()[0][input] != 0)
                {
                    input = -1;
                    System.out.println("Bad input: the column is full"); 
                }
            } while(input == -1); 
            //Dropping the token in the board and checking for a win 
            val = gameBoard.dropToken(gameBoard.getBoard(), input);  
            gameBoard.getBoard()[val][input] = 1;
            if(gameBoard.horizontalCheck(gameBoard.getBoard()) == true)
            {
                check = true; 
                break; 
            }
            if(gameBoard.verticalCheck(gameBoard.getBoard()) == true)
            {
                check = true; 
                break; 
            }
            if(gameBoard.diagonalCheck(gameBoard.getBoard()) == true)
            {
                check = true; 
                break; 
            }
            //Printing the Board 
            gameBoard.print(gameBoard.getBoard());  
            //Getting Input from Player 2
            do
            {
                System.out.print("Player 2, you are up. List which column you would like to drop your piece (1-7): ");  
                input = in.nextInt(); 
                input--; 
                System.out.println();
                //Checking to make sure the column is in range 
                if(input < 0 || input > 6)
                {
                    input = -1; 
                    System.out.println("Bad input: input a column within the range");
                }
                //Checking to see if the column is full 
                else if(gameBoard.getBoard()[0][input] != 0)
                {
                    input = -1;
                    System.out.println("Bad input: the column is full"); 
                }
            } while(input == -1); 
            //Dropping the token in the board and checking for a win
            val = gameBoard.dropToken(gameBoard.getBoard(), input); 
            gameBoard.getBoard()[val][input] = 2; 
            if(gameBoard.horizontalCheck(gameBoard.getBoard()) == true)
            {
                check = true; 
                break; 
            }
            if(gameBoard.verticalCheck(gameBoard.getBoard()) == true)
            {
                check = true; 
                break; 
            }
            if(gameBoard.diagonalCheck(gameBoard.getBoard()) == true)
            {
                check = true; 
                break; 
            }
        }
        //Printing the final board
        gameBoard.print(gameBoard.getBoard()); 
    }
}
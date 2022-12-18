public class connect4Board
{
    //Atrributes 
    private int [][] board; 
    //Constructors 
    //Default 
    public connect4Board()
    {
        //2D Array Declaration 
        board = new int[6][7];
    }
    //Methods 
    public int dropToken(int[][] array, int colVal)
    {
        int count = 5;  
        for(int i = 5; i > 0; i--)
        {
            if(array[i][colVal] == 0)
            {
               break;  
            }
            else
            {
                count--; 
            }
        }
        return count; 
    }
    public void print(int[][] array)
    {
        //Printing out the Board
        for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array[row].length; col++)
            {
                System.out.print(array[row][col] + " "); 
            }
            System.out.println(); 
        }
    }
    //Getters 
    public int[][] getBoard()
    {
        return board; 
    }    
    //Win Conditions 
    public boolean horizontalCheck(int[][] array)
    {
        int count1 = 0; 
        int count2 = 0;
        int val = -1;
        for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array[row].length; col++)
            {
                if(array[row][col] != val)
                {
                    count1 = 0;
                    count2 = 0;
                    val = -1; 
                }
                if(array[row][col] == 1)
                {
                    val = array[row][col]; 
                    count1++; 
                }
                else if(array[row][col] == 2)
                {
                    val = array[row][col]; 
                    count2++; 
                }
                if(count1 == 4)
                {
                    System.out.println("Player 1 has gotten 4 in a row!"); 
                    return true; 
                }
                else if(count2 == 4)
                {
                    System.out.println("Player 2 has gotten 4 in a row!"); 
                    return true; 
                }
            }
        }
        return false;
    }
    public boolean verticalCheck(int[][] array)
    {
        int count1 = 0; 
        int count2 = 0; 
        int val = 0; 
        for(int col = 0; col < 7; col++)
        {
            for(int row = 0; row < 6; row++)
            {
                if(array[row][col] != val)
                {
                    count1 = 0;
                    count2 = 0;
                    val = 0; 
                }
                if(array[row][col] == 1)
                {
                    val = array[row][col]; 
                    count1++; 
                }
                else if(array[row][col] == 2)
                {
                    val = array[row][col]; 
                    count2++; 
                }
                if(count1 == 4)
                {
                    System.out.println("Player 1 has gotten 4 in a row!"); 
                    return true; 
                }
                else if(count2 == 4)
                {
                    System.out.println("Player 2 has gotten 4 in a row!"); 
                    return true; 
                }
            }
        }
        return false; 
    }
    public boolean diagonalCheck(int[][] array)
    {
        int count1 = 0; 
        int count2 = 0; 
        int val = 0; 
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 4; col++)
            {
                if(array[row][col] != val)
                {
                    count1 = 0;
                    count2 = 0;
                    val = 0; 
                }
                if(array[row][col] == 1)
                {
                    val = array[row][col]; 
                    count1++;
                    int row1 = row; 
                    int col1 = col;  
                    while(array[row1 + 1][col1 + 1] == val)
                    {
                        count1++; 
                        row1++; 
                        col1++; 
                        if(count1 == 4)
                        {
                            break; 
                        }
                    }
                }
                if(array[row][col] == 2)
                {
                    val = array[row][col]; 
                    count2++; 
                    int row2 = row; 
                    int col2 = col; 
                    while(array[row2 + 1][col2 + 1] == val)
                    {
                        count2++; 
                        row2++; 
                        col2++; 
                        if(count2 == 4)
                        {
                            break; 
                        }
                    }
                }
                if(count1 == 4)
                {
                    System.out.println("Player 1 has gotten 4 in a row!"); 
                    return true; 
                }
                else if(count2 == 4)
                {
                    System.out.println("Player 2 has gotten 4 in a row!"); 
                    return true; 
                }
            }
        }
        for(int row = 0; row < 3; row++)
        {
            for(int col = 6; col > 2; col--)
            {
                if(array[row][col] != val)
                {
                    count1 = 0;
                    count2 = 0;
                    val = 0; 
                }
                if(array[row][col] == 1)
                {
                    val = array[row][col]; 
                    count1++;
                    int row1 = row; 
                    int col1 = col;  
                    while(array[row1 + 1][col1 - 1] == val)
                    {
                        count1++; 
                        row1++; 
                        col1--; 
                        if(count1 == 4)
                        {
                            break; 
                        }
                    }
                }
                if(array[row][col] == 2)
                {
                    val = array[row][col]; 
                    count2++; 
                    int row2 = row; 
                    int col2 = col; 
                    while(array[row2 + 1][col2 - 1] == val)
                    {
                        count2++; 
                        row2++; 
                        col2--; 
                        if(count2 == 4)
                        {
                            break; 
                        }
                    }
                }
                if(count1 == 4)
                {
                    System.out.println("Player 1 has gotten 4 in a row!"); 
                    return true; 
                }
                else if(count2 == 4)
                {
                    System.out.println("Player 2 has gotten 4 in a row!"); 
                    return true; 
                }
            }
        }
        return false; 
    }
}
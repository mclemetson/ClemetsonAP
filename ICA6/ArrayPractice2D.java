import java.util.*; 

public class ArrayPractice2D
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        //Declaring arrays 
        int [][] my2D = new int[10][10]; 
        for(int row = 0; row < my2D.length; row++)
        {
            for(int col = 0; col < my2D[row].length; col++)
            {
                if(row == 0 && col == 0)
                {
                    my2D[row][col] = 1; 
                }
                else if(row == 0)
                {
                    my2D[row][col] =  my2D[row][col-1]; 
                }
                else if(col == 0)
                {
                    my2D[row][col] = my2D[row-1][col];
                }
                else 
                {
                    my2D[row][col] = my2D[row-1][col] + my2D[row][col-1];
                }
            } 
        }
        //Printing out the grid 
        for(int row = 0; row < my2D.length; row++)
        {
            for(int col = 0; col < my2D[row].length; col++)
            {
                System.out.print(my2D[row][col] + " "); 
            }
            System.out.println(); 
        }
    }
}

/* int count = 0;
        int increment = 0; 
        for(int row = 5; row < array.length; row--)
        {
            for(int col = 6; col < array[row].length; col--)
            {
                while(array[row][col + increment] == 1)
                {
                    count++; 
                    if(array[row][col+1] == 1)
                    {
                        increment++; 
                    }
                    else if(array[row][col-1] == 1)
                    {
                        increment--; 
                    }
                    if(count == 4)
                    {
                        return true; 
                    }
                }
                count = 0; 
                increment = 0;
                while(array[row + increment][col] == 1)
                {
                    count++; 
                    if(array[row + 1][col] == 1)
                    {

                    }
                }
            }
        }
        return false;  
        
        
        else if(array[row][col] == 2)
                {
                    for(int check = col; check < array[row].length; check++)
                    {
                        if(array[row][check] == 1 || array[row][check] == 0)
                        {
                            count = 0; 
                            break; 
                        }
                        count++; 
                    } 
                    if(count == 4)
                    {
                        return true; 
                    }
                }
        */
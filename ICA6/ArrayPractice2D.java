import java.util.*; 

public class ArrayPractice2D
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        //Declaring arrays 
        int [][] my2D = new int[10][10]; 
        for(int row = 0; row < my2D.length; col++)
        {
            for(int col = 0; col < my2D[row].length; col++)
            {
                if(row == 0 && col == 0)
                {
                    my2D[row][col] = 1; 
                }
                else if(row == 0)
                {
                    my2D[row][col-1] = 1; 
                }
                else if(col == 0)
                {
                    my2D[row-1][col] = 1;
                }
                else 
                {
                    my2D[row][col] = my2D[row-1][col] + my2D[row][col-1];
                }
            } 
        }
    }
}
import java.util.*; 

public class sumProduct2DArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Array Declaration 
        int[][] my2D = new int[10][10]; 
        //Loop
        for(int row = 0; row < my2D.length; row++)
        {
            for(int col = 0; col < my2D[row].length; col++)
            {
                if(col == row)
                {
                    my2D[row][col] = row * col; 
                }
                else
                {
                    my2D[row][col] = row + col; 
                }
            }
        }
        //Print
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
import java.util.*; 

public class insertion
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        //Variables  
        int temp;
        //Array 
        int[] array = new int[10]; 
        //Assigning a random value from 1-100 to each array spot 
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random()*100)+1;
        }
        //Insertion Sort 
        for(int i = 0; i < array.length; i++)
        {
            //Printing the sorted list
            System.out.println("Sorted: "); 
            for(int x = 0; x < i; x++)
            {
                System.out.println(array[x]); 
            }
            System.out.println("------------------------"); 
            //Printing the unsorted list
            System.out.println("Unsorted: ");
            for(int y = i; y < array.length; y++)
            {
                System.out.println(array[y]); 
            }
            System.out.println("___________________________");           
            //Comparison
            for(int j = 0; j < i; j++)
            {                 
                if(array[i] < array[j]) //comparing two values to see if the first one is smaller 
                {
                    //Swap
                    temp = array[i]; 
                    array[i] = array[j]; 
                    array[j] = temp;  
                }                                    
            }
        }
        //Printing the final list
        System.out.println("Everything is sorted"); 
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]); 
        }
    }
}
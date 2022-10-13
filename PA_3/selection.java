import java.util.*; 

public class selection
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        //Variables
        int min; 
        int minoff = 0; 
        int temp; 
        //Array 
        int[] array = new int[10];
        //Assigning a random value from 1-100 to each array spot 
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random()*100)+1;
        }
        //Selection sort          
        for(int i = 0; i < array.length; i++)
        {
            min = array[i];
            //Finding the min
            for(int j = i; j < array.length; j++)
            {
                if(array[j] <= min)
                {
                    min = array[j]; 
                    minoff = j; 
                }
            } 
            //Swap
            temp = array[i]; 
            array[i] = min; 
            array[minoff] = temp;
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
        }   
        //Printing the final list
        System.out.println("Everything is sorted"); 
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]); 
        }
               
    }

}

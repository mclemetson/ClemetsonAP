import java.util.*; 

public class BinarySearch2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        //Variables for Selection 
        int min; 
        int temp;
        int max; 
        //Array 
        int[] array = new int[10000]; 
        //Variables for Search 
        int start; 
        int mid; 
        int end; 
        int numIt = 0; 
        int input;
        int total = 0;
        boolean check = false;   
        //Assigning a random value from 1-20000 to each array spot 
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random()*20000)+1;
        }
        //Finding the min 
        min = array[0]; 
        for(int i : array)
        {
            if(i < min)
            {
                min = i;
            }
        }
        System.out.println("The min of the array is " + min);
        //Finding the max 
        max = array[0]; 
        for(int i : array)
        {
            if(i > max)
            {
                max = i; 
            }
        }
        System.out.println("The max of the array is " + max); 
        //Finding the average
        for(int i : array)
        {
            total += i; 
        }
        total /= array.length;
        System.out.println("The average of the array is " + total); 
        
        //Selection Sort 
        for(int i = 0; i < array.length; i++)
        {
            min = i; 
            //Finding the min
            for(int j = i; j < array.length; j++)
            {
                if(array[j] < array[min])
                {
                    min = j;  
                }
            } 
            //Swap
            temp = array[i]; 
            array[i] = array[min]; 
            array[min] = temp;
        }
        //User Input 
        System.out.println("Input a number from 1 - 20000 to search for with sequential search: ");
        input = in.nextInt(); 
        //Sequential Search 
        while(check == false) //It will run until it a finds a value that exists in the array
        {
            //Doing the search with a for loop
            for(int i = 0; i < array.length; i++)
            {
                numIt++;
                if(array[i] == input)
                {
                    check = true; 
                    break; 
                } 
            } 
            //Printing the results 
            if(check == true)
            {
                System.out.println("Sequential Search:"); 
                System.out.println("The number " + input + " was found in " + numIt + " iterations."); 
            }
            else
            {
                //Resetting the values
                numIt = 0; 
                //Getting another value from the user
                System.out.println("The number " + input + " was not found. Input another value: "); 
                input = in.nextInt(); 
            }
        }
        //Binary Search
        numIt = 0; //Resetting the iterations for Binary Search
        check = false; //Reset for Binary 
        //Setting the values for the binary search 
        start = 0; 
        end = array.length-1; 
        mid = array.length/2; 
        //Using a while loop for Binary 
        while(start != end)
        { 
            //Counting the iterations 
            numIt++; 
            if(input > array[mid])
            {
                //Shifting the starting point
                start = mid + 1;  
            }
            else if(input < array[mid])
            {
                //Shifting the end point 
                end = mid - 1; 

            }
            if(input == array[mid])
            {
                check = true; 
                break;
            }
            //Shifting the mid 
            mid = (start + end) / 2;
        }
        //Printing the Results 
        System.out.println("Binary Search:"); 
        System.out.print("The number " + input + " has been found at spot " + mid + " in the array. It took binary search " + numIt + " iterations."); 



    }
}
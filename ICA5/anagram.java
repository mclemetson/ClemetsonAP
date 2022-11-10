import java.util.*; 

public class anagram
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        //Variables 
        String one; 
        String two; 
        boolean check = true; 
        //User input 
        System.out.println("Input two strings to see if they are anagrams: "); 
        one = in.next(); 
        two = in.next(); 
        //Array Declaration
        int[] vals = new int[one.length()];
        int[] vals2 = new int[one.length()]; 
        //Setting the capitalization
        one = one.toLowerCase(); 
        two = two.toLowerCase(); 
        //Checking if they are anagrams 
        if(one.length() == two.length()) //Checks length
        {
            //Converting the letters to numbers and storing them in integer arrays
            for(int i = 0; i < one.length(); i++)
            {
                vals[i] = one.charAt(i); 
            }
            for(int i = 0; i < one.length(); i++)
            {
                vals2[i] = two.charAt(i); 
            }
            //Sorting the arrays
            selectionSort(vals); 
            selectionSort(vals2); 
            //Comparing the two words 
            for(int i = 0; i < one.length(); i++)
            {
                if(vals[i] != vals2[i])
                {
                    check = false; //Making it false if one of the letters/numbers don't line up
                }
            }
            //Printing the results
            if(check == true)
            {
                System.out.println("They are anagrams"); 
            }
            else
            {
                System.out.println("They are not anagrams"); 
            }
        }
        else
        {
            System.out.println("They are not anagrams"); 
        }
    }
    public static int[] selectionSort(int[] array)
    {
        int min = 0;
        int temp = 0; 
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
        return array; 
    }
}

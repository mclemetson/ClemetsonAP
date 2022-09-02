import java.util.Scanner; 

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); 
        //Variables 
        int integer; 
        int total = 1;
        //User Input 
        System.out.println("Input an integer: "); 
        integer = in.nextInt(); 
        //Factorial 
        for(int i = integer; i >= 1; i--)
        {
            total *= i; 
        }
        System.out.print("Factorial: " + total); 
    }
}
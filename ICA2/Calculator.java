import java.util.Scanner; 

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); 
        //Variables 
        int val1; 
        int val2; 
        char op;
        int total = 0; 
        //User Input 
        System.out.println("Input a math equation: "); 
        val1 = in.nextInt(); 
        op = in.next().charAt(0);
        val2 = in.nextInt(); 
        if(val1 > 999 || val1 < -999 || val2 > 999 || val2 < -999)
        {
            System.out.print("Input a value within -999 and 999");
            System.exit(0);
        }
        //Getting the value for each of the operations 
        if(op == '+')
        {
            total = val1 + val2; 
        }
        else if(op == '-')
        {
            total = val1 - val2;
        }
        else if(op == 'x')
        {
            total = val1 * val2; 
        }
        else if(op == 'X')
        {
            total = val1 * val2; 
        }
        else if(op == '*')
        {
            total = val1 * val2; 
        }
        else if(op == '/')
        {
            total = val1 / val2; 
        }
        else if(op == '%')
        {
            total = val1 % val2; 
            if(total == 0) 
            {
                System.out.println("The left number is divisble by the number on the right"); 
            }
            else
            {
                System.out.println("The left number is not divisble by the number on the right"); 
            }
        }
        else
        {
            System.out.println("You are an idiot, input an actual operator"); 
            System.exit(0);
        }
        //Printing the final result 
        System.out.print(val1 + " " + op + " " + val2 + " " + "= " + total); 
    }
}
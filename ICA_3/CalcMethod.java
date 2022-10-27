import java.util.Scanner; 

public class CalcMethod
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
            total = addition(val1, val2);  
        }
        else if(op == '-')
        {
            total = subtraction(val1, val2); 
        }
        else if(op == 'x')
        {
            total = multiplication(val1, val2);
        }
        else if(op == 'X')
        {
            total = multiplication(val1, val2); 
        }
        else if(op == '*')
        {
            total = multiplication(val1, val2); 
        }
        else if(op == '/')
        {
            total = division(val1, val2);
        }
        else if(op == '^')
        {
            total = power(val1, val2); 
        }
        else if(op == '%')
        {
            remainder(val1, val2); 
            System.exit(0);

        }
        else
        {
            System.out.println("You are an idiot, input an actual operator"); 
            System.exit(0);
        }
        //Printing the final result 
        System.out.print(val1 + " " + op + " " + val2 + " " + "= " + total); 
    }
    
    //Methods
    public static int addition(int num, int num2) 
    {
        //Val to return
        int finalVal; 
        //Operation
        finalVal = num + num2; 
        return finalVal; 
    }
    public static int subtraction(int num, int num2) 
    {
        //Val to return
        int finalVal; 
        //Operation
        finalVal = num - num2; 
        return finalVal; 
    }
    public static int multiplication(int num, int num2) 
    {
        //Val to return
        int finalVal; 
        //Operation
        finalVal = num * num2; 
        return finalVal; 
    }
    public static int division(int num, int num2) 
    {
        //Val to return
        int finalVal; 
        //Operation
        finalVal = num / num2; 
        return finalVal; 
    }
    public static void remainder(int num, int num2) 
    {
        //Total 
        int finalVal = num % num2; 
        //Checks divisibility 
        if(finalVal == 0) 
            {
                System.out.println("The left number is divisble by the number on the right"); 
            }
            else
            {
                System.out.println("The left number is not divisble by the number on the right"); 
            } 
    }
    public static int power(int num, int num2)
    { 
        //Stores number for multiplication
        int original = num; 
        if(num2 == 0)//Anything to the power of 0 is 1 
        {
            return 1; 
        }
        for(int i = 1; i < num2; i++)//Loops the number of times to the power 
        {
            num *= original; 
        }
        return num; 
    }

}
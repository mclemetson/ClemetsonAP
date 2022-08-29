import java.util.Scanner; 

public class LiquidConversion
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); 
        //Variables 
        double teaspoons; 

        //User Input 
        System.out.println("Input a value in teaspoons: "); 
        teaspoons = in.nextDouble(); 
        
        //Conversion 
        //TableSpoons
        System.out.println("The value in tablespoons is: " + teaspoons/3); 
        //Cups 
        System.out.println("The value in cups is: " + teaspoons/48);
        //Pints 
        System.out.println("The value in pints is: " + teaspoons/96);
        //Quarts 
        System.out.println("The value in quarts is: " + teaspoons/192);
        //Gallons 
        System.out.println("The value in gallons is: " + teaspoons/768);
        //Fluid Ounces 
        System.out.print("The value in fluid ounces is: " + teaspoons/6);
    }
}
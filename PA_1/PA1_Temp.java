import java.util.Scanner; 

public class PA1_Temp{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); 
        //Variables 
        double fahrenheit; 
        double celsius; 
        double kelvin; 
        //User Input 
        System.out.println("Input a temperature in farenheit: "); 
        fahrenheit = in.nextDouble(); 
        //Temperature Conversion 
        celsius = (fahrenheit - 32) * 5/9; 
        kelvin = (fahrenheit - 32) * 5/9 + 273.15; 
        //Printing the temperatures 
        System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius and " + kelvin + " kelvin."); 
    }
}
import java.util.Scanner;

public class PA1_time {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Variables
        int seconds; 
        int minutes; 
        int hours; 
        int valIn; 
        //User input 
        System.out.println("Input an integer: "); 
        valIn = in.nextInt(); 
        //Time Conversion
        seconds = valIn; 
        minutes = seconds/60; 
        hours = minutes/60;
        seconds = seconds%60; 
        minutes = minutes%60; 
        //Printing the time
        System.out.print(hours + " Hours, " + minutes + " Minutes, " + seconds + " Seconds, "); 
    }
}

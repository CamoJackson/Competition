import java.util.Scanner;
public class Fuel{
   public static String Gallons, quit = "quit";
	public static double Liters;
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      while(true){
         System.out.print("input:");
         Gallons = keyboard.next();
         if(Gallons.equals(quit))
            System.exit(1);
         Liters = (100 * 3.785411784)/(1.609344 * Double.parseDouble(Gallons));
         System.out.println("output: "+ String.format("%6.2f",Liters));
      }
   //all we need to do is multiply the input by 42.5144 and round to nearest 100th decimal place
   }
}

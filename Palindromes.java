import java.util.Scanner;
public class Palindromes{
   public static final int NUMITEMS = 1;
   public static String input, strReverse, exit = "exit";
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      while(true){
         System.out.print("Please enter a string to test: ");
         input = keyboard.next();
         strReverse = "";
         if(input.equals(exit))
            System.exit(1);
         for(int k = 1; input.length() >= k; k++){
            strReverse = strReverse + input.charAt(input.length() - k);
         } 
         if(input.equals(strReverse)){
         
            System.out.println(input + " is a palindrome");
         }
         else{
            System.out.println(input + " is not a palindrome");
         }
         
      }
   }
}
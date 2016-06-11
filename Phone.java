//Phone numbers
import java.util.Scanner;
public class Phone{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Phone Number: ");
      String phoneNumber = keyboard.next();
      String translate = "";
      for(int k = 0; phoneNumber.length() <= k; k++){
         switch (phoneNumber.charAt(k)){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
               translate = translate + phoneNumber.charAt(k);
               break;
            case 'A':
            case 'B':
            case 'C':
               translate = translate + "2";
               break;
            case 'D':
            case 'E':
            case 'F':
               translate = translate + "3";
               break;
            case 'G':
            case 'H':
            case 'I':
               translate = translate + "4";
               break;
            case 'J':
            case 'K':
            case 'L':
               translate = translate + "5";
               break;
            case 'M':
            case 'N':
            case 'O':
               translate = translate + "6";
               break;
            case 'P': 
            case 'Q':
            case 'R':
            case 'S':
               translate = translate + "7";
               break;
            case 'T':
            case 'U':
            case 'V':
               translate = translate + "8";
               break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
               translate = translate + "9";
               break;
         }
      }
   }
}
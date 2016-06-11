import java.util.Scanner;
public class DND{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      String Name = keyboard.next();
     
     
     
     
      System.out.println("Name:"+Name);
      System.out.println("  Strength:"+"");
      System.out.println("  Constitution:"+"");
      System.out.println("  Dexterity:"+"");
      System.out.println("  Intelligence:"+"");
      System.out.println("  Wisdom:"+"");
      System.out.println("  Charisma:"+"");
   }
   public int Value; 
   {
   //double[] myAr = new double[NUMITEMS];
      int d1 = (int) Math.random()*6;
      int d2 = (int) Math.random()*6;
      int d3 = (int) Math.random()*6; 
      int d4 = (int) Math.random()*6;
   
      if ((d1 < d2) && (d1 < d3) && (d1 < d4))
      {
         d1 = 0;
      }
      if ((d2 < d1) && (d2 < d3) && (d2 < d4))
      {
         d2 = 0;
      }
      if ((d3 < d2) && (d3 < d1) && (d3 < d4))
      {
         d3 = 0;
      }
      if ((d4 < d2) && (d4 < d3) && (d1 < d4))
      {
         d4 = 0;
      }
   
      int value = d1 + d2 + d3 + d4;
   }
}
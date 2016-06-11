public class fizzbuzz{
   public static void main(String[] args){
      for(int f = 1; f <= 100; f++){
         if(f % 3 == 0  && f % 5 != 0 ){
            System.out.println("fizz");
         }
         else if((f % 5 == 0) && (f % 3 != 0) ){
            System.out.println("buzz");
         }
         else if(f%3 == 0 && f%5 ==0){
            System.out.println("fizzbuzz");
         }
         else{
            System.out.println(f);
         }
      }
   }
}
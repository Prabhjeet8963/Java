package random_lib;

//Random library
import java.util.Random;

public class Main {
     public static void main(String[] args){

         Random random = new Random();

         int number1;
         int number2;
         int number3;

         number1 = random.nextInt(1,7);
         number2 = random.nextInt(1,100);
         number3 = random.nextInt(1,100);
         System.out.println(number1 );
         System.out.println(number2 );
         System.out.println(number3);


         double number;
         number= random.nextDouble();
         System.out.println(number);

         boolean isHeads;

         isHeads = random.nextBoolean();

         if(isHeads){
             System.out.println("Heads");
         }
         else{
             System.out.println("tails");
         }
     }
}


package while_do_loops;
import java.util.Scanner;

public class Main {
     public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

         /*String name = "";
         while(name.isEmpty()){
             System.out.print("Enter your name: ");
             name = scanner.nextLine();
         }
         System.out.println("hello " + name);*/

        /* int age = 0;
         System.out.print("Enter your age " );
         age = scanner.nextInt();
        while (age < 0 )
        {
            System.out.println("your age can't be negative ");
            System.out.print("Enter your age " );
            age = scanner.nextInt();
        }
         System.out.println("You are " + age + "years old");*/

         // same in do-while loop

         int number = 0;
         //while(number < 1 || number > 10)
         do{
             System.out.println("Enter a number between 1- 10:  ");
             number = scanner.nextInt();
         }while(number < 1 || number > 10);
         System.out.println("You picked " + number);


         scanner.close();
     }
}

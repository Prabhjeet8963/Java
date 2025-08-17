package user_input_2;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){

          Scanner scanner = new Scanner(System.in);


          System.out.print("Enter your age: ");
          int age = scanner.nextInt();
          scanner.nextLine();

         System.out.println("Enter your favorite color");
         String color = scanner.nextLine();

         System.out.print("You are " + age + " years old ");
         System.out.print(",you like the color " + color);
            // this output is a common problem the terminal is reading \n as a string thus will put \n in the color variable
            // to takle this problem we use    scanner.nextLine(); and assign it to nothing       
          scanner.close();
     }
}

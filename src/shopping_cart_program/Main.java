package shopping_cart_program;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){

         // shopping cart program

         Scanner scanner = new Scanner(System.in);

         String item ;
         double price;
         int quantity;
         String currency ="$";
         double total;

         System.out.print("What item would you like to buy? ");
         item=scanner.nextLine();

         System.out.print("What is the price for each? ");
         price=scanner.nextDouble();

         System.out.print("How many would you like? ");
         quantity=scanner.nextInt();

        total = price * quantity;
         System.out.println("\n You have bought " + quantity + " " + item + "/s");
         System.out.println("Your total is " + currency + total );

         scanner.close();

     }
}

/*Output /Terminal
What item would you like to buy?: pizza
What is the price for each?:100
How many would you like?: 3

 You have bought 3 pizza/s
Your total is ₹300.0*/


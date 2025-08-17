package logical_operators;

//&& = And 
//|| = OR
//! = NOT 

import java.util.Scanner;

public class Main {
     public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

        /*double temp=-2;
        boolean isSunny = false;
        if(temp <=50 && temp >=30 && isSunny ){
            System.out.println("The weather is good!");
        }
        else if (temp <=50 && temp >=30 && !isSunny) {
            System.out.println("it is not sunny");
        }
        else if(temp >30 || temp <0){
            System.out.println("the weathear is Bad");
        }*/


         //username must be between 4 - 12 characters
         //must not contain space or underscores

         String username;

         System.out.println("Enter your username: ");
         username = scanner.nextLine();

         if(username.length()<4 || username.length() >12){
             System.out.println("Username must be between 4-12 characters ");
         } else if (username.contains(" ") || username.contains("_")) {
             System.out.println("Username must not contain spaces or underscores");
         }
         else{
             System.out.println("Welcome " + username);
         }
         scanner.close();
     }
}

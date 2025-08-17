package banking_program;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

     public static void main(String[] args) {
         //Java Basic Banking program
         //Declare variable
         double balance=0;
         boolean isRunning= true;
         int choice;

         // Display menu
         while(isRunning){
             System.out.println("Banking program");
             System.out.println();
             System.out.println("1 Show Balance.");
             System.out.println("2 Deposit.     ");
             System.out.println("3 Withdraw.    ");
             System.out.println("4 Exit.        ");

             System.out.print("Enter your choice (1-4): ");
             choice = scanner.nextInt();

             //Get and process users choice
             switch(choice){
                 case 1-> showBalance(balance);
                 case 2 -> balance += deposit();
                 case 3 -> balance -= withdraw(balance);
                 case 4-> isRunning = false;
                 default->System.out.println("\nInvalid Choice    \n ");
             }

         }
         //Exit message()
         System.out.println("Thank you , Have a nice day!! :)");

         scanner.close();
     }
    //showbalance()
     static void showBalance(double balance){
         System.out.println();
         System.out.printf("-> ₹%.2f\n\n", balance);
     }
    //deposit()
     static double deposit(){
         double amount;
         System.out.print("Enter an amount to be deposited: ");
         amount = scanner.nextDouble();

         if(amount < 0){
             System.out.println();
             System.out.println("-> Amount can't be negative ");
             System.out.println();
             return 0;
         }
         else{
             System.out.println();
             return amount;

         }
     }
    //withdraw()
    static double withdraw( double balance){
         double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println();
            System.out.println("-> INSUFFICIENT FUNDS");
            System.out.println();
            return 0 ;
        } else if (amount < 0) {
            System.out.println();
            System.out.println("-> Amount can't be negative");
            System.out.println();
            return 0;
        }
        else{
            System.out.println();
            return amount;
        }
    }

}

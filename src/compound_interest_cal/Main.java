package compound_interest_cal;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

         System.out.print("Enter the principal amount ");
         principal = scanner.nextDouble();

         System.out.print("Enter the interest rate (in %) " );
        rate = scanner.nextDouble() / 100;

         System.out.print("Enter the number of time compounded per year: ");
         timesCompounded= scanner.nextInt();

         System.out.print("Enter the number of year  ");
         years = scanner.nextInt();

         amount = principal * Math.pow(1 + rate / timesCompounded ,timesCompounded * years);

         System.out.printf("The amount after %d years is $%.2f ", years , amount);

         scanner.close();


     }
}

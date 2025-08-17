package ternary_operator;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

         //Ternary operator ? = Return 1 or 2 values if a condition is true
         //variable = (condition)? ifTrue : ifFalse;

         /*int score = 55;
         String passOrFail = (score >= 60)? "pass" : " Fail";
         System.out.println(passOrFail);*/

         /*int number = 4 ;
         String evenOrOdd = (number % 2== 0) ? "Even" : "Odd";
         System.out.println(evenOrOdd);*/

         /*int hours= 9;
         String timeOfDay = (hours < 12 ) ? "A.M" : " P.M";
         System.out.println(timeOfDay);*/

         int income = 30000;
         double taxRate = (income >= 40000) ? 0.25 : 0.15;
         System.out.println(taxRate);

         scanner.close();
     }
}

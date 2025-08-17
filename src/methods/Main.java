package methods;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         //method = a block of reusable code that is executable when called ()


         String name = "prabh";
         int age =40;
         String fullName = getFullName("Max","Verstappen");
         int AGE = 23;
         if(age_check(AGE)){
             System.out.println("you may sign up");
         }
         else{
             System.out.println("you must be 18+ to sign up ");
         }


         happyBirthday(name,age);
         System.out.println(square(3));
         System.out.println(cube(3));
         System.out.println(fullName);


         scanner.close();
     }
     static void happyBirthday(String name,int age){
         System.out.println("Happy birthday to you ");
         System.out.printf("happy birthday tu tu %s!!\n", name );
         System.out.printf("You are %d years old but,\n " , age);
         System.out.println("Happy birthday to you!!\n");

     }
     static double square( double number){
         return number * number;
     }
     static double cube(double number){
         return number*number*number;
     }
     static String getFullName(String first , String last){
         return first + " " + last;
     }
     static boolean age_check(int AGE){
         if(AGE>=18){
             return true;
         }
         else{
             return false;
         }
     }
}

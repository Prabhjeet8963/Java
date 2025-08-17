package array_2;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
     public static void main(String[] args) {

         //array = a collection of values of the same data type

         //Enter user input into an array

         //String[] foods = {};
         //System.out.println(foods.length); //output = 0
         //foods[0]="pizza";//exception error


         /*A better way to do this
         String[] foods = new String[3];//create an empty array and make 3 spaces
         foods[0]="pizza";
         foods[1]="kulcha";
         foods[2]="pindiChole";

         for(String food : foods){
         System.out.print(food+ "\n ");
         System.out.print(foods + " ");//basically gives out the memory address
          }*/


         //Taking user input of the elements
         //String[] foods = new String[3]; A fixed way to enter the size of array

         //More dynamic way
         String[] foods;
         int size;

         System.out.print("What # of food do you want?: ");
         size = scanner.nextInt();
         scanner.nextLine();//We are changin data type(int ->String ) and for the scanner to pick up a String after the int we use this

         foods = new String[size];

         for(int i=0 ; i< foods.length;i++){
             System.out.print("Enter a food: ");
             foods[i]=scanner.nextLine();
         }

         for(String food : foods){
             System.out.print(food+ " ");
         }

     scanner.close();
    }
}

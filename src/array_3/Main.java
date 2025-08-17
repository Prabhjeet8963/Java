package array_3;

import java.util.Scanner;

public class Main {
   
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         //array = a collection of values of the same data type
         //Searching through an array
         /*Static method
         String[] fruits = {"apple", "orange","bannana"};
         String target = "orange";
         boolean isFound= false;

         for (int i = 0; i< fruits.length;i++){
             if(fruits[i].equals(target) ){
                 System.out.println("Element found at index: "+ i);
                 isFound = true;
                 break;
             }
         }

         if(!isFound){
             System.out.println("Element not present in the array ");
         }*/

         //Dynamic method

         String[] fruits = {"apple", "orange","bannana"};
         boolean isFound= false;
         String target;

         System.out.print("Enter a fruit to search from: ");
         target = scanner.nextLine();


         for (int i = 0; i< fruits.length;i++){
             if(fruits[i].equals(target) ){
                 System.out.println("Element found at index: "+ i);
                 isFound = true;
                 break;
             }
         }

         if(!isFound){
             System.out.println("Element not present in the array ");
         }

        scanner.close();
    }
}

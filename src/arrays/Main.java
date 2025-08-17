package arrays;

import java.util.Arrays;
public class Main {


     public static void main(String[] args) {

         //array = a collection of values of the same data type

            String[] fruits = {"apple", "orange" , "banana", "pineapple"};

         System.out.println(fruits);
         //output:-  [Ljava.lang.String;@72ea2f77(memory address)
         //arrays are refrence  data type, accessing the name we get memory address

         System.out.println(fruits[3]);//using index would give out the element of the array


         fruits[0]= "apple";//by specifying the index the element could be replaced
         System.out.println(fruits[0]);
         int numOfFruits= fruits.length;//gives the length of an array,integer;
         System.out.println(numOfFruits);

         Arrays.sort(fruits);
         //printing each element of the array
         for(int i = 0; i < fruits.length; i++) {
             System.out.print(fruits[i] + " ");
         }
         System.out.println();


         Arrays.fill(fruits,"coconut");
         //Enhanced For loop (for each loop)
         for(String fruit : fruits) {
             System.out.print(fruit + " ");
         }
    }
}

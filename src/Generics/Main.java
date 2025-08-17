package Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       
         /* 
         Generics = A way to write classes, interfaces, or methods
         that can work with different data types without rewriting code.
         
         <T> = Type parameter a placeholder for the type (like a variable name for types)
         <String> = Type argument the actual type you pass when using the generic
         
         Type safety (compiler checks you use the right type)
         No need for type casting
         Reusable code for multiple types
         */

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        System.out.println(fruits);

        // Generic class example
        Box<String> box = new Box<>();
        box.setItem("banana");
        System.out.println(box.getItem());

        // Generic class with multiple type parameters
        Product<String, Double> product1 = new Product<>("apple", 0.50);
        Product<String, Integer> product2 = new Product<>("ticket", 15);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());
        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }   
}

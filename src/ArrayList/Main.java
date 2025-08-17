package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // ArrayList is a resizable array that stores objects (autoboxing).
        // Arrays are fixed in size, but ArrayLists can change.

        // ArrayList<Integer> list = new ArrayList<>();  // To store integers
        // ArrayList<Double> list = new ArrayList<>();   // To store doubles

        // list.add(3.14);
        // list.add(1.54);
        // list.add(5.60);
        // System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("mango");
        fruits.add("papaya");

        // fruits.remove(0);     // Remove by index
        // fruits.set(1, "Pineapple");   // Change value at index
        // System.out.println(fruits);      
        // System.out.println(fruits.get(2)); // Get value at index
        // System.out.println(fruits.size()); // Get size of the ArrayList

        Collections.sort(fruits);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits);
    }
}

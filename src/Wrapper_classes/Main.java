package Wrapper_classes;

public class Main {
    public static void main(String[] args) {

        // WRAPPER CLASSES IN JAVA
        // Java provides wrapper classes to convert primitive types into objects.
        // Useful when working with Collections (like ArrayList, HashMap), which only accept objects.

        // Older way of creating wrapper class objects (deprecated now)

        // Integer a = new Integer(123);
        // Double b = new Double(3.14);
        // Character c = new Character('$');
        // Boolean d = new Boolean(true);

        // Modern way using Autoboxing
        // Java automatically converts a primitive to its corresponding wrapper object.
        
        /*Integer a = 123; // int -> Integer
        Double b = 3.14; // double -> Double
        Character c = '@'; // char -> Character
        Boolean d = true; // boolean -> Boolean*/

        // Autoboxing Example:
        int num = 50;
        Integer numObject = num; // Autoboxing (primitive to object)
        System.out.println("Autoboxed Integer: " + numObject);

        // Unboxing: Java automatically converts wrapper object back to primitive
        
        /*int x = a; // Integer -> int
        double y = b; // Double -> double
        char z = c; // Character -> char
        boolean w = d; // Boolean -> boolean*/

        // Converting primitives to Strings
        
        String str1 = Integer.toString(123);
        String str2 = Double.toString(3.14);
        String str3 = Character.toString('@');
        String str4 = Boolean.toString(false);

        String combined = str1 + " " + str2 + " " + str3 + " " + str4;
        System.out.println("Combined String values: " + combined);

        // Converting Strings back to primitive values (Parsing)
       
        int parsedInt = Integer.parseInt("456");
        double parsedDouble = Double.parseDouble("6.28");
        char parsedChar = "Pizza".charAt(0); // Gets first character
        boolean parsedBool = Boolean.parseBoolean("true");

        System.out.println("Parsed values: " + parsedInt + ", " + parsedDouble + ", " + parsedChar + ", " + parsedBool);

        // Useful Character class methods
        
        char letter = 'B';

        System.out.println("Is '" + letter + "' a letter? " + Character.isLetter(letter));
        System.out.println("Is '" + letter + "' uppercase? " + Character.isUpperCase(letter));
        System.out.println("Lowercase version: " + Character.toLowerCase(letter));
    }
}

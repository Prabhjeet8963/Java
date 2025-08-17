package Composition;

public class Main {
    public static void main(String[] args) {
        
        // Composition = "has-a" or "part-of" relationship between objects
        // Example: A Car "has-an" Engine. The Engine is part of the Car.
        //          If the Car is destroyed, its Engine goes with it.

        Car car = new Car("Corvette", 2025, "V8");

        System.out.println(car.model);        // prints car model
        System.out.println(car.year);         // prints car year
        System.out.println(car.engine);       // prints Engine object's memory address
        
        
        System.out.println(car.engine.type);  // prints engine type

        car.start(); // starts the engine and prints car is running
    }
}

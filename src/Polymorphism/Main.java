package Polymorphism;

public class Main {
    public static void main(String[] args) {

        // Polymorphism = "many forms"
        // The ability of different classes to respond to the same method in their own way

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        // Each object has its own version of go()

        car.go();    
        bike.go();  
        boat.go();  

        // Storing them all as Vehicle type, in an array.

        Vehicle[] vehicles = {car, bike, boat};

        // Even though all are treated as Vehicle,
        // each still does its own go() action
        
        for (Vehicle vehicle : vehicles) {
            vehicle.go();  // Polymorphism in use
        }

        // This lets us write flexible and reusable code


    }
}

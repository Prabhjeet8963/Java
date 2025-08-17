package toString;

public class Main {
    public static void main(String[] args){
    //toString()


    Car car1 = new Car("Ford", "Mustang" , "Red", 2025 );
    Car car2 = new Car("Chevrolet" , "Corvette",   "Blue" , 2026);

    // Printing the car objects
        // This will call the toString() method inside the Car class
        // Without toString(), it would show weird stuff like Car@234f2a *Hash code
        // But since we wrote our own toString(), it prints nice details

        System.out.println(car1);  
        System.out.println(car2); 
        // toString() = makes object print nicely like a sentence
  }
}
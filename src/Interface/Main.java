package Interface;

public class Main {
    public static void main ( String[] args){
        
        // Interface = a blueprint for a class
        // It defines a list of abstract methods that must be implemented by the class
        // Helps define a specific behavior that multiple classes can share

        // Similar to abstract classes:
        // - Both can't be used to create objects directly
        // - Both can have abstract methods (methods without a body)
        // - Both help with abstraction (hide implementation, show behavior)

        // Differences:
        // - Interface can only have abstract methods (Java 7), no method bodies
        // - Abstract class can have both abstract and concrete methods
        // - A class can implement multiple interfaces (supports multiple inheritance-like behavior)
        // - A class can extend only one abstract class


        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk ();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
    
}

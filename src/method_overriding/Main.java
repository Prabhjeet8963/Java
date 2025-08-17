package method_overriding;

public class Main {

    // Overriding = child class replaces parent method with its own
    // Method name & parameters must match exactly
    // Happens when using inheritance (extends)
    // Java runs child version if overridden, else parent version


    public static void main(String[] args) {
       Dog dog = new  Dog();
       Cat cat = new Cat();
       Fish fish = new Fish();

       dog.move();
       cat.move();
       fish.move();
        
    }
    
}

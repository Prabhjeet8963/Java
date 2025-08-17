package Abstraction;

public class Main {
    public static void main (String[] args){

        // abstraction = hides how things work, shows only what’s needed
        // like using a TV remote ,  press buttons, don’t see the wiring

        // abstract class = can’t make objects from it directly
        // can have abstract methods (no code) → must be written by child classes
        // can also have normal methods → shared by child classes


        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(4, 6);
        Rectangle rectangle = new Rectangle(3,4);
        
        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println();
        //area() is abstract in the parent class, but defined in child classes
        
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    
        // So even though Shape class didn’t give area() logic,
        // each shape class gave its own — that’s abstraction 


    }
}

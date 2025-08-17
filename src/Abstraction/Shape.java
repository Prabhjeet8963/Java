package Abstraction;

public abstract class Shape {
    
    
    @SuppressWarnings("unused")
    abstract double area(); //ABSTRACT

     void display() {// Concrete method 
        System.out.println("This is a Shape");

     }
    
}

package Inheritance;

public class Main {
    public static void main(String[] args){


        //inheritance = one class inherits the attributes and the methods from another class
        //child <- Parent <- Grandparent


        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();


        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();
        plant.photosynthesis();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();



    }
    
}

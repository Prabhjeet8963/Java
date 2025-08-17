package method_overriding;

public class Fish extends Animal {
    
    @Override//General practice!
    void move(){
        System.out.println("This animal is swimming ");

    }
}

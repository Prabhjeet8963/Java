package anonymus_class;

public class Main {
    public static void main(String[] args) {

        // Anonymous class = A class without a name, created at the moment of use.
        // Cannot be reused; typically used for one-time custom behavior.
        // Commonly used for short-lived tasks (e.g., callbacks, Runnable, TimerTask).


        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby doo says ruh R00h!!");
            }
        };
    
        dog1.speak(); // Calls Dog's original speak() method
        dog2.speak(); // Calls the overridden speak() method in the anonymous class

    }
}

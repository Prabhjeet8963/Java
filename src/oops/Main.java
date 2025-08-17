package oops;

import java.util.Scanner;
public class Main {

    static Scanner scanner  = new Scanner(System.in);
     public static void main(String[] args) {

         // Object = An entity that holds data (attribute)
         //and can perform actions (methods),It is data type
         Car car1 = new Car();
         Car car2 = new Car();

         System.out.println(car1.make + " " + car1.model);
         System.out.println(car2.make + " " + car2.model);
        
         Car car = new Car();

         //car.isRunning = true; Changing the attribute

         System.out.println(car); // Memory location as output
         System.out.println(car.model);
         System.out.println(car.make);
         System.out.println(car.year);
         System.out.println(car.price);
         System.out.println(car.isRunning);


         //running somme method from different class
         System.out.println(car.isRunning);
         car.start();
         System.out.println(car.isRunning);
         car.stop();
         System.out.println(car.isRunning); 

         /*car.drive();
         car.brake();  calling different methods */


         scanner.close();
    }
}

package array_of_objects;

import java.util.Scanner;
public class Main {

    static Scanner scanner  = new Scanner(System.in);
     public static void main(String[] args) {

         //Method 1
         /*Car car1 = new Car("Mustang ","Red" );
         Car car2 = new Car("Corvette" , "Blue");
         Car car3 = new Car("Charger", "Yellow" );

         Car[] cars = {car1, car2 , car3};

         for(Car car: cars){
                car.drive();
         }*/

         //Method 2, anonymous objects
         
         /*Car[] cars = {new Car("Mustang", "Red"),
                       new Car("Corvette","Blue"),
                        new Car("Charger", "Yellow")};

         for(Car car: cars){
             car.drive();
         }*/

         //Changing thee color of the every Car

         Car[] cars = {new Car("Mustang", "Red"),
                 new Car("Corvette","Blue"),
                 new Car("Charger", "Yellow")};

         for(Car car: cars){
             car.color = "Black";
         }
         for(Car car : cars){
             car.drive();
         }

         scanner.close();
    }
}

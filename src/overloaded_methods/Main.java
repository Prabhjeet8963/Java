package overloaded_methods;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         //overload method = method that share the same name,but different parameters
         //signature = name + parameters

         //overloaded methods ex:-1
         System.out.println(add(1,2, 3));
         //overloaded methods ex:-2
          String pizza = bakePizza("flat bread", "mozzarella", " pepperoni");
         System.out.println(pizza);


         scanner.close();
     }
     //overloaded methods ex:-1
     static double add(double a , double b){
         return a+b;
     }
     static double add(double a , double b,double c ){
        return a+b+c;
    }

    //overloaded methods ex:-2
    static String bakePizza(String bread){
         return bread + " pizza";
    }
    static String bakePizza(String bread,String cheese){
        return cheese + " " +  bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping ){
        return topping + " " + cheese + " " +  bread + " pizza";

        
    }
    
}

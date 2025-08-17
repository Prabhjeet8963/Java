package math_lib_2;

// finding the hypotenuse
import java.util.Scanner;

public class Main {
     public static void main(String[] args){

         //hyppotenuse c = Math.sqrt(a²+b²)

         Scanner scanner = new Scanner(System.in);

         double a;
         double b;
         double c ;
         System.out.println("Enter the lenght of side a: ");
         a = scanner.nextDouble();

         System.out.println("Enter the lenght of side b: ");
         b = scanner.nextDouble();

         c= Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
         System.out.println("the hypothenus is "+ c + "cm");

         scanner.close();


     }
}



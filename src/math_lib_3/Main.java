package math_lib_3;

// area , circumference and volume of a circle 
import java.util.Scanner;

public class Main {
     public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

         double r;
         double a;
         double v ;
         double c;

         System.out.println("Enter the radius of circle: ");
         r = scanner.nextDouble();

         c= 2* Math.PI *r ;
         v= (4.0 /3.0 ) * Math.PI * Math.pow(r,3);
         a=Math.PI * Math.pow(r , 2);


         System.out.printf("the area of circle is : %.1fcmÂ²\n" ,  a);
         System.out.printf("the circumference is %.1fcm\n", c );
         System.out.printf("the volume of the circle is : %.1fcm\n",v );

         scanner.close();


     }
}

package constructor;

import java.util.Scanner;
public class Main {

    static Scanner scanner  = new Scanner(System.in);
     public static void main(String[] args) {
         
         // Constructors are special methods used to initialize objects.
        // They're automatically called when a new object is created.
        // You can pass parameters to set initial values.
        // Like methods, constructors require matching arguments if defined.
        // They help create objects with unique data.


         Student student1 = new Student("Spongebob" , 30 , 3.2);
         Student student2 = new Student("Patrick" , 34, 2.2);
         Student student3 = new Student ("Sandy" , 27, 4.0);

         /*System.out.println(student1.name);
         System.out.println(student1.age);
         System.out.println(student1.gpa);
         System.out.println(student1.isEnrolled);

         System.out.println(student2.name);
         System.out.println(student2.age);
         System.out.println(student2.gpa);
         System.out.println(student2.isEnrolled);


         System.out.println(student3.name);
         System.out.println(student3.age);
         System.out.println(student3.gpa);
         System.out.println(student3.isEnrolled);*/

         student1.study();
         student2.study();
         student3.study();



         scanner.close();
    }
}

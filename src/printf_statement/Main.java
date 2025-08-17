package printf_statement;

import java.util.Scanner;

public class Main {
     @SuppressWarnings("ConvertToTryWithResources")
     public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

         String name = "Verstappen";
         char firstletter ='M';
         int age = 25;
         double height = 60.5;
         boolean isEmployed = true;

         System.out.printf("Hello %s",name);
         System.out.printf("Your name Starts with a %c\n" , firstletter);
         System.out.printf("You are %d years old \n",age);
         System.out.printf("You are %f inches tall\n ",height);
         System.out.printf("Employed: %b\n", isEmployed);

         System.out.printf("%s is %d years old \n\n", name , age );

         //precision specific character

        double price1= 9000.99;
        double price2 = 100000.15;
        double price3 = -59000.14;

         System.out.printf("%,.2f\n ", price1);//%[.precision][specifier-character , f, c , s , d , b ]
         System.out.printf("%+.2f \n", price2);// output a plus = %+.1f
         System.out.printf("%(.2f \n", price3);// after every 3  0's =,
        // use '(' for moving every negative to ()
         // use ' '  space character to dis[play minus if negative and space if positive


         // Width
         //0= zero padding  = System.out.printf("%04d\n",  id1);

         int id1 = 1 ;
         int id2 = 23;
         int id3 = 456;
         int id4 = 7890;

         System.out.printf("%-4d\n",  id1);//negative number 
         System.out.printf("%-4d\n",  id2);
         System.out.printf("%4d\n",  id3);
         System.out.printf("%4d\n",  id4);

         scanner.close();


     }
}

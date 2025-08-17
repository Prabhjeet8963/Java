package switches;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter the day of the week ");
         String Day= scanner.nextLine().toLowerCase();

         switch(Day) {
             /*case "Monday" -> System.out.println("It is a weekday");
             case "Tuesday" -> System.out.println("it is a weekday");
             case "wednesday" -> System.out.println("It is a weekday");
             case "thursday" -> System.out.println("It is a weekday");
             case "Friday" -> System.out.println("It is a weekday");
             case "Saturday" -> System.out.println("It is the weekend");
             case "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(Day + "is not a day");
         }*/
             case "Monday", "tuesday", "wednesday", "thursday",
            "friday" -> System.out.println("it is a weekday");
             case "saturday", "sunday" -> System.out.println("It is the weekend");
             default -> System.out.println(Day + "is not a day");

         }
          scanner.close();
     }
}

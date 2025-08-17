package Enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  
        
        /*
         Enums(Enumerations) = A special kind of class that represents a fixed set
         of constants , they improve code readability and reliablity
         more efficient with switches than Strings.
         */
        
        try (Scanner scanner = new Scanner(System.in)) {
            /*
            Day day = Day.SUNDAY;
            To print Sunday(1) and the number of sunday(Enum constats)
            System.out.println(day);
            System.out.println(day.getDayNumber());//Using getter
            */
            
            System.out.println("Enter a day of week: ");
            String response = scanner.nextLine().toUpperCase();
            try {
                //to out put using a switch
                
                Day day = Day.valueOf(response);
                
                switch(day){
                    case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> System.out.println("It is a week day");
                    case SUNDAY,SATURDAY-> System.out.print("It is a weekend");
                    
                }}
            catch (IllegalArgumentException e) {
                System.out.println("Enter a valid day: ");
            }
}     }
}

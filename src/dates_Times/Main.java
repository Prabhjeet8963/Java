package dates_Times;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){

        // Working with dates and times in Java
        // LocalDate = date without time
        // LocalTime = time without date
        // LocalDateTime = date and time
        // Instant = UTC timestamp

        
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime =  LocalDateTime.now();
        Instant instant = Instant.now();//UTC timestamp

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);
        System.out.println();

        //custom format

       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy ");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        LocalDate date1 = LocalDate.of(2024 , 12 , 25);
        System.out.println(date1);
        System.out.println();

        //Comparing dateTime
        LocalDateTime dateTime1 =  LocalDateTime.of(2024 , 12 , 25 , 12 , 0, 0);
        LocalDateTime dateTime2 =  LocalDateTime.of(2025 , 07 , 8 , 12 , 0, 0);
        
        System.out.println(dateTime1);
        System.out.println(dateTime2);
        if(dateTime1.isBefore(dateTime2)){
            System.out.println(dateTime1 + " is earlier than " + dateTime2);
        }
        else if(dateTime1.isAfter(dateTime2)){
            System.out.println(dateTime1 + " is later than " + dateTime2);
        }
        else if(dateTime1.isEqual(dateTime2)){
             System.out.println(dateTime1 + " is equal to " + dateTime2);
        }
    }
}

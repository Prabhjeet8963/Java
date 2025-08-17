package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
            
        //Exception = an event that interrupts the normal flow of a program 
        //(Dividing by zero , file not found , mismatch input type )
        //Surround any dangerous code with a try{} block
        // try{} (dangerous code), catch{} (any exceptions), finally{} (optional and for clean up)

        
         try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        //InputMismatchException
        catch(InputMismatchException  e){
            System.out.println("That was not a number! ");
        }
        //ArithmeticException handling Example
        catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!! ");

        }
        //Saftey net
        catch(Exception e){
            System.out.println("Something went wrong! ");
        }

        //this will always execute at the end of the program 
        finally{
            System.out.println("Thsi will alays pop up! ");
        }
    }
    
}

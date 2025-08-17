package weight_conversion_program;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

         double weight;
         double newweight;
         int choice;

         System.out.println("weight conversion program ");
         System.out.println("1: Convert lbs to kgs");
         System.out.println("2: Convert kgs to lbs");

         System.out.println("Choose an option: ");
         choice = scanner.nextInt();

         if(choice == 1){
             System.out.print("Enter the weight in lbs");
             weight = scanner.nextDouble();

             newweight= weight * 0.453592;
             System.out.printf("The new weight in kgs is %.2f ", newweight );
         }
         else if(choice == 2){
             System.out.print("Enter the weight in kgs");
             weight = scanner.nextDouble();

             newweight= weight * 2.20462;
             System.out.printf("The new weight in lbs is %.2f ", newweight );
         }
         else {
             System.out.println("That was not a valid choice ");
         }

         scanner.close();
     }
}

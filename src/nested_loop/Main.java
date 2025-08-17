package nested_loop;

import java.util.Scanner;


public class Main {
     public static void main(String[] args)  {

         Scanner scanner = new Scanner(System.in);

         /*for(int j = 0;j<=2;j++){
         for(int i =1;i<=9 ;i++){
             System.out.print(i + " ");
         }
             System.out.println(" ");
         }*/

         int rows;
         int columns;
         char symbol;

         System.out.print("Enter the number of rows: ");
         rows = scanner.nextInt();

         System.out.print("Enter the number of columns");
         columns = scanner.nextInt();

         System.out.print("Enter the symbol to use: ");
         symbol=scanner.next().charAt(0);

         for(int i = 0 ; i< rows;i++){
             for(int j = 0; j< columns ; j++){
                 System.out.print(symbol);
             }
             System.out.println();
         }
         scanner.close();
     }
}

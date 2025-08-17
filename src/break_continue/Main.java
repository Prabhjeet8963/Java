package break_continue;

import java.util.Scanner;


public class Main {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         for(int i =0;i< 10;i++) {
             if (i == 5) {
                 continue;//to skip current iteration (skip)
             }
             if (i == 7) {
                 break;//to break  out of the loop (stop)
             }

             System.out.print(i + " ");
         }
         scanner.close();
     }
}

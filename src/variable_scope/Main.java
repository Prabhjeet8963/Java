package variable_scope;

import java.util.Scanner;

public class Main {

    static  int x = 3; //Class {global} variable
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         //variable scope = where variables can be accessed
        //if local variable is present it is dealt first 
         int x = 1; //local variable
         System.out.println(x);
         doSomething();

         scanner.close();
     }
     static void doSomething(){
         int x = 2;//local variable
         System.out.println(x);
     }
}

package threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       /*Threading = Allows a program to run multiple tasks simultaneously
        Helps improve performance with time-consuming operations
        (File I/O, network communications , or any background tasks)
        How to create a thread
        Extend the thread class (simpler)
        Implement the runnable interface (better)
         */

        try (Scanner scanner = new Scanner(System.in)) 
        {
            //Main thread
            MyRunnable myRunnable = new MyRunnable();
            Thread thread = new Thread(myRunnable);
            thread.setDaemon(true); //this will end as soon as the main is finished
            thread.start();
            
            
            System.out.println("You have 10 secs to Enter your name ");
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Hello " + name);
        }

    }
    
}

package countDown_timer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Main {
    public static void main(String[] args) {
        
        //Java COUNTDOWN TIMER PROGRAM

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of seconds to countdown from: ");
            int response = scanner.nextInt();

            Timer timer = new Timer();
             // TimerTask = the code that runs at each time interval
            TimerTask task = new TimerTask() {
                int count = response;
                
                @Override
                public void run(){
                    System.out.println(count);
                    count--;
                    if(count < 0){
                        System.out.println("Happy New Year!!");
                        timer.cancel(); // Stop the timer
                    }}
                };

            timer.scheduleAtFixedRate(task, 0, 1000);//Task , delay , period.
        }
    }
}

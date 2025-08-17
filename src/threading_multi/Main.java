package threading_multi;

public class Main {

    public static void main(String[] args) {
        //Multithrading = Enables a progra to run multiple threads concurrently 
    //(Thread = A set of instructions that run independently)
    //Useful for background tasks or time - consuming operations 

    /*MyRunnable myRunnable = new MyRunnable();
    Thread thread = new Thread(myRunnable);
    thread.start();*/
    
    //Another way to do this 

    Thread thread1 = new Thread(new MyRunnable("Ping"));
    Thread thread2 = new Thread(new MyRunnable("Pong"));

    System.out.println("Game Start!");

    thread1.start();
    thread2.start();

    //To make these to thread wait and finish with one another 
    try {
        thread1.join();
        thread2.join();

    } catch (InterruptedException e) {
        System.out.println("Mian thread was interrupted");
    }
    
    System.out.println("Game Over! ");
    }
}


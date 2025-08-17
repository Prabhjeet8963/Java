package threading_multi;

public class MyRunnable implements Runnable {

    private final String text;

    MyRunnable(String text){
        this.text= text;
    }

    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            try {
                Thread.sleep(1000);
                //to print the name of thread
                //System.out.println(Thread.currentThread().getName() +" " + i);
                System.out.println(text);
            } 
            catch (InterruptedException e) {
                System.out.println("Thread was interuppted ");
            }

        }
    }
    
}

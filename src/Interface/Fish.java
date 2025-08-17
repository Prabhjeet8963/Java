package Interface;

public class Fish implements Prey , Predetor {
    
    
    @Override
    public void flee (){
        System.out.println("*The fish is swimming away* ");
    }


    @Override 
    public void hunt(){
        System.out.println(" *The fish is hunting* ");
    }
    
}

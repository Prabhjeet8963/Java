package Getter_Setter;

public class Main {
    public static void main (String[] args) {
        //They help protect object data and add rules for accesing or modifying them 
        //getters = Methods that make a filed readable
        //setters =  Methods that malke a field writeable


        Car car = new Car("Charger" , " Yellow" , 2100000);


        //the simplest method , before private 
        //System.out.println(car.color + " " +  car.model + " " + car.price );
        //After private
        //System.out.println(car.getColor() + " " +  car.getModel() + " " + car.getPrice());

        //car.color= blue; this won't work because ( private String color;) this is private 
        //instead we use this
        
        //car.setModel("Corvette");
        car.setColor("Blue");
        car.setPrice(-190);
        System.out.println(car.getColor() + " " +  car.getModel() + " " + car.getPrice());

    }
}

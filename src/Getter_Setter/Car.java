package Getter_Setter;

public class Car {
    
    private final String model;
    private String color;
    private int price;

    Car(String model , String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;

    }
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "$" + this.price;
    }

    /*this could be writeable too by using setModel
    but let's just leave it just readable!
    void setModel(String model){
        this.model = model;
    }*/
    void setColor(String color){
        this.color= color;
    }

    void setPrice(int price){
        if (price < 0){
            System.out.println("price can't be less than zero ");
        }
        else{
            this.price = price;
        }
    }

}

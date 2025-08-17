package toString;

public class Car {
    String make;
    String model;
    String color;
    int year;

    Car(String make, String model,String color, int year ){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    @Override
    public String toString(){

        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
    
}

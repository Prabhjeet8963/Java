package Composition;

public class Car {
    String model;
    int year;
    Engine engine; // Engine is part of Car

    Car(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType); // creating Engine object inside Car
    }

    void start() {
        engine.start(); // start the engine
        System.out.println("The " + model + " is running");
    }
}

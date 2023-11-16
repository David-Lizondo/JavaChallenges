package model_interface;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void startEngine();
    public abstract void accelerate();
    public abstract void brake();

    public abstract void reportStatus();
   
}

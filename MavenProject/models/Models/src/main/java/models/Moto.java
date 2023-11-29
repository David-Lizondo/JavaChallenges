
package models;

public class Moto {

    private String make;
    private String model;
    private int year;

    // Constructor
    public Moto(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
        //Methods which can use in this class

    public void reportStatus() {
    System.out.println("Moto Make: " + make);
    System.out.println("Moto Model: " + model);
    System.out.println("Year: " + year);
}
    public void startEngine() {
        System.out.println("Starting the motorcycle's engine.");
    }

    public void accelerate() {
        System.out.println("Accelerating the motorcycle.");
    }

    public void brake() {
        System.out.println("Applying the brakes on the motorcycle.");
    }

    //Getter and Setter
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}

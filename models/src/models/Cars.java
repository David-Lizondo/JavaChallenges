package models;

public class Cars {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Cars(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void reportStatus() {
    System.out.println("Car Make: " + make);
    System.out.println("Car Model: " + model);
    System.out.println("Year: " + year);
}
    //Methods which can use in this class
    public void startEngine() {
        System.out.println("Starting the car's engine.");
    }

    public void accelerate() {
        System.out.println("Accelerating the car.");
    }

    public void brake() {
        System.out.println("Applying the brakes.");
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

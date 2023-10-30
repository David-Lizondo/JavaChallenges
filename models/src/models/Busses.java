package models;

public class Busses {
    // Attributes of the Busses class
    private String make;
    private String model;
    private int year;
    private boolean isLongDistance;
    private boolean isSchoolBus;
    private boolean isCityBus;
    private int seatingCapacity;
    private double fuelEfficiency;  // Real-world attribute

    // Constructor
    public Busses(String make, String model, int year, boolean isLongDistance, boolean isSchoolBus, boolean isCityBus, int seatingCapacity, double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isLongDistance = isLongDistance;
        this.isSchoolBus = isSchoolBus;
        this.isCityBus = isCityBus;
        this.seatingCapacity = seatingCapacity;
        this.fuelEfficiency = fuelEfficiency;
    }
   public void reportStatus() {
    System.out.println("Bus Make: " + make);
    System.out.println("Bus Model: " + model);
    System.out.println("Year: " + year);

    String busType = isLongDistance ? "Long-Distance Bus" : (isSchoolBus ? "School Bus" : (isCityBus ? "City Bus" : "Unknown"));
    System.out.println("Bus Type: " + busType);

    System.out.println("Seating Capacity: " + seatingCapacity);
    System.out.println("Fuel Efficiency: " + fuelEfficiency + " MPG");
}


   
        //Methods which can use in this class

    public void startEngine() {
        System.out.println("Starting the bus's engine.");
    }

    public void accelerate() {
        System.out.println("Accelerating the bus.");
    }

    public void brake() {
        System.out.println("Applying the brakes on the bus.");
    }

    public void honkHorn() {
        System.out.println("Honking the horn.");
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

    public boolean isIsLongDistance() {
        return isLongDistance;
    }

    public void setIsLongDistance(boolean isLongDistance) {
        this.isLongDistance = isLongDistance;
    }

    public boolean isIsSchoolBus() {
        return isSchoolBus;
    }

    public void setIsSchoolBus(boolean isSchoolBus) {
        this.isSchoolBus = isSchoolBus;
    }

    public boolean isIsCityBus() {
        return isCityBus;
    }

    public void setIsCityBus(boolean isCityBus) {
        this.isCityBus = isCityBus;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

}

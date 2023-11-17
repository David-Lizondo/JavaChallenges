package model_interface;

public class Busses extends Vehicle implements Drivable, Honkable {
    private boolean hornWorking;

    private boolean isLongDistance;
    private boolean isSchoolBus;
    private boolean isCityBus;
    private int seatingCapacity;
    private double fuelEfficiency;
   
    public Busses(String make, String model, int year, boolean isLongDistance, boolean isSchoolBus, boolean isCityBus, int seatingCapacity, double fuelEfficiency) {
    super(make, model, year);
    this.isLongDistance = isLongDistance;
    this.isSchoolBus = isSchoolBus;
    this.isCityBus = isCityBus;
    this.seatingCapacity = seatingCapacity;
    this.fuelEfficiency = fuelEfficiency;
}


     @Override
    public void startEngine() {
        System.out.println("Starting the bus's engine.");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the bus.");
    }

    @Override
    public void brake() {
        System.out.println("Applying the brakes on the bus.");
    }

    @Override
    public void reportStatus() {
        System.out.println("Bus Make: " + make);
        System.out.println("Bus Model: " + model);
        System.out.println("Year: " + year);
    }

    @Override
    public void drive() {
        System.out.println("Driving the bus.");
    }

    @Override
    public void honkHorn() {
        if (hornWorking) {
            System.out.println("Honking the bus's horn.");
        } else {
            System.out.println("The horn is not working.");
        }
    }

    @Override
    public boolean isHornWorking() {
        return hornWorking; // Returns the state of the horn
    }

    public void repairHorn() {
        // Method to repair the horn
        System.out.println("Repairing the bus's horn.");
        hornWorking = true;
    }

    public void breakHorn() {
        // Method to break the horn (for demonstration purposes only)
        System.out.println("Breaking the bus's horn.");
        hornWorking = false;
    }

    /**
     *
     * @param melody
     */
    @Override
    public void playMelody(String melody) {
        System.out.println("Playing melody: " + melody);
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

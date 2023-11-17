package modelpart2;

import java.util.Objects;

public class Busses extends Vehicle {
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
    
    /**
     *
     */
    @Override
    public void reportStatus() {
    System.out.println("Car Make: " + make);
    System.out.println("Car Model: " + model);
    System.out.println("Year: " + year);
}


    /**
     * 
     */
    @Override
    public void startEngine() {
        System.out.println("Starting the bus's engine.");
    }

    /**
     *
     */
    @Override
    public void accelerate() {
        System.out.println("Accelerating the bus.");
    }

    /**
     *
     */
    @Override
    public void brake() {
        System.out.println("Applying the brakes on the bus.");
    }

    public void honkHorn() {
        System.out.println("Honking the horn.");
    }

    @Override
    public String toString() {
        return "Bus Make: " + make + "\nBus Model: " + model + "\nYear: " + year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Busses otherBus = (Busses) obj;
        return year == otherBus.year && make.equals(otherBus.make) && model.equals(otherBus.model);
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

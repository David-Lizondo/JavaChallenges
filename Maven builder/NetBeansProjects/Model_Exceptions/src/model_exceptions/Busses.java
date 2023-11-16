package model_exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;
import model_exceptions.CustomExceptions.*;

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
    public void reportStatus() {
        System.out.println("Bus Make: " + make);
        System.out.println("Bus Model: " + model);
        System.out.println("Year: " + year);
    }

    @Override
    public void startEngine() {
        // Simulating a condition where engine start is unsuccessful
        boolean engineStartIssue = false;

        if (engineStartIssue) {
            try {
                throw new EngineStartException("Engine start failure in the bus.");
            } catch (EngineStartException ex) {
                Logger.getLogger(Busses.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("Starting the bus's engine.");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the bus.");
    }

    @Override
    public void brake() {
        // Example: Check if the brake fluid level is too low
        if (isBrakeFluidLow()) {
            try {
                throw new BrakeFailureException("Brake failure in the bus due to low brake fluid.");
            } catch (BrakeFailureException ex) {
                Logger.getLogger(Busses.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Applying the brakes on the bus.");
    }

    @Override
    public void drive() {
        System.out.println("Driving the bus.");
    }

    @Override
    public void honkHorn() {
        if (!hornWorking) {
            try {
                throw new HornMalfunctionException("The horn is not working.");
            } catch (HornMalfunctionException ex) {
                Logger.getLogger(Busses.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Honking the bus's horn.");
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

    @Override
    public void playMelody(String melody) {
        // You can add logic to determine if the melody is supported
        if (melody == null || melody.isEmpty()) {
            try {
                throw new MelodyNotSupportedException("Melody not supported in the bus.");
            } catch (MelodyNotSupportedException ex) {
                Logger.getLogger(Busses.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Playing melody: " + melody);
    }

    private boolean isBrakeFluidLow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

package model_collections;

import java.util.logging.Level;
import java.util.logging.Logger;
import model_collections.CustomExceptions.*;

public class Cars extends Vehicle implements Drivable, Honkable {

    private boolean hornWorking;

    public Cars(String make, String model, int year) {
        super(make, model, year);
        this.hornWorking = true; // Initially, we assume the horn is working.
    }

    @Override
    public void reportStatus() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
    }

    /**
     *
     * @throws EngineStartException
     */
    @Override
    public void startEngine() {
        // Simulating a condition where engine start is unsuccessful
        boolean engineStartIssue = false;

        if (engineStartIssue) {
            try {
                throw new EngineStartException("Engine start failure in the car.");
            } catch (EngineStartException ex) {  // Aquí corregimos la excepción a EngineStartException
                Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("Starting the car's engine.");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the car.");
    }

    /**
     *
     * @throws BrakeFailureException
     */
    @Override
    public void brake() {
        // Example: Check if the brake fluid level is too low
        if (isBrakeFluidLow()) {
            try {
                throw new BrakeFailureException("Brake failure in the car due to low brake fluid.");
            } catch (BrakeFailureException ex) {
                Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Applying the brakes on the car.");
    }

    @Override
    public void drive() {
        System.out.println("Driving the car.");
    }

    @Override
    public void honkHorn() {
        if (!hornWorking) {
            try {
                throw new HornMalfunctionException("The horn is not working.");
            } catch (HornMalfunctionException ex) {
                Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Honking the car's horn.");
    }

    @Override
    public boolean isHornWorking() {
        return hornWorking; // Returns the state of the horn
    }

    public void repairHorn() {
        // Method to repair the horn
        System.out.println("Repairing the car's horn.");
        hornWorking = true;
    }

    public void breakHorn() {
        // Method to break the horn (for demonstration purposes only)
        System.out.println("Breaking the car's horn.");
        hornWorking = false;
    }

    /**
     * @param melody
     * @throws model_exceptions.CustomExceptions.MelodyNotSupportedException
     */
    @Override
    public void playMelody(String melody) {
        // You can add logic to determine if the melody is supported
        if (melody == null || melody.isEmpty()) {
            try {
                throw new MelodyNotSupportedException("Melody not supported in the car.");
            } catch (MelodyNotSupportedException ex) {
                Logger.getLogger(Cars.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Playing melody: " + melody);
    }

    private boolean isBrakeFluidLow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

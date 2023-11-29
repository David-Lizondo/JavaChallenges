package vehicles;

import java.util.logging.Level;
import java.util.logging.Logger;
import model_exceptions.*;
import Interfaces.*;

public class Cars extends Vehicle implements Drivable, Honkable {
    private static final Logger LOGGER = Logger.getLogger(Cars.class.getName());

    private boolean hornWorking;

    public Cars(String make, String model, int year) {
        super(make, model, year);
        this.hornWorking = true; // Initially, we assume the horn is working.
    }

    @Override
    public void reportStatus() {
        LOGGER.log(Level.INFO, "Car Make: " + make);
        LOGGER.log(Level.INFO, "Car Model: " + model);
        LOGGER.log(Level.INFO, "Year: " + year);
    }

    @Override
    public void startEngine() {
        // Simulating a condition where engine start is unsuccessful
        boolean engineStartIssue = false;

        if (engineStartIssue) {
            try {
                throw new EngineStartException("Engine start failure in the car.");
            } catch (EngineStartException ex) {
                LOGGER.log(Level.SEVERE, "Error starting the engine", ex);
            }
        }

        LOGGER.log(Level.INFO, "Starting the car's engine.");
    }

    @Override
    public void accelerate() {
        LOGGER.log(Level.INFO, "Accelerating the car.");
    }

    @Override
    public void brake() {
        // Example: Check if the brake fluid level is too low
        if (isBrakeFluidLow()) {
            try {
                throw new BrakeFailureException("Brake failure in the car due to low brake fluid.");
            } catch (BrakeFailureException ex) {
                LOGGER.log(Level.SEVERE, "Brake failure", ex);
            }
        }
        LOGGER.log(Level.INFO, "Applying the brakes on the car.");
    }

    public void drive() {
        LOGGER.log(Level.INFO, "Driving the car.");
    }

    public void honkHorn() {
        if (!hornWorking) {
            try {
                throw new HornMalfunctionException("The horn is not working.");
            } catch (HornMalfunctionException ex) {
                LOGGER.log(Level.SEVERE, "Horn malfunction", ex);
            }
        }
        LOGGER.log(Level.INFO, "Honking the car's horn.");
    }

    public boolean isHornWorking() {
        return hornWorking; // Returns the state of the horn
    }

    public void repairHorn() {
        LOGGER.log(Level.INFO, "Repairing the car's horn.");
        hornWorking = true;
    }

    public void breakHorn() {
        LOGGER.log(Level.INFO, "Breaking the car's horn.");
        hornWorking = false;
    }

    public void playMelody(String melody) {
        // You can add logic to determine if the melody is supported
        if (melody == null || melody.isEmpty()) {
            try {
                throw new MelodyNotSupportedException("Melody not supported in the car.");
            } catch (MelodyNotSupportedException ex) {
                LOGGER.log(Level.SEVERE, "Melody not supported", ex);
            }
        }
        LOGGER.log(Level.INFO, "Playing melody: " + melody);
    }

    private boolean isBrakeFluidLow() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

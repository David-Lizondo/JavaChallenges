package vehicles;

import java.util.logging.Level;
import java.util.logging.Logger;
import model_exceptions.*;
import Interfaces.*;

public class ElectricCar extends Vehicle implements Drivable, Honkable, EngineInfo {
    private static final Logger LOGGER = Logger.getLogger(ElectricCar.class.getName());

    private String engineType;
    private final boolean isElectric; // Variable final

    public ElectricCar(String make, String model, int year, String engineType, boolean isElectric) {
        super(make, model, year);
        this.engineType = engineType;
        this.isElectric = isElectric;
    }

    @Override
    public void drive() {
        LOGGER.log(Level.INFO, "Driving the electric car.");
    }

    @Override
    public void honkHorn() {
        LOGGER.log(Level.INFO, "Honking the electric car's horn.");
    }

    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public void reportStatus() {
        LOGGER.log(Level.INFO, "Car Make: " + make);
        LOGGER.log(Level.INFO, "Car Model: " + model);
        LOGGER.log(Level.INFO, "Year: " + year);
        LOGGER.log(Level.INFO, "Engine Type: " + engineType);
        LOGGER.log(Level.INFO, "Is Electric: " + isElectric);
    }

    public final void chargeBattery() {
        LOGGER.log(Level.INFO, "Charging the electric car's battery.");
    }

    @Override
    public int getHorsepower() {
        return 300;
    }

    @Override
    public double getDisplacement() {
        return 0.0;
    }

    @Override
    public void startEngine() {
        // Simulating a condition where engine start is unsuccessful
        boolean engineStartIssue = false;

        if (engineStartIssue) {
            try {
                throw new EngineStartException("Engine start failure in the electric car.");
            } catch (EngineStartException ex) {
                LOGGER.log(Level.SEVERE, "Error starting the engine", ex);
            }
        }

        LOGGER.log(Level.INFO, "Starting the electric car's engine.");
    }

    @Override
    public void accelerate() {
        // TODO: Implement acceleration logic
        LOGGER.log(Level.INFO, "Accelerating the electric car.");
    }

    @Override
    public void brake() {
        // Example: Check if the brake fluid level is too low
        if (isBrakeFluidLow()) {
            try {
                throw new BrakeFailureException("Brake failure in the electric car due to low brake fluid.");
            } catch (BrakeFailureException ex) {
                LOGGER.log(Level.SEVERE, "Brake failure", ex);
            }
        }
        LOGGER.log(Level.INFO, "Applying the brakes on the electric car.");
    }

    @Override
    public void playMelody(String melody) {
        // TODO: Implement melody logic
        LOGGER.log(Level.INFO, "Playing melody: " + melody);
    }

    @Override
    public boolean isHornWorking() {
        // TODO: Implement horn working logic
        return true;
    }

    @Override
    public String getEngineNumber() {
        // TODO: Implement engine number logic
        return "12345";
    }

    private boolean isBrakeFluidLow() {
        // TODO: Implement brake fluid logic
        return false;
    }
}

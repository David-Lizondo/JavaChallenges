package collectionsPart2;

import java.util.logging.Level;
import java.util.logging.Logger;
import collectionsPart2.CustomExceptions.*;

public class Moto extends Vehicle implements Drivable, Honkable {

    private boolean hornWorking;

    public Moto(String make, String model, int year) {
        super(make, model, year);
        this.hornWorking = true; // Initially, we assume the horn is working.
    }

    @Override
    public void reportStatus() {
        System.out.println("Moto Make: " + make);
        System.out.println("Moto Model: " + model);
        System.out.println("Year: " + year);
    }

    @Override
    public void startEngine() {
        // Simulating a condition where engine start is unsuccessful
        boolean engineStartIssue = false;

        if (engineStartIssue) {
            try {
                throw new EngineStartException("Engine start failure in the motorcycle.");
            } catch (EngineStartException ex) {
                Logger.getLogger(Moto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println("Starting the motorcycle's engine.");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the motorcycle.");
    }

    @Override
    public void brake() {
        // Example: Check if the brake fluid level is too low
        if (isBrakeFluidLow()) {
            try {
                throw new BrakeFailureException("Brake failure in the motorcycle due to low brake fluid.");
            } catch (BrakeFailureException ex) {
                Logger.getLogger(Moto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Applying the brakes on the motorcycle.");
    }

    @Override
    public void drive() {
        System.out.println("Driving the motorcycle.");
    }

    @Override
    public void honkHorn() {
        if (!hornWorking) {
            try {
                throw new HornMalfunctionException("The horn is not working.");
            } catch (HornMalfunctionException ex) {
                Logger.getLogger(Moto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Honking the motorcycle's horn.");
    }

    @Override
    public boolean isHornWorking() {
        return hornWorking; // Returns the state of the horn
    }

    public void repairHorn() {
        // Method to repair the horn
        System.out.println("Repairing the motorcycle's horn.");
        hornWorking = true;
    }

    public void breakHorn() {
        // Method to break the horn (for demonstration purposes only)
        System.out.println("Breaking the motorcycle's horn.");
        hornWorking = false;
    }

    @Override
    public void playMelody(String melody) {
        // You can add logic to determine if the melody is supported
        if (melody == null || melody.isEmpty()) {
            try {
                throw new MelodyNotSupportedException("Melody not supported in the motorcycle.");
            } catch (MelodyNotSupportedException ex) {
                Logger.getLogger(Moto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Playing melody: " + melody);
    }

    private boolean isBrakeFluidLow() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

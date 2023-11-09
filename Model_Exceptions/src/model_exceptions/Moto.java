package model_exceptions;

import java.util.Objects;
import model_exceptions.CustomException;
        
public class Moto extends Vehicle implements Honkable {
    private boolean hornWorking;

    public Moto(String make, String model, int year) {
        super(make, model, year);
        this.hornWorking = true; // Initially, we assume the horn is working.
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle's engine.");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the motorcycle.");
    }

    @Override
    public void brake() {
        System.out.println("Applying the brakes on the motorcycle.");
    }

    @Override
    public void reportStatus() {
        System.out.println("Moto Make: " + make);
        System.out.println("Moto Model: " + model);
        System.out.println("Year: " + year);
    }

    @Override
    public void honkHorn() {
        if (hornWorking) {
            System.out.println("Honking the motorcycle's horn.");
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
        System.out.println("Repairing the motorcycle's horn.");
        hornWorking = true;
    }

    public void breakHorn() {
        // Method to break the horn 
        System.out.println("Breaking the motorcycle's horn.");
        hornWorking = false;
    }

    @Override
    public void playMelody(String melody) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

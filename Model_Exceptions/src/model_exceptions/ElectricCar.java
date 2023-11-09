package model_exceptions;
import model_exceptions.CustomException;
import model_exceptions.EngineStartException;

public class ElectricCar extends Vehicle implements Drivable, Honkable, EngineInfo {
    private String engineType;
    private final boolean isElectric; // Variable final
    private boolean startEngineConditionIsMet;
    private boolean someOtherConditionIsMet;

    public ElectricCar(String engineType, boolean isElectric, String make, String model, int year) {
        super(make, model, year);
        this.engineType = engineType;
        this.isElectric = isElectric;
    }

    
    @Override
    public void drive() {
        System.out.println("Driving the electric car.");
    }

    @Override
    public void honkHorn() {
        System.out.println("Honking the electric car's horn.");
    }

    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public void reportStatus() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Is Electric: " + isElectric);
    }

    public final void chargeBattery() throws CustomException {
        if (someOtherConditionIsMet) {
            throw new CustomException("Custom exception in ElectricCar: Charging condition is met.");
        }
        System.out.println("Charging the electric car's battery.");
    }

    /**
     *
     * @throws EngineStartException
     */
    @Override
     public void startEngine() throws EngineStartException {
        if (!startEngineConditionIsMet) {
            throw new EngineStartException("No se puede arrancar el motor debido a una condición no cumplida.");
        }

    public void playMelody(String melody) throws CustomException1 {
        if (playMelodyConditionIsMet) {
            throw new CustomException("Custom exception in ElectricCar: Play melody condition is met.");
        }
        System.out.println("Playing melody: " + melody);
    }

    @Override
    public int getHorsepower() {
        return 300;
    }

    @Override
    public double getDisplacement() {
        return 0.0;
    }

    /**
     *
     */
    @Override
    public void accelerate() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void brake() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param melody
     */
   
    @Override
    public boolean isHornWorking() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEngineNumber() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools | Templates.
    }

}

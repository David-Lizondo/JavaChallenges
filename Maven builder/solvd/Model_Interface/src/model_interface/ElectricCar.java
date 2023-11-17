
package model_interface;

public class ElectricCar extends Vehicle implements Drivable, Honkable, EngineInfo {
    private String engineType;
    private final boolean isElectric; // Variable final

    public ElectricCar(String make, String model, int year, String engineType, boolean isElectric) {
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

    public final void chargeBattery() {
        System.out.println("Charging the electric car's battery.");
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void accelerate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void brake() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void playMelody(String melody) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isHornWorking() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEngineNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

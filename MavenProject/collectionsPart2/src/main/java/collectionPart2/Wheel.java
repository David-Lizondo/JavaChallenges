package collectionsPart2;

public class Wheel implements WheelInfo {
    private int sizeInInches;
    private String tireBrand;
    private int pressureInPSI;
    private boolean isFlat;

    // Constructor
    public Wheel(int sizeInInches, String tireBrand, int pressureInPSI, boolean isFlat) {
        this.sizeInInches = sizeInInches;
        this.tireBrand = tireBrand;
        this.pressureInPSI = pressureInPSI;
        this.isFlat = isFlat;
       
    }
    
    /**
     *
     */
    @Override
    public void reportStatus() {
     System.out.println("Wheel Size: " + sizeInInches + " inches");
        System.out.println("Tire Brand: " + tireBrand);
        System.out.println("Pressure (PSI): " + pressureInPSI);
        System.out.println("Is Flat: " + isFlat);
    }

    // Getter and Setter

    public int getSizeInInches() {
        return sizeInInches;
    }

    public void setSizeInInches(int sizeInInches) {
        this.sizeInInches = sizeInInches;
    }

    public String getTireBrand() {
        return tireBrand;
    }

    public void setTireBrand(String tireBrand) {
        this.tireBrand = tireBrand;
    }

    public int getPressureInPSI() {
        return pressureInPSI;
    }

    public void setPressureInPSI(int pressureInPSI) {
        this.pressureInPSI = pressureInPSI;
    }

    public boolean isIsFlat() {
        return isFlat;
    }

    public void setIsFlat(boolean isFlat) {
        this.isFlat = isFlat;
    }
    
    /**
     *
     * @return
     */
    @Override
    public int getWheelCount() {
        return 4; // En un vehículo típico, hay cuatro ruedas.
    }
    
    // Implementation of methods from the WheelInfo interface

    @Override
    public void rotateWheels(int speed) {
        System.out.println("Rotating wheels at speed: " + speed + " RPM");
    }

    @Override
    public boolean areWheelsInflated() {
        return !isFlat; 
    }

  
    /**
     *
     * @return
     */
    @Override
    public String getWheelNumber() {
        return "Wheel number: " + hashCode();  // Ejemplo: Devuelve el número de rueda basado en el código hash
    }
}
    



package modelpart2;

public class Wheel {

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

    // Methods of the Wheel class
    public void inflate(int pressureToAdd) {
        pressureInPSI += pressureToAdd;
    }

    public void deflate(int pressureToReduce) {
        pressureInPSI -= pressureToReduce;
    }

    public void changeTire(String newTireBrand) {
        tireBrand = newTireBrand;
        isFlat = false;
    }

    public void reportStatus() {
        System.out.println("Wheel size: " + sizeInInches + " inches");
        System.out.println("Tire brand: " + tireBrand);
        System.out.println("Pressure: " + pressureInPSI + " PSI");
        if (isFlat) {
            System.out.println("Status: Flat");
        } else {
            System.out.println("Status: Inflated");
        }
    }

    //Getter and Setter
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
    
}

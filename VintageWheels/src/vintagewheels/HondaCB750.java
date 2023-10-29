
package vintagewheels;


public class HondaCB750 extends Vehicle {
    private int engineDisplacement; 
    private boolean isCafeRacer; 

    public HondaCB750(int horsepower, String color, int year, String countryOfOrigin,
                      int engineDisplacement, boolean isCafeRacer) {
        super("Honda CB750", horsepower, color, year, countryOfOrigin);
        this.engineDisplacement = engineDisplacement;
        this.isCafeRacer = isCafeRacer;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public boolean isCafeRacer() {
        return isCafeRacer;
    }

    public void setCafeRacer(boolean cafeRacer) {
        isCafeRacer = cafeRacer;
    }
}


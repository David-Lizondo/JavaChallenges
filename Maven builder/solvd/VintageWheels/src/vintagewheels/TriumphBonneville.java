
package vintagewheels;


public class TriumphBonneville extends Vehicle {
    private int engineDisplacement; 
    private boolean hasDualExhaust; 

    public TriumphBonneville(int horsepower, String color, int year, String countryOfOrigin,
                            int engineDisplacement, boolean hasDualExhaust) {
        super("Triumph Bonneville", horsepower, color, year, countryOfOrigin);
        this.engineDisplacement = engineDisplacement;
        this.hasDualExhaust = hasDualExhaust;
    }

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public boolean hasDualExhaust() {
        return hasDualExhaust;
    }

    public void setHasDualExhaust(boolean hasDualExhaust) {
        this.hasDualExhaust = hasDualExhaust;
    }
}

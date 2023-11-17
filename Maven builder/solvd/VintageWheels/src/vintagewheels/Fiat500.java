
package vintagewheels;

public class Fiat500 extends Vehicle {
    private double fuelEfficiency; 
    private boolean hasSunroof; 

    public Fiat500(int horsepower, String color, int year, String countryOfOrigin,
                   double fuelEfficiency, boolean hasSunroof) {
        super("Fiat 500", horsepower, color, year, countryOfOrigin);
        this.fuelEfficiency = fuelEfficiency;
        this.hasSunroof = hasSunroof;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public boolean hasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }
}


package vintagewheels;


public class VolkswagenBeetle extends Vehicle {
    private int fuelTankCapacity;
    private boolean hasSunroof;

    public VolkswagenBeetle(int horsepower, String color, int year, String countryOfOrigin,
                            int fuelTankCapacity, boolean hasSunroof) {
        super("Volkswagen Beetle", horsepower, color, year, countryOfOrigin);
        this.fuelTankCapacity = fuelTankCapacity;
        this.hasSunroof = hasSunroof;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public boolean hasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

}


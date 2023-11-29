
package vintagewheels;


public class JaguarEType extends Vehicle {
    private double topSpeed; 
    private boolean isConvertible; 

    public JaguarEType(int horsepower, String color, int year, String countryOfOrigin,
                       double topSpeed, boolean isConvertible) {
        super("Jaguar E-Type", horsepower, color, year, countryOfOrigin);
        this.topSpeed = topSpeed;
        this.isConvertible = isConvertible;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }
}

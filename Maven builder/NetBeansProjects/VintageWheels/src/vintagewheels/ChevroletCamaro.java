
package vintagewheels;


public class ChevroletCamaro extends Vehicle {
    private int torque; 
    private boolean isConvertible; 

    public ChevroletCamaro(int horsepower, String color, int year, String countryOfOrigin,
                            int torque, boolean isConvertible) {
        super("Chevrolet Camaro", horsepower, color, year, countryOfOrigin);
        this.torque = torque;
        this.isConvertible = isConvertible;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }
}

package vintagewheels;

public class Vespa125 extends Vehicle {
    private double engineDisplacement; // Cilindrada del motor en centímetros cúbicos (cc)
    private int topSpeed; // Velocidad máxima en km/h

    public Vespa125(double engineDisplacement, String color, int year, String countryOfOrigin, int topSpeed) {
        super("Vespa 125", 9, color, year, countryOfOrigin);
        this.engineDisplacement = engineDisplacement;
        this.topSpeed = topSpeed;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
    
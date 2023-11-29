package collectionsPart2;

public class Engine implements EngineInfo {
    private int cylinders;
    private double displacement;
    private int horsepower;

    // Constructor
    public Engine(int cylinders, double displacement, int horsepower) {
        this.cylinders = cylinders;
        this.displacement = displacement;
        this.horsepower = horsepower;
    }

    // Getter and Setter methods
    public int getCylinders() {
        return cylinders;
    }

    /**
     *
     * @return
     */
    @Override
    public double getDisplacement() {
        return displacement;
    }

    /**
     *
     * @return
     */
    @Override
    public int getHorsepower() {
        return horsepower;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    // Methods for reporting engine status
    public void reportStatus() {
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Displacement: " + displacement + "L");
        System.out.println("Horsepower: " + horsepower + " HP");
    }

    public void start() {
        System.out.println("Engine started.");
    }

    public void stop() {
        System.out.println("Engine stopped.");
    }

    // Implementation of methods from the EngineInfo interface
    @Override
    public String getEngineType() {
        return "Internal Combustion Engine"; // Example engine type
    }

    @Override
    public String getEngineNumber() {
        return "Engine number: " + hashCode();  // Ejemplo: Devuelve el número de motor basado en el código hash
    }

    
}

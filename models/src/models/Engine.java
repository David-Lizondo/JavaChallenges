package models;

public class Engine {

    private int cylinders;
    private double displacement;
    private int horsepower;

    // Constructor
    public Engine(int cylinders, double displacement, int horsepower) {
        this.cylinders = cylinders;
        this.displacement = displacement;
        this.horsepower = horsepower;
    }

    //Getter and Setter
    public int getCylinders() {
        return cylinders;
    }

    public double getDisplacement() {
        return displacement;
    }

    public int getHorsepower() {
        return horsepower;
    }

       //Methods which can use in this class
 
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

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }


}

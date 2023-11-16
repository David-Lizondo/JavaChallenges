package model_interface;

public class Cars extends Vehicle implements Drivable, Honkable {
    
    private boolean hornWorking;

    public Cars(String make, String model, int year) {
        super(make, model, year);
        this.hornWorking = true; // Initially, we assume the horn is working.
    }
     /**
     *
     */
    @Override
    public void reportStatus() {
    System.out.println("Car Make: " + make);
    System.out.println("Car Model: " + model);
    System.out.println("Year: " + year);
}

    @Override
    public void startEngine() {
        System.out.println("Starting the car's engine.");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the car.");
    }

    @Override
    public void brake() {
        System.out.println("Applying the brakes on the car.");
    }


    @Override
    public void drive() {
        System.out.println("Driving the car.");
    }

    @Override
    public void honkHorn() {
        if (hornWorking) {
            System.out.println("Honking the car's horn.");
        } else {
            System.out.println("The horn is not working.");
        }
    }

    @Override
    public boolean isHornWorking() {
        return hornWorking; // Returns the state of the horn
    }

    public void repairHorn() {
        // Method to repair the horn
        System.out.println("Repairing the car's horn.");
        hornWorking = true;
    }

    public void breakHorn() {
        // Method to break the horn (for demonstration purposes only?
        System.out.println("Breaking the car's horn.");
        hornWorking = false;
    }

    /**
     *
     * @param melody
     */
    @Override
    public void playMelody(String melody) {
        System.out.println("Playing melody: " + melody);
    }


}

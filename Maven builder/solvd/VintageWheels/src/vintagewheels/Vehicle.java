
package vintagewheels;


public class Vehicle {
    private String model;
    private int horsepower;
    private String color;
    private int year;
    private String countryOfOrigin;

    public Vehicle(String model, int horsepower, String color, int year, String countryOfOrigin) {
        this.model = model;
        this.horsepower = horsepower;
        this.color = color;
        this.year = year;
        this.countryOfOrigin = countryOfOrigin;
    }

    public void startEngine() {
        System.out.println("Starting the engine of the " + model);
    }

    public void accelerate() {
        System.out.println("Accelerating the " + model);
    }

    public void brake() {
        System.out.println("Applying brakes to the " + model);
    }

    public void turnOffEngine() {
        System.out.println("Turning off the engine of the " + model);
    }

    // Getters and setters for the attributes

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}



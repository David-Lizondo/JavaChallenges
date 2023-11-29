
package vintagewheels;


public class HarleyDavidsonSportster extends Vehicle {
    private String color;
    private int year;
    private int engineDisplacement;
    private int weight;
    private String fuelType;

    public HarleyDavidsonSportster(String color, int year, int engineDisplacement, int weight, String fuelType) {
        super("Harley-Davidson Sportster", 40, color, year, "United States");
        this.color = color;
        this.year = year;
        this.engineDisplacement = engineDisplacement;
        this.weight = weight;
        this.fuelType = fuelType;
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

    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}


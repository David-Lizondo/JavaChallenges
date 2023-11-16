package modelpart2;

import java.util.Objects;

public class Cars extends Vehicle {
    public Cars(String make, String model, int year) {
        super(make, model, year);
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

    /**
     *
     */
    @Override
    public void startEngine() {
        System.out.println("Starting the car's engine.");
    }

    /**
     *
     */
    @Override
    public void accelerate() {
        System.out.println("Accelerating the car.");
    }

    /**
     *
     */
    @Override
    public void brake() {
        System.out.println("Applying the brakes.");
    }

    @Override
    public String toString() {
        return "Car Make: " + make + "\nCar Model: " + model + "\nYear: " + year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Cars otherCar = (Cars) obj;
        return year == otherCar.year && make.equals(otherCar.make) && model.equals(otherCar.model);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}

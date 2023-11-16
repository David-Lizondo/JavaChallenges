package modelpart2;

import java.util.Objects;

public class Moto extends Vehicle {
    public Moto(String make, String model, int year) {
        super(make, model, year);
    }

    /**
     *
     */
    @Override
    public void reportStatus() {
    System.out.println("Moto Make: " + make);
    System.out.println("Moto Model: " + model);
    System.out.println("Year: " + year);
}

    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle's engine.");
    }

    /**
     *
     */
    @Override
    public void accelerate() {
        System.out.println("Accelerating the motorcycle.");
    }

    /**
     *
     */
    @Override
    public void brake() {
        System.out.println("Applying the brakes on the motorcycle.");
    }

    @Override
    public String toString() {
        return "Moto Make: " + make + "\nMoto Model: " + model + "\nYear: " + year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Moto otherMoto = (Moto) obj;
        return year == otherMoto.year && make.equals(otherMoto.make) && model.equals(otherMoto.model);
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

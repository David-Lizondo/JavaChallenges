package vehicles;

import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaces.DriverInfo;

public class Driver implements DriverInfo {
    private static final Logger LOGGER = Logger.getLogger(Driver.class.getName());

    private String name;
    private int age;
    private String licenseType;

    public Driver(String name, int age, String licenseType) {
        this.name = name;
        this.age = age;
        this.licenseType = licenseType;
    }

    public void drive() {
        LOGGER.log(Level.INFO, name + " is driving.");
    }

    public void honkHorn() {
        LOGGER.log(Level.INFO, name + " is honking the horn.");
    }

    @Override
    public void showDriverInfo() {
        LOGGER.log(Level.INFO, "Driver Name: " + name);
        LOGGER.log(Level.INFO, "Driver Age: " + age);
        LOGGER.log(Level.INFO, "License Type: " + licenseType);
    }

    // Getter and Setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    @Override
    public String getDriverName() {
        return name;
    }

    @Override
    public int getDriverAge() {
        return age;
    }
}

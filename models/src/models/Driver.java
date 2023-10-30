package models;

public class Driver {
    
    private String name;
    private int age;
    private String licenseType;

    
    public Driver(String name, int age, String licenseType) {
        this.name = name;
        this.age = age;
        this.licenseType = licenseType;
    }
        //Methods which can use in this class

    public void drive() {
        System.out.println(name + " is driving.");
    }

    public void honkHorn() {
        System.out.println(name + " is honking the horn.");
    }

    public void showDriverInfo() {
        System.out.println("Driver Name: " + name);
        System.out.println("Driver Age: " + age);
        System.out.println("License Type: " + licenseType);
    }

    //Getter and Setter
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

}

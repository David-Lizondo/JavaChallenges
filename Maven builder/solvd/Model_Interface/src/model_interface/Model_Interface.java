package model_interface;

public class Model_Interface {

    private static Iterable<WheelInfo> wheelInfos;
    private static Iterable<EngineInfo> engineInfos;

    public static void main(String[] args) {

        // Create objects of the classes and call the methods to see how they work
        // Driver
        DriverInfo driver1 = new Driver("John Smith", 30, "Class A");
        DriverInfo driver2 = new Driver("Jane Doe", 25, "Class B");
        DriverInfo driver3 = new Driver("Robert Johnson", 40, "Class C");
        DriverInfo driver4 = new Driver("Alice White", 28, "Class D");

        System.out.println("=== Driver 1 ===");
        System.out.println("");
        driver1.showDriverInfo();
        System.out.println("");

        System.out.println("=== Driver 2 ===");
        System.out.println("");
        driver2.showDriverInfo();
        System.out.println("");

        System.out.println("=== Driver 3 ===");
        System.out.println("");
        driver3.showDriverInfo();
        System.out.println("");

        System.out.println("=== Driver 4 ===");
        System.out.println("");
        driver4.showDriverInfo();
        System.out.println("");

        // Instantiate objects of the Cars class with reference to Vehicle
        Vehicle car1 = new Cars("Toyota", "Camry", 2023);
        Vehicle car2 = new Cars("Honda", "Civic", 2022);
        Vehicle car3 = new Cars("Ford", "Focus", 2021);

        System.out.println("=== Car 1 (Toyota) ===");
        System.out.println("");
        car1.reportStatus();
        car1.startEngine();
        System.out.println("");

        System.out.println("=== Car 2 (Honda) ===");
        System.out.println("");
        car2.reportStatus();
        car2.startEngine();
        System.out.println("");

        System.out.println("=== Car 3 (Ford) ===");
        System.out.println("");
        car3.reportStatus();
        car3.startEngine();
        System.out.println("");

        // Instantiate objects of the ElectricCar class
        ElectricCar electricCar1 = new ElectricCar("Tesla", "Model S", 2023, "Electric", true);
        ElectricCar electricCar2 = new ElectricCar("Nissan", "Leaf", 2022, "Electric", true);
        ElectricCar electricCar3 = new ElectricCar("Chevrolet", "Bolt", 2021, "Electric", true);

        System.out.println("=== E-Car 1 (Tesla) ===");
        System.out.println("");
        electricCar1.reportStatus();
        electricCar1.chargeBattery();
        System.out.println("");

        System.out.println("=== E-Car 2 (Nissan) ===");
        System.out.println("");
        electricCar2.reportStatus();
        electricCar2.chargeBattery();
        System.out.println("");

        System.out.println("=== E-Car 3 (Chevrolet) ===");
        System.out.println("");
        electricCar3.reportStatus();
        electricCar3.chargeBattery();
        System.out.println("");

        // Instantiate objects of the Busses class
        Vehicle bus1 = new Busses("Mercedes-Benz", "Sprinter", 2022, true, false, true, 20, 15.5);
        Vehicle bus2 = new Busses("Ford", "Transit", 2021, false, true, true, 30, 12.2);
        Vehicle bus3 = new Busses("Volkswagen", "Crafter", 2020, true, true, false, 15, 14.0);

        System.out.println("=== Bus 1 ===");
        System.out.println("");
        bus1.reportStatus();
        bus1.startEngine();
        System.out.println("");

        System.out.println("=== Bus 2 ===");
        System.out.println("");
        bus2.reportStatus();
        bus2.startEngine();
        System.out.println("");

        System.out.println("=== Bus 3 ===");
        System.out.println("");
        bus3.reportStatus();
        bus3.startEngine();
        System.out.println("");

        // Instantiate objects of the Moto class
        Vehicle moto1 = new Moto("Harley-Davidson", "Sportster", 2023);
        Vehicle moto2 = new Moto("Kawasaki", "Ninja", 2022);
        Vehicle moto3 = new Moto("Honda", "CBR", 2021);

        System.out.println("");
        System.out.println("Moto 1");
        moto1.reportStatus();
        System.out.println("");

        System.out.println("");
        System.out.println("Moto 2");
        moto2.reportStatus();
        System.out.println("");

        System.out.println("");
        System.out.println("Moto 3");
        moto3.reportStatus();
        System.out.println("");

        // WHEELS
        WheelInfo wheel1 = new Wheel(18, "Michelin", 32, false);
        WheelInfo wheel2 = new Wheel(17, "Bridgestone", 35, true);
        WheelInfo wheel3 = new Wheel(19, "Pirelli", 30, false);

        System.out.println("");
        System.out.println("Wheel 1");
        wheel1.reportStatus();
        System.out.println("");

        System.out.println("");
        System.out.println("Wheel 2");
        wheel2.reportStatus();
        System.out.println("");

        System.out.println("");
        System.out.println("Wheel 3");
        wheel3.reportStatus();
        System.out.println("");

        //ENGINE
        EngineInfo engine1 = new Engine(4, 2.0, 160);
        EngineInfo engine2 = new Engine(6, 3.5, 280);
        EngineInfo engine3 = new Engine(8, 5.0, 400);

        System.out.println("");
        System.out.println("Engine 1");
        engine1.reportStatus();
        System.out.println("");

        System.out.println("");
        System.out.println("Engine 2");
        engine2.reportStatus();
        System.out.println("");

        System.out.println("");
        System.out.println("Engine 3");
        engine3.reportStatus();
        System.out.println("");

        // Use polymorphism through interfaces
        Drivable[] drivables = {(Drivable) car1, (Drivable) car2, (Drivable) car3, (Drivable) electricCar1, (Drivable) electricCar2, (Drivable) electricCar3, (Drivable) bus1, (Drivable) bus2, (Drivable) bus3};
        Honkable[] honkables = {(Honkable) car1, (Honkable) car2, (Honkable) car3, (Honkable) electricCar1, (Honkable) electricCar2, (Honkable) electricCar3, (Honkable) bus1, (Honkable) bus2, (Honkable) bus3, (Honkable) moto1, (Honkable) moto2, (Honkable) moto3};
        DriverInfo[] driversInfo = {driver1, driver2, driver3, driver4};
        
        System.out.println("");
        System.out.println("Polymorphism with Drivable:");
        for (Drivable drivable : drivables) {
            drivable.drive();
        }
        System.out.println("");
        System.out.println("Polymorphism with Honkable:");
        for (Honkable honkable : honkables) {
            honkable.honkHorn();
        }
        
        System.out.println("");
        System.out.println("Polymorphism with DriverInfo:");
        for (DriverInfo driverInfo : driversInfo) {
            System.out.println("=== Driver Information ===");
            driverInfo.showDriverInfo();
            System.out.println("");
        }
        
       

        // Create a final class, method, and variable
        final int finalVariable = 42;

        // Create a static variable
        System.out.println("Static variable: " + StaticClass.staticVariable);

        // Call a static method
        StaticClass.staticMethod();
    }
}

final class StaticClass {

    static int staticVariable = 100;

    static void staticMethod() {
        System.out.println("");
        System.out.println("This is a static method.");
    }
}

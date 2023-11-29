package models;

public class Models{
    
    public static void main(String[] args) {
        // Create Driver objects
        Driver driver1 = new Driver("John Smith", 30, "Class A");
        Driver driver2 = new Driver("Jane Doe", 25, "Class B");
        Driver driver3 = new Driver("Robert Johnson", 40, "Class C");

        // Create Busses objects
        Busses bus1 = new Busses("Mercedes", "Sprinter", 2022, false, true, false, 30, 8.5);
        Busses bus2 = new Busses("Volvo", "XC90", 2023, true, false, false, 50, 7.2);
        Busses bus3 = new Busses("Ford", "Transit", 2021, true, false, false, 20, 6.8);

        // Create Cars objects
        Cars car1 = new Cars("Toyota", "Camry", 2022);
        Cars car2 = new Cars("Chevrolet", "Cruze", 2023);
        Cars car3 = new Cars("Honda", "Civic", 2022);
        Cars car4 = new Cars("Ford", "Mustang", 2023);

        // Create Moto objects
        Moto moto1 = new Moto("Harley-Davidson", "Sportster", 2021);
        Moto moto2 = new Moto("Kawasaki", "Ninja", 2022);
        Moto moto3 = new Moto("Yamaha", "MT-07", 2023);
        Moto moto4 = new Moto("Suzuki", "GSX-R1000", 2023);

        // Create Wheel objects
        Wheel wheel1 = new Wheel(18, "Michelin", 32, false);
        Wheel wheel2 = new Wheel(16, "Bridgestone", 30, true);

        // Create Engine objects
        Engine engine1 = new Engine(6, 3.5, 280);
        Engine engine2 = new Engine(4, 2.0, 180);

        // Demonstrate object actions and information
        System.out.println("Driver Information:");
        driver1.showDriverInfo();
        System.out.println("");
        driver2.showDriverInfo();
        System.out.println("");
        driver3.showDriverInfo();
        System.out.println("");

        System.out.println("\nBusses Information:");
        System.out.println("");
        bus1.reportStatus();
        System.out.println("");
        bus2.reportStatus();
        System.out.println("");
        bus3.reportStatus();
        System.out.println("");
        
        System.out.println("\nCars Information:");
        System.out.println("");
        car1.reportStatus();
        System.out.println("");
        car2.reportStatus();
        System.out.println("");
        car3.reportStatus();
        System.out.println("");
        car4.reportStatus();
        System.out.println("");

        System.out.println("\nMoto Information:");
        moto1.reportStatus();
        System.out.println("");
        moto2.reportStatus();
        System.out.println("");
        moto3.reportStatus();
        System.out.println("");
        moto4.reportStatus();
        System.out.println(""); 
        

        System.out.println("\nWheel Information:");
        System.out.println("");
        wheel1.reportStatus();
        wheel1.deflate(4);
        System.out.println("");
        wheel2.reportStatus();
        wheel2.changeTire("Goodyear");
        System.out.println("");

        System.out.println("\nEngine Information:");
        System.out.println("");
        engine1.reportStatus();
        System.out.println("");
        engine2.reportStatus();
    }
}

package modelpart2;

public class ModelPart2 {

    public static void main(String[] args) {
        // Crear objetos de las clases y llamar a los métodos para ver cómo funcionan

        // Driver
        Driver driver1 = new Driver("John Smith", 30, "Class A");
        Driver driver2 = new Driver("Jane Doe", 25, "Class B");
        Driver driver3 = new Driver("Robert Johnson", 40, "Class C");
        Driver driver4 = new Driver("Alice White", 28, "Class D");

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
        
        // Busses
        Vehicle bus1 = new Busses("Mercedes", "Sprinter", 2022, false, true, false, 30, 8.5);
        Vehicle bus2 = new Busses("Volvo", "XC90", 2023, true, false, false, 50, 7.2);
        Vehicle bus3 = new Busses("Ford", "Transit", 2021, true, false, false, 20, 6.8);

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

        // Cars (Tesla)
        Vehicle car1 = new Cars("Tesla", "Model S", 2022);
        Vehicle car2 = new Cars("Tesla", "Model 3", 2023);
        Vehicle car3 = new Cars("Tesla", "Model X", 2022);
        Vehicle car4 = new Cars("Tesla", "Model Y", 2023);
        Vehicle car5 = new Cars("Tesla", "Cybertruck", 2022);

        System.out.println("=== Car 1 (Tesla) ===");
        System.out.println("");
        car1.reportStatus();
        car1.startEngine();
        System.out.println("");

        System.out.println("=== Car 2 (Tesla) ===");
        System.out.println("");
        car2.reportStatus();
        car2.startEngine();
        System.out.println("");

        System.out.println("=== Car 3 (Tesla) ===");
        System.out.println("");
        car3.reportStatus();
        car3.startEngine();
        System.out.println("");

        System.out.println("=== Car 4 (Tesla) ===");
        System.out.println("");
        car4.reportStatus();
        car4.startEngine();
        System.out.println("");

        System.out.println("=== Car 5 (Tesla) ===");
        System.out.println("");
        car5.reportStatus();
        car5.startEngine();
        System.out.println("");

        // Moto
        Vehicle moto1 = new Moto("Harley-Davidson", "Sportster", 2021);
        Vehicle moto2 = new Moto("Kawasaki", "Ninja", 2022);
        Vehicle moto3 = new Moto("Yamaha", "MT-07", 2023);
        Vehicle moto4 = new Moto("Suzuki", "GSX-R1000", 2023);

        System.out.println("=== Moto 1 ===");
        System.out.println("");
        moto1.reportStatus();
        moto1.startEngine();

        System.out.println("=== Moto 2 ===");
        moto2.reportStatus();
        moto2.startEngine();
        System.out.println("");
        
        System.out.println("=== Moto 3 ===");
        System.out.println("");
        moto3.reportStatus();
        moto3.startEngine();
        System.out.println("");

        System.out.println("=== Moto 4 ===");
        System.out.println("");
        moto4.reportStatus();
        moto4.startEngine();
        System.out.println("");

        // Engine
        Engine engine1 = new Engine(6, 3.5, 280);
        Engine engine2 = new Engine(4, 2.0, 180);

        System.out.println("=== Engine 1 ===");
        System.out.println("");
        engine1.reportStatus();
        engine1.start();
        System.out.println("");

        System.out.println("=== Engine 2 ===");
        System.out.println("");
        engine2.reportStatus();
        engine2.start();
        System.out.println("");

        // Wheel
        Wheel wheel1 = new Wheel(18, "Michelin", 32, false);
        Wheel wheel2 = new Wheel(16, "Bridgestone", 30, true);

        System.out.println("=== Wheel 1 ===");
        System.out.println("");
        wheel1.reportStatus();
        System.out.println("");
        wheel1.deflate(4);
        System.out.println("");

        System.out.println("=== Wheel 2 ===");
        System.out.println("");
        wheel2.reportStatus();
        wheel2.inflate(2);
    }
}

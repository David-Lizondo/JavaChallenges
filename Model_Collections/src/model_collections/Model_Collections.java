package model_collections;



public class Model_Collections {

    public static void main(String[] args) {

       
        CustomLinkedList<Vehicle> vehicleList = new CustomLinkedList<>();
        CustomLinkedList<DriverInfo> driverList = new CustomLinkedList<>();
        CustomLinkedList<WheelInfo> wheelList = new CustomLinkedList<>();
        CustomLinkedList<EngineInfo> engineList = new CustomLinkedList<>();
        CustomLinkedList<Drivable> drivableList = new CustomLinkedList<>();

        
        Driver driver1 = new Driver("John Smith", 30, "Class A");
        Vehicle car1 = new Cars("Toyota", "Camry", 2023);
        Wheel wheel1 = new Wheel(18, "Michelin", 32, false);
        Engine engine1 = new Engine(4, 2.0, 160);
      
        driverList.add(driver1);
        vehicleList.add(car1);
        wheelList.add(wheel1);
        engineList.add(engine1);
        drivableList.add((Drivable) car1); // Se añade el carro a la lista de Drivable
       
        System.out.println("=== Driver List ===");
        for (DriverInfo driver : driverList) {
            System.out.println("--------------------------");
            driver.showDriverInfo();
            System.out.println("--------------------------");
        }

        System.out.println("=== Vehicle List ===");
        for (Vehicle vehicle : vehicleList) {
            System.out.println("--------------------------");
            vehicle.reportStatus();
            System.out.println("--------------------------");
        }

        System.out.println("=== Wheel List ===");
        for (WheelInfo wheel : wheelList) {
            System.out.println("--------------------------");
            wheel.reportStatus();
            System.out.println("--------------------------");
        }

        System.out.println("=== Engine List ===");
        for (EngineInfo engine : engineList) {
            System.out.println("--------------------------");
            engine.reportStatus();
            System.out.println("--------------------------");
        }

        System.out.println("=== Drivable List ===");
        for (Drivable drivable : drivableList) {
            System.out.println("--------------------------");
            drivable.drive();
            System.out.println("--------------------------");
        }
    }
}

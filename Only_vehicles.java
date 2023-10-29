
package only_vehicles;



public class Only_vehicles {
  
    public static void main(String[] args) {
        // Vehicles
        Vehicle vehicle = new Vehicle("Generic Vehicle", 2022, 25000.0, "Generic Manufacturer", true, "Blue");

        Car car = new Car("Family Car", 2022, 35000.0, "Car Manufacturer", true, "Red", 5, true);

        SportCar sportCar = new SportCar("Sports Car", 2022, 80000.0, "Sports Car Manufacturer", true, "Yellow", 2, true, 200.0, true);

        Ferrari ferrari = new Ferrari("Ferrari Model", 2022, 200000.0, "Ferrari", true, "Red", 2, true, 220.0, true, "Ferrari Series", false);

        Truck truck = new Truck("Truck Model", 2022, 45000.0, "Truck Manufacturer", true, "Green", 10000.0, true);

        SUV suv = new SUV("SUV Model", 2022, 40000.0, "SUV Manufacturer", true, "Silver", 7, true);

        // Motorcycle
        Motorcycle motorcycle = new Motorcycle("Motorcycle Model", 2022, 15000.0, "Motorcycle Manufacturer", true, "Black", true, 500, "Gasoline", true, true, true, true);

        ElectricBike electricBike = new ElectricBike("Electric Bike Model", 2022, 8000.0, "Electric Bike Manufacturer", true, "White", true, 250, "Electric", true, true, true, true, 100, true);

        // Ferrari Models
        FerrariF40 f40 = new FerrariF40("F40", 2022, 1000000.0, "Ferrari", true, "Red", 2, true, 240.0, true, "Classic", true, 123, "Limited Production");

        FerrariSF90 sf90 = new FerrariSF90("SF90 Stradale", 2022, 700000.0, "Ferrari", true, "Yellow", 2, false, 220.0, true, "High-Performance", true, true, "Hybrid Power");

        System.out.println("Vehicle Model: " + vehicle.getModel());
        System.out.println("Car Convertible: " + car.isConvertible());
        System.out.println("SportCar Top Speed: " + sportCar.getTopSpeed());
        System.out.println("Ferrari Series: " + ferrari.getSeries());
        System.out.println("Truck Cargo Capacity: " + truck.getCargoCapacity());
        System.out.println("SUV Seating Capacity: " + suv.getSeatingCapacity());
        System.out.println("Motorcycle Engine Displacement: " + motorcycle.getEngineDisplacement());
        System.out.println("Motorcycle Has Fairing: " + motorcycle.isHasFairing()); // Nuevo atributo
        System.out.println("ElectricBike Battery Range: " + electricBike.getBatteryRange());
        System.out.println("Ferrari F40 Production Number: " + f40.getProductionNumber());
        System.out.println("Ferrari SF90 Hybrid Powertrain: " + sf90.isHybridPowertrain());
    }
}

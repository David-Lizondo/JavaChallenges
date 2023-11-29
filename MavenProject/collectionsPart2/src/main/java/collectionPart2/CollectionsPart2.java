package collectionsPart2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.List;

public class CollectionsPart2 {

    public static void main(String[] args) {

        // Create custom collections with generics
        List<Vehicle> vehicleList = new ArrayList<>();
        List<DriverInfo> driverList = new ArrayList<>();
        List<WheelInfo> wheelList = new ArrayList<>();
        List<EngineInfo> engineList = new ArrayList<>();
        List<Drivable> drivableList = new ArrayList<>();

        // Create instances of the classes
        Driver driver1 = new Driver("John Smith", 30, "Class A");
        Drivable car1 = new Cars("Toyota", "Camry", 2023);
        WheelInfo wheel1 = new Wheel(18, "Michelin", 32, false);
        EngineInfo engine1 = new Engine(4, 2.0, 160);
        Drivable moto1 = new Moto("Honda", "CBR", 2023);

        // Add instances to the collections
        driverList.add(driver1);
        vehicleList.add((Vehicle) car1);
        wheelList.add(wheel1);
        engineList.add(engine1);
        drivableList.add(car1);
        drivableList.add(moto1);

        // Incorporate the use of standard collections
        CustomLinkedList<String> customList = new CustomLinkedList<>();
        customList.add("Element 1");
        customList.add("Element 2");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element 3");
        arrayList.add("Element 4");

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Element 5");
        hashSet.add("Element 6");

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Element 7");
        hashMap.put(2, "Element 8");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Element 9");
        treeSet.add("Element 10");

        // Add standard collections to custom collections directly
        for (String element : customList) {
            vehicleList.add(new Cars("Toyota", element, 2023));
        }

        for (String element : arrayList) {
            driverList.add(new Driver("John Doe", 25, "Class B"));
        }

        for (String element : hashSet) {
            wheelList.add(new Wheel(20, "Bridgestone", 40, false));
        }

        for (String key : hashMap.values()) {
            engineList.add(new Engine(8, 5.0, 300));
        }

        for (String element : treeSet) {
            drivableList.add(new Cars("Ford", "Focus", 2023));
        }

        // Display information from the collections
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

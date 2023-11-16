package collectionsPart2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.TreeSet;

public class CollectionsPart2 {

    public static void main(String[] args) {

        // Create custom collections with generics
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        ArrayList<DriverInfo> driverList = new ArrayList<>();
        ArrayList<WheelInfo> wheelList = new ArrayList<>();
        ArrayList<EngineInfo> engineList = new ArrayList<>();
        ArrayList<Drivable> drivableList = new ArrayList<>();

        // Create instances of the classes
        Driver driver1 = new Driver("John Smith", 30, "Class A");
        Vehicle car1 = new Cars("Toyota", "Camry", 2023);
        Wheel wheel1 = new Wheel(18, "Michelin", 32, false);
        Engine engine1 = new Engine(4, 2.0, 160);
        Moto moto1 = new Moto("Honda", "CBR", 2023);

        // Add instances to the collections
        driverList.add(driver1);
        vehicleList.add(car1);
        wheelList.add(wheel1);
        engineList.add(engine1);
        drivableList.add((Drivable) car1);
        drivableList.add(moto1);

        // Incorporate the use of standard collections
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1");
        arrayList.add("Element 2");

        ArrayList<Integer> linkedList = new ArrayList<>();
        linkedList.add(10);
        linkedList.add(20);

        HashSet<Double> hashSet = new HashSet<>();
        hashSet.add(3.14);
        hashSet.add(2.71);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Key1", 100);
        hashMap.put("Key2", 200);

        TreeSet<Character> treeSet = new TreeSet<>();
        treeSet.add('A');
        treeSet.add('B');

        // Add standard collections to custom collections directly
        for (String element : arrayList) {
            vehicleList.add(new Cars("Toyota", element, 2023));
        }

        for (Integer element : linkedList) {
            driverList.add(new Driver("John Doe", element, "Class B"));
        }

        for (Double element : hashSet) {
            wheelList.add(new Wheel(20, "Bridgestone", element.intValue(), false));
        }

        int index = 0;
        for (String key : hashMap.keySet()) {
            engineList.add(new Engine(6, 3.5, hashMap.get(key)));
            index++;
        }

        for (Character element : treeSet) {
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

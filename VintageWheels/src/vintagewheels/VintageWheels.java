
package vintagewheels;

public class VintageWheels {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle("Generic Vehicle", 200, "Red", 2020, "Unknown");

        HarleyDavidsonSportster harleyDavidson = new HarleyDavidsonSportster("Black", 1957, 883, 520, "Gasoline");
       
        FordMustang fordMustang = new FordMustang(450, "Blue", 2022, "United States");
        
        VolkswagenBeetle beetle = new VolkswagenBeetle(150, "Blue", 2021, "Germany", 55, true);
        
        JaguarEType jaguar = new JaguarEType(300, "Red", 1965, "United Kingdom", 150, true);
        
        ChevroletCamaro camaro = new ChevroletCamaro(455, "Red", 2022, "United States", 455, true);
        
        Fiat500 fiat500 = new Fiat500(100, "Blue", 2022, "Italy", 30.5, true);
        
        HondaCB750 cb750 = new HondaCB750(70, "Black", 1970, "Japan", 736, true);

        BMWR75_5 bmwR75_5 = new BMWR75_5(50, "Black", 1973, "Germany", 745, true);
        
        TriumphBonneville bonneville = new TriumphBonneville(65, "Blue/White", 1971, "United Kingdom", 650, true);

        Vespa125 vespa = new Vespa125(123, "White", 1972, "Italy", 85);
        
        System.out.println("All you want to know about your favorite VintageWheels.");
        System.out.println("");
        System.out.println("Vespa 125:");
        System.out.println("");
        System.out.println("Model: " + vespa.getModel());
        System.out.println("Horsepower: " + vespa.getHorsepower() + " hp");
        System.out.println("Color: " + vespa.getColor());
        System.out.println("Year: " + vespa.getYear());
        System.out.println("Country of Origin: " + vespa.getCountryOfOrigin());
        System.out.println("Engine Displacement: " + vespa.getEngineDisplacement() + " cc");
        System.out.println("Top Speed: " + vespa.getTopSpeed() + " km/h");
        System.out.println(""
                + "");
        System.out.println("Triumph Bonneville:");
        System.out.println("");
        System.out.println("Model: " + bonneville.getModel());
        System.out.println("Horsepower: " + bonneville.getHorsepower() + " hp");
        System.out.println("Color: " + bonneville.getColor());
        System.out.println("Year: " + bonneville.getYear());
        System.out.println("Country of Origin: " + bonneville.getCountryOfOrigin());
        System.out.println("Engine Displacement: " + bonneville.getEngineDisplacement() + " cc");
        System.out.println("Has Dual Exhaust: " + (bonneville.hasDualExhaust() ? "Yes" : "No"));
        System.out.println("");
        
        System.out.println("BMW R75/5:");
        System.out.println("");
        System.out.println("Model: " + bmwR75_5.getModel());
        System.out.println("Horsepower: " + bmwR75_5.getHorsepower() + " hp");
        System.out.println("Color: " + bmwR75_5.getColor());
        System.out.println("Year: " + bmwR75_5.getYear());
        System.out.println("Country of Origin: " + bmwR75_5.getCountryOfOrigin());
        System.out.println("Displacement: " + bmwR75_5.getDisplacement() + " cc");
        System.out.println("Has Sidecar: " + (bmwR75_5.hasSidecar() ? "Yes" : "No"));
        System.out.println("");
        
        System.out.println("Honda CB750:");
        System.out.println("");
        System.out.println("Model: " + cb750.getModel());
        System.out.println("Horsepower: " + cb750.getHorsepower() + " hp");
        System.out.println("Color: " + cb750.getColor());
        System.out.println("Year: " + cb750.getYear());
        System.out.println("Country of Origin: " + cb750.getCountryOfOrigin());
        System.out.println("Engine Displacement: " + cb750.getEngineDisplacement() + " cc");
        System.out.println("Is Cafe Racer: " + (cb750.isCafeRacer() ? "Yes" : "No"));
        System.out.println("");
        
        System.out.println("Fiat 500:");
        System.out.println("");
        System.out.println("Model: " + fiat500.getModel());
        System.out.println("Horsepower: " + fiat500.getHorsepower() + " hp");
        System.out.println("Color: " + fiat500.getColor());
        System.out.println("Year: " + fiat500.getYear());
        System.out.println("Country of Origin: " + fiat500.getCountryOfOrigin());
        System.out.println("Fuel Efficiency: " + fiat500.getFuelEfficiency() + " mpg");
        System.out.println("Has Sunroof: " + (fiat500.hasSunroof() ? "Yes" : "No"));
        System.out.println("");
        
        System.out.println("Chevrolet Camaro:");
        System.out.println("");
        System.out.println("Model: " + camaro.getModel());
        System.out.println("Horsepower: " + camaro.getHorsepower() + " hp");
        System.out.println("Color: " + camaro.getColor());
        System.out.println("Year: " + camaro.getYear());
        System.out.println("Country of Origin: " + camaro.getCountryOfOrigin());
        System.out.println("Torque: " + camaro.getTorque() + " lb-ft");
        System.out.println("Convertible: " + (camaro.isConvertible() ? "Yes" : "No"));
        System.out.println("");
        
        System.out.println("Jaguar E-Type:");
        System.out.println("");
        System.out.println("Model: " + jaguar.getModel());
        System.out.println("Horsepower: " + jaguar.getHorsepower() + " hp");
        System.out.println("Color: " + jaguar.getColor());
        System.out.println("Year: " + jaguar.getYear());
        System.out.println("Country of Origin: " + jaguar.getCountryOfOrigin());
        System.out.println("Top Speed: " + jaguar.getTopSpeed() + " mph");
        System.out.println("Convertible: " + (jaguar.isConvertible() ? "Yes" : "No"));
        System.out.println("");
        
        System.out.println("Volkswagen Beetle:");
        System.out.println("");
        System.out.println("Model: " + beetle.getModel());
        System.out.println("Horsepower: " + beetle.getHorsepower() + " hp");
        System.out.println("Color: " + beetle.getColor());
        System.out.println("Year: " + beetle.getYear());
        System.out.println("Country of Origin: " + beetle.getCountryOfOrigin());
        System.out.println("Fuel Tank Capacity: " + beetle.getFuelTankCapacity() + " liters");
        System.out.println("Has Sunroof: " + (beetle.hasSunroof() ? "Yes" : "No"));
        System.out.println("");
        
        System.out.println("Ford Mustang:");
        System.out.println("");
        System.out.println("Model: " + fordMustang.getModel());
        System.out.println("Horsepower: " + fordMustang.getHorsepower() + " hp");
        System.out.println("Color: " + fordMustang.getColor());
        System.out.println("Year: " + fordMustang.getYear());
        System.out.println("Country of Origin: " + fordMustang.getCountryOfOrigin());
        System.out.println("");
        
        System.out.println("Harley-Davidson Sportster:");
        System.out.println("");
        System.out.println("Model: " + harleyDavidson.getModel());
        System.out.println("Color: " + harleyDavidson.getColor());
        System.out.println("Year: " + harleyDavidson.getYear());
        System.out.println("Engine Displacement: " + harleyDavidson.getEngineDisplacement() + " cc");
        System.out.println("Weight: " + harleyDavidson.getWeight() + " kg");
        System.out.println("Fuel Type: " + harleyDavidson.getFuelType());
        System.out.println("Country of Origin: " + harleyDavidson.getCountryOfOrigin());

       
    }
}

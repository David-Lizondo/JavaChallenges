
package vintagewheels;

public class BMWR75_5 extends Vehicle {
    private int displacement; 
    private boolean hasSidecar; 

    public BMWR75_5(int horsepower, String color, int year, String countryOfOrigin,
                    int displacement, boolean hasSidecar) {
        super("BMW R75/5", horsepower, color, year, countryOfOrigin);
        this.displacement = displacement;
        this.hasSidecar = hasSidecar;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}


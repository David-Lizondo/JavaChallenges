package collectionsPart2;

import collectionsPart2.CustomExceptions.*;

public interface Drivable {
 
    void startEngine() throws EngineStartException; 
    void accelerate();
    void brake() throws BrakeFailureException; 
    void drive();
}

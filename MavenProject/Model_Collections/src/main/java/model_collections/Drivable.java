package model_collections;

import model_collections.CustomExceptions.*;

public interface Drivable {
 
    void startEngine() throws EngineStartException; 
    void accelerate();
    void brake() throws BrakeFailureException; 
    void drive();
}

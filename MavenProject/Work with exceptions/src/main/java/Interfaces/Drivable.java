package Interfaces;

import model_exceptions.*;

public interface Drivable {
 
    void startEngine() throws EngineStartException; 
    void accelerate();
    void brake() throws BrakeFailureException; 
    void drive();
}

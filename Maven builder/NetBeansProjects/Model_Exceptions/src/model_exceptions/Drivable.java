package model_exceptions;

import model_exceptions.CustomExceptions.*;

public interface Drivable {
 
    void startEngine() throws EngineStartException; 
    void accelerate();
    void brake() throws BrakeFailureException; 
    void drive();
}

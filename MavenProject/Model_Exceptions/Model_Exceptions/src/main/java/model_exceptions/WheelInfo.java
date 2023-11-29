package model_exceptions;

public interface WheelInfo {
    
    int getWheelCount();
    
    void rotateWheels(int speed);
    
    boolean areWheelsInflated();
    
    void reportStatus();
    
    String getWheelNumber();  
}

package model_collections;

public interface WheelInfo {
    
    int getWheelCount();
    
    void rotateWheels(int speed);
    
    boolean areWheelsInflated();
    
    void reportStatus();
    
    String getWheelNumber();  
}

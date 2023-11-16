package collectionsPart2;

public interface EngineInfo {
    
    String getEngineType();
    
    int getHorsepower();
    
    double getDisplacement();
    
    void reportStatus();
    
    String getEngineNumber();  // Cambié el tipo de retorno a String
    
}

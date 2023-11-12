package collectionsPart2;

public class CustomExceptions {

    public static class HornMalfunctionException extends Exception {
        public HornMalfunctionException(String message) {
            super(message);
        }
    }

    public static class EngineStartException extends Exception {
        public EngineStartException(String message) {
            super(message);
        }
    }

    public static class BrakeFailureException extends Exception {
        public BrakeFailureException(String message) {
            super(message);
        }
    }

    public static class MelodyNotSupportedException extends Exception {
        public MelodyNotSupportedException(String message) {
            super(message);
        }
    }

    public static class FuelEfficiencyException extends Exception {
        public FuelEfficiencyException(String message) {
            super(message);
        }
    }
}

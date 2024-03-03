package excepciones;

public class FormularioException extends Exception {
    public FormularioException() {
        super();
    }

    public FormularioException(String message) {
        super(message);
    }

    public FormularioException(String message, Throwable cause) {
        super(message, cause);
    }

    public FormularioException(Throwable cause) {
        super(cause);
    }
}

package exceptions;

public class DegreeProgramNotFoundException extends RuntimeException {
    public DegreeProgramNotFoundException() {
        super("La carrera buscada no existe");
    }

    public DegreeProgramNotFoundException(String message) {
        super(message);
    }

    public DegreeProgramNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

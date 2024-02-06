package exceptions;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException() {
        super("El estudiante no ha sido encontrado");
    }

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

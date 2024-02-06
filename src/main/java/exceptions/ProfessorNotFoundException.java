package exceptions;

public class ProfessorNotFoundException extends RuntimeException {
    public ProfessorNotFoundException() {
        super("El profesor no ha sido encontrado");
    }

    public ProfessorNotFoundException(String message) {
        super(message);
    }

    public ProfessorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

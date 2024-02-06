package exceptions;

public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException() {
        super("El curso no ha sido encontrado");
    }

    public CourseNotFoundException(String message) {
        super(message);
    }

    public CourseNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

package exceptions;

public class BranchNotFoundException extends RuntimeException {
    public BranchNotFoundException() {
        super("La sucursal no ha sido encontrada");
    }

    public BranchNotFoundException(String message) {
        super(message);
    }

    public BranchNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

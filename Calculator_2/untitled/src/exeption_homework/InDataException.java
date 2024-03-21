package exeption_homework;

public class InDataException extends Exception {
    public InDataException() {
    }

    public InDataException(String message) {
        super(message);
    }

    public InDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public InDataException(Throwable cause) {
        super(cause);
    }

    public InDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

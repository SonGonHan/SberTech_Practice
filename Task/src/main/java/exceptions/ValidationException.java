package exceptions;

import java.io.IOException;

public class ValidationException extends IOException {

    public ValidationException() {
        super("Validation failed");
    }

}

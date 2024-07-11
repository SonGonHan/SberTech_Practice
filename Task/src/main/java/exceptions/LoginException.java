package exceptions;

import java.io.IOException;

public class LoginException extends IOException {

    public LoginException() {
        super("Incorrected login");
    }

}

package exceptions;

import java.io.IOException;

public class BankOnlineException extends IOException {

    public BankOnlineException() {
        super();
    }

    public BankOnlineException(String message) {
        super(message);
    }

}

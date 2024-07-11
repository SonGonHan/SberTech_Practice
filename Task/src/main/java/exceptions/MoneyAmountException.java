package exceptions;

import java.io.IOException;

public class MoneyAmountException extends IOException {

    public MoneyAmountException() {
        super("Incorrect money amount");
    }
}

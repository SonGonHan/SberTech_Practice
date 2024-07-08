package Exceptions;

public class ExceededLimitException extends BankOnlineException {

    public ExceededLimitException() {
        super("Превышение лимита");
    }
}

package exceptions;

public class ArgumentIsNullException extends BankOnlineException {

    public ArgumentIsNullException() {
        super("Один из аргументов равен null");
    }
}

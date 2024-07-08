package Exceptions;

public class InvalidCardNumberException extends BankOnlineException {

    public InvalidCardNumberException() {
        super("Неправильно введен номер карты");
    }


}

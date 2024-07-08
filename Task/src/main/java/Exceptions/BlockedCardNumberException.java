package Exceptions;

public class BlockedCardNumberException extends BankOnlineException {

    public BlockedCardNumberException() {
        super("Номер карты заблокирован");
    }
}

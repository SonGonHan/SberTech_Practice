package Exceptions;

public class NegativeTransferAmountException extends BankOnlineException {

    public NegativeTransferAmountException() {
        super("Отрицательная сумма перевода");
    }
}

package exceptions;

public class NegativeTransferAmountException extends BankOnlineException {

    public NegativeTransferAmountException() {
        super("Отрицательная сумма перевода");
    }
}

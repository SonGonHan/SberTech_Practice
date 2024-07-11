package services.serviceWork;

import services.serviceValidation.MoneyTransferValidation;

import exceptions.MoneyAmountException;

public class MoneyTransferWork implements Work {

    MoneyTransferValidation mts = new MoneyTransferValidation();
    final Integer moneyAmount;

    public MoneyTransferWork(Integer moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    @Override
    public void work() throws MoneyAmountException {
        if (!mts.requestValidation(moneyAmount)) {
            throw new MoneyAmountException();
        }
        System.out.println("Сумма денег введена корректно");
        if (!mts.responseValidation(moneyAmount)) {
            throw new MoneyAmountException();
        }
        System.out.println("Перевод прошел успешно");
    }
}

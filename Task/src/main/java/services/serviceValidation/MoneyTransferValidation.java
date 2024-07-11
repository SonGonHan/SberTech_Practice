package services.serviceValidation;

public class MoneyTransferValidation implements Validation<Integer> {
    
    private static final Integer LIMIT = 50000;
    
    @Override
    public boolean requestValidation(Integer moneyAmount) {
        return moneyAmount > 0;
    }

    @Override
    public boolean responseValidation(Integer moneyAmount) {
        return moneyAmount < LIMIT;
    }
}

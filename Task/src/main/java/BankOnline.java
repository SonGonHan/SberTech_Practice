import exceptions.*;

import java.util.HashSet;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class BankOnline {

    private static final int LIMIT = 50000;
    private static final Set<String> blockedCards = new HashSet<>(Arrays.asList("1111111111111111", "2222222222222222", "3333333333333333"));
    private static Map<String, Double> cards;

    public void send(String cardNumber, Double money) throws BankOnlineException {
        if (cardNumber == null || money == null) {
            throw new ArgumentIsNullException();
        }
        String regex = "\\d+";
        if (cardNumber.length() != 16 && cardNumber.matches(regex)) {
            throw new InvalidCardNumberException();
        }
        if (containsBlockedCard(cardNumber)) {
            throw new BlockedCardNumberException();
        }
        if (money < 0) {
            throw new NegativeTransferAmountException();
        }
        if (money > LIMIT) {
            throw new ExceededLimitException();
        }
        System.out.println("Перевод выполнен");
    }
    public static boolean containsBlockedCard(String cardNumber) {
        return blockedCards.contains(cardNumber);
    }

}

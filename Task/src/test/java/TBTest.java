import exceptions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TBTest {

    @Test
    void testArgumentNull() throws BankOnlineException {
        BankOnline bankOnline = Mockito.mock(BankOnline.class);
        Mockito.doCallRealMethod().when(bankOnline).send(Mockito.any(), Mockito.anyDouble());
        Assertions.assertThrows(ArgumentIsNullException.class,() -> bankOnline.send(null,  0.0));
    }

    @Test
    void testBlockedCard() throws BankOnlineException {
        BankOnline bankOnline = Mockito.mock(BankOnline.class);
        Mockito.doCallRealMethod().when(bankOnline).send(Mockito.any(), Mockito.anyDouble());
        Assertions.assertThrows(BlockedCardNumberException.class,() -> bankOnline.send("1111111111111111",  0.0));
    }

    @Test
    void testExceededLimit() throws BankOnlineException {
        BankOnline bankOnline = Mockito.mock(BankOnline.class);
        Mockito.doCallRealMethod().when(bankOnline).send(Mockito.any(), Mockito.anyDouble());
        Assertions.assertThrows(ExceededLimitException.class,() -> bankOnline.send("1234567891234567",  52000.0));
    }

    @Test
    void testInvalidCardNumberException() throws BankOnlineException {
        BankOnline bankOnline = Mockito.mock(BankOnline.class);
        Mockito.doCallRealMethod().when(bankOnline).send(Mockito.any(), Mockito.anyDouble());
        Assertions.assertThrows(InvalidCardNumberException.class,() -> bankOnline.send("1234",  0.0));
    }

    @Test
    void testNegativeAmount() throws BankOnlineException {
        BankOnline bankOnline = Mockito.mock(BankOnline.class);
        Mockito.doCallRealMethod().when(bankOnline).send(Mockito.any(), Mockito.anyDouble());
        Assertions.assertThrows(NegativeTransferAmountException.class,() -> bankOnline.send("1234567891234567",  -10.0));
    }

    @Test
    void testOK() throws BankOnlineException {
        BankOnline bankOnline = Mockito.mock(BankOnline.class);
        Mockito.doCallRealMethod().when(bankOnline).send(Mockito.any(), Mockito.anyDouble());
        Assertions.assertDoesNotThrow(() -> bankOnline.send("1234567891234567",  10.0));
    }

}

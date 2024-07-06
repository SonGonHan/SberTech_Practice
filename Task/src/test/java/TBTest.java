import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TBTest {

    @Test
    void testDivide() {
        Number number = Mockito.mock(Number.class);
        Mockito.doCallRealMethod().when(number).divideNums(Mockito.anyDouble(), Mockito.anyDouble());
        Assertions.assertThrows(ArithmeticException.class,() -> number.divideNums(4.0,  0.0));
    }

}

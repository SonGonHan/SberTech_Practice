import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TBTest {

    @Test
    void testIncrease() {
        Change change = Mockito.mock(Change.class);
        new Number(change).increaseByNine(0.0);
        Mockito.verify(change, Mockito.times(3)).increaseByThree(Mockito.anyDouble());

    }


    @Test
    void testDecrease() {
        Change change = Mockito.mock(Change.class);
        new Number(change).decreaseBySix(6.0);
        Mockito.verify(change, Mockito.times(2)).decreaseByThree(Mockito.anyDouble());
    }

}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TBTest {

    @Test
    void testIncrease() {
        Change change = Mockito.mock(Change.class);

        Mockito.when(change.increaseByThree(Mockito.anyDouble())).thenReturn(5.0);

        Assertions.assertEquals(new Number().increaseByFive(0.0),5.0);

    }


    @Test
    void testDecrease() {
        Change change = Mockito.mock(Change.class);

        Mockito.when(change.decreaseByThree(Mockito.anyDouble())).thenReturn(0.0);

        Assertions.assertEquals(new Number().decreaseByFive(5.0),0.0);

    }

}

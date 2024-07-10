import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TBTest {

    @Test
    public void test() {
        Integer[] Nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertEquals(5, new GenericMethod().countEven(Arrays.asList(Nums)));
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Method;

public class TBTest {

    @Test
    void testThree() throws Exception {
        Number number = Mockito.mock(Number.class);
        Method method = Number.class.getDeclaredMethod("getThree");
        method.setAccessible(true);
        int result = (int) method.invoke(number);
        Assertions.assertEquals(3, result);
    }

}

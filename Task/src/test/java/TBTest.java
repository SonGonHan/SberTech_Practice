import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TBTest {

    @Test
    public void test() {
        Assertions.assertTrue(StreamWork.findBoolean(StreamWork.convertStringToStream("11111")));
        Assertions.assertFalse(StreamWork.findBoolean(StreamWork.convertStringToStream("11110")));
        Assertions.assertFalse(StreamWork.findBoolean(StreamWork.convertStringToStream("00000")));
    }


}

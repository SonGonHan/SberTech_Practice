import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class TBTest {
    @Test
    public void convertAndPrint() {
        WorkWithStreamContainer.convertAndPrintStream(Stream.of("a", "b", "c"));
    }

    @Test
    public void testConverterToMap() {
        StreamContainer sc1 = new StreamContainer("123", 123);
        StreamContainer sc2 = new StreamContainer("456", 456);
        StreamContainer sc3 = new StreamContainer("789", 789);
        Map<Long, String> map1 = new HashMap<>();
        map1.put(123L, "123");
        map1.put(456L, "456");
        map1.put(789L, "789");
        Map<Long, String> map2 = WorkWithStreamContainer.converterToMap(Stream.of(sc1, sc2, sc3));
        Assertions.assertEquals(map1, map2);
    }

}

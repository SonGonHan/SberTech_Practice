import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TBTest {

    @Test
    public void testConverterToList() {
        StreamContainer sc1 = new StreamContainer("12", 12);
        StreamContainer sc2 = new StreamContainer("34", 34);
        StreamContainer sc3 = new StreamContainer("56", 56);
        StreamContainer sc4 = new StreamContainer("78", 78);
        StreamContainer sc5 = new StreamContainer("90", 90);
        Map<String, List<StreamContainer>> map = new HashMap<>();

        map.put("1234", Stream.of(sc1, sc2).collect(Collectors.toList()));
        map.put("5678", Stream.of(sc3, sc4).collect(Collectors.toList()));
        map.put("90", Stream.of(sc5).collect(Collectors.toList()));
        List<StreamContainer> lc1 = Stream.of(sc1, sc2, sc3, sc4, sc5).toList();
        List<StreamContainer> lc2 = WorkWithStreamContainer.getListOfStreamContainer(map);
        Assertions.assertTrue(lc1.containsAll(lc2) && lc2.containsAll(lc1));
    }

    @Test
    public void testSize() {
        StreamContainer sc1 = new StreamContainer("12", 12);
        StreamContainer sc2 = new StreamContainer("34", 34);
        StreamContainer sc3 = new StreamContainer("56", 56);
        StreamContainer sc4 = new StreamContainer("78", 78);
        StreamContainer sc5 = new StreamContainer("90", 90);
        List<StreamContainer> sc = Stream.of(sc1, sc2, sc3, sc4, sc5).toList();
        Assertions.assertEquals(5, WorkWithStreamContainer.getSizeOfList(sc));
    }

}

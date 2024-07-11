import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TBTest {

    @Test
    public void Task1_getAverage() {
        System.out.println("getAverage:");
        StreamWork.findAverageFromGeneratedNums(200);
    }

    @Test
    public void Task1_getZero(){
        System.out.println("getZero:");
        StreamWork.findAverageFromGeneratedNums(9);
    }


    @Test
    public void Task23_convertAndPrint() {
        WorkWithStreamContainer.convertAndPrintStream(Stream.of("a", "b", "c"));
    }

    @Test
    public void Task23_testConverterToMap() {
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

    @Test
    public void Task4_testConverterToList() {
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
    public void Task4_testSize() {
        StreamContainer sc1 = new StreamContainer("12", 12);
        StreamContainer sc2 = new StreamContainer("34", 34);
        StreamContainer sc3 = new StreamContainer("56", 56);
        StreamContainer sc4 = new StreamContainer("78", 78);
        StreamContainer sc5 = new StreamContainer("90", 90);
        List<StreamContainer> sc = Stream.of(sc1, sc2, sc3, sc4, sc5).toList();
        Assertions.assertEquals(5, WorkWithStreamContainer.getSizeOfList(sc));
    }

    @Test
    public void Task5() {
        Assertions.assertTrue(StreamWork.findBoolean(StreamWork.convertStringToStream("11111")));
        Assertions.assertFalse(StreamWork.findBoolean(StreamWork.convertStringToStream("11110")));
        Assertions.assertFalse(StreamWork.findBoolean(StreamWork.convertStringToStream("00000")));
    }
}

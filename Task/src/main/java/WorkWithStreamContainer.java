import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class WorkWithStreamContainer {

    public static void convertAndPrintStream(Stream<String> streamOfStrings) {
        Stream<StreamContainer> streamOfStreamContainers = converterToStreamOfStreamContainers(streamOfStrings);
        printStreamOfStreamContainers(streamOfStreamContainers);

    }

    private static void printStreamOfStreamContainers(Stream<StreamContainer> streamOfStreamContainers) {
        streamOfStreamContainers.forEach(System.out::println);
    }

    private static Stream<StreamContainer> converterToStreamOfStreamContainers(Stream<String> streamOfStrings) {
        return streamOfStrings.map(string -> new StreamContainer(string, (long) (Math.random() * Long.MAX_VALUE)));
    }

    public static Map<Long, String> converterToMap(Stream<StreamContainer> streamOfStreamContainers) {
        Map<Long, String> map = new HashMap<>();
        streamOfStreamContainers.forEach(sc -> map.put(sc.getCount(), sc.getName()));
        return map;
    }
}

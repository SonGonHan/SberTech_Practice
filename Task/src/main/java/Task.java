import java.util.Map;
import java.util.stream.Stream;

public class Task {

    public void solution (Stream<String> streamOfStrings) {
        Stream<StreamContainer> streamOfStreamContainers = converterToStreamOfStreamContainers(streamOfStrings);
        printStreamOfStreamContainers(streamOfStreamContainers);

    }

    private void printStreamOfStreamContainers(Stream<StreamContainer> streamOfStreamContainers) {
        streamOfStreamContainers.forEach(System.out::println);
    }

    private Stream<StreamContainer> converterToStreamOfStreamContainers(Stream<String> streamOfStrings) {
        return streamOfStrings.map(string -> new StreamContainer(string, (long) (Math.random() * Long.MAX_VALUE)));
    }

    private Map<Long, String> converterToMap(Stream<StreamContainer> streamOfStreamContainers) {
        
    }
}

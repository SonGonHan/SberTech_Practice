import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkWithStreamContainer {

    public static List<StreamContainer> getListOfStreamContainer(Map<String, List<StreamContainer>> map){
        return convertMapToStream(map).collect(Collectors.toList());
    }

    public static long getSizeOfList(List<StreamContainer> list){
        return list.stream().count();
    }

    private static Stream<StreamContainer> convertMapToStream(Map<String, List<StreamContainer>> map) {
        return map.values().stream().flatMap(List::stream);
    }
}

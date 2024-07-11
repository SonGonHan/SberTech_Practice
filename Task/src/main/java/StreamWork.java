import java.util.stream.Stream;

public class StreamWork {

    public static Stream<Boolean> convertStringToStream(String str) {
        return Stream.of(str.split("")).map(v -> v.equals("1"));
    }

    public static Boolean findBoolean(Stream<Boolean> str) {
        return str.reduce((a, b) -> a && b).orElse(false);
    }
}

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamWork {

    public static void findAverageFromGeneratedNums(int bound) {
        System.out.println(IntStream
                .generate(()
                        -> (int) (Math.random() * bound))
                .limit(20)
                .filter(x -> x > 9 && x < 100)
                .sorted()
                .average()
                .orElse(0)
        );
    }

    public static Stream<Boolean> convertStringToStream(String str) {
        return Stream.of(str.split("")).map(v -> v.equals("1"));
    }

    public static Boolean findBoolean(Stream<Boolean> str) {
        return str.reduce((a, b) -> a && b).orElse(false);
    }
}

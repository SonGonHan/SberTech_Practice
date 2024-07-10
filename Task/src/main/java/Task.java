import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

public class Task {

    public static void v(int bound) {
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
}

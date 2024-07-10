import java.util.Collection;

public class GenericMethod<N extends Number> {

    public int countEven(Collection<N> numbers) {
        int count = 0;
        for (N number : numbers) {
            count += number.intValue() % 2 == 0 ? 1 : 0;
        }
        return count;
    }

}

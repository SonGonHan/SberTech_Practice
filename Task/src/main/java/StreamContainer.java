import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class StreamContainer {

    private final String name;

    private final long count;

    @Override
    public String toString() {
        return name + " : " + count;
    }

}

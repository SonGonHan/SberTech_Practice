import java.util.Collections;
import java.util.List;

public class GenericMethod {

    public static void swap(List<?> list, int idx1, int idx2) {
        Collections.swap(list, idx1, idx2);
    }

}

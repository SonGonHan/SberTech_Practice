import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TBTest {

    @Test
    public void test() {
        Integer[] Nums1 = {1, 2, 3, 4, 5};
        Integer[] Nums2 = {1, 4, 3, 2, 5};
        GenericMethod.swap(Arrays.asList(Nums1), 1, 3);
        Assertions.assertArrayEquals(Nums1, Nums2);
    }
}

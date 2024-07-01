import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TaskTest {
    @Test
    void GetMin() {
        int[] array = {5, 2, 9, 1, 3};
        int expected = 1;
        int actual = Task.findMinValueInArray(array);
        Assert.assertEquals(expected, actual);
    }
    @Test
    void GetMax() {
        int[] array = {5, 2, 9, 1, 3};
        int expected = 9;
        int actual = Task.findMaxValueInArray(array);
        Assert.assertEquals(expected, actual);
    }
}
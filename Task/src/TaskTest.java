import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TaskTest {
    @Test
    void GetNums() {
        final int COUNT = 14, NUM = 7;
        String expected = "7 14 21 28 35 42 49 56 63 70 77 84 91 98";
        String actual = Task.GetNums(COUNT, NUM);
        Assert.assertEquals(expected, actual);
    }
}
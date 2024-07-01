import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TaskTest {
    @Test
    void GetPrimes() {
        final int HEIGHT = 3, WIDTH = 5;
        String expected =
                "* * * * *\n" +
                "* * * * *\n" +
                "* * * * *";
        String actual = Task.makeStarGrid(HEIGHT, WIDTH);
        Assert.assertEquals(expected, actual);
    }
}
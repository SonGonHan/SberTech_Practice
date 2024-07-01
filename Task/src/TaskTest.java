import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TaskTest {
    @Test
    void GetPrimes() {
        final int LOWER_BOUND = 2, UPPER_BOUND = 100;
        String expected = "2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97";
        String actual = Task.findPrimeNumbers(LOWER_BOUND, UPPER_BOUND);
        Assert.assertEquals(expected, actual);
    }
}
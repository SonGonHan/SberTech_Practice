import classes.DataConteiner;
import classes.FirstChild;
import classes.SecondChild;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TBTest {
    @Test
    public void test() {
        DataConteiner dc = new DataConteiner("Михаил", 19);
        Assertions.assertEquals("Михаил", new FirstChild().getName(dc));
        Assertions.assertEquals(19, new FirstChild().getAge(dc));
        Assertions.assertEquals("Михаил 19", new SecondChild().getNameAndAge(dc));
    }
}

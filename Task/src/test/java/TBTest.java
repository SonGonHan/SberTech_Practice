import classes.DataConteiner;
import classes.FirstChild;
import classes.ReflectionTask;
import classes.SecondChild;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;

public class TBTest {
    @Test
    public void task1_testNewFirstChild() {
        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        Assertions.assertEquals(FirstChild.class, ReflectionTask.makeClass(birthday, "Михаил", 19).getClass());
    }
    @Test
    public void task1_testNewSecondChild() {
        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        Assertions.assertEquals(SecondChild.class, ReflectionTask.makeClass(birthday, "Михаил", 19).getClass());
    }

    @Test
    public void task23_testFirstChild() throws InvocationTargetException, IllegalAccessException {
        System.out.println("testFirstChild");
        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        ReflectionTask.callMethods(ReflectionTask.makeClass(birthday, "Михаил", 19));
    }

    @Test
    public void task23_testSecondChild() throws InvocationTargetException, IllegalAccessException {
        System.out.println("testSecondChild");
        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        ReflectionTask.callMethods(ReflectionTask.makeClass(birthday, "Михаил", 19));
    }
}

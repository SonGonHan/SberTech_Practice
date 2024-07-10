import exceptions.ValidationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import serviceWork.AuthorizationWork;

public class TBTest {

    @Test
    public void goodTest() {
        System.out.println("goodTest");
        AuthorizationWork aw = new AuthorizationWork("SonGonHan");
        Assertions.assertDoesNotThrow(() -> {
            new mainWork().serviceWork(aw);
        });
    }

    @Test
    public void badTest1() {
        System.out.println("badTest1");
        AuthorizationWork aw = new AuthorizationWork("12345");
        Assertions.assertThrows(ValidationException.class,
                () -> new mainWork().serviceWork(aw));
    }

    @Test
    public void badTest2() {
        System.out.println("badTest2");
        AuthorizationWork aw = new AuthorizationWork("ByaKuya");
        Assertions.assertThrows(ValidationException.class, () -> new mainWork().serviceWork(aw));
    }
}

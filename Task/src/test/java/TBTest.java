import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import WorkOfAll.WorkOfAllService;

import services.serviceWork.AuthorizationWork;
import services.serviceWork.MoneyTransferWork;

import exceptions.LoginException;
import exceptions.MoneyAmountException;

public class TBTest {

    @Test
    public void goodTestAW() {
        System.out.println("goodTestAW");
        AuthorizationWork aw = new AuthorizationWork("SonGonHan");
        Assertions.assertDoesNotThrow(() -> {
            new WorkOfAllService().serviceWork(aw);
        });
    }

    @Test
    public void badTestAW1() {
        System.out.println("badTestAW1");
        AuthorizationWork aw = new AuthorizationWork("12345");
        Assertions.assertThrows(LoginException.class,
                () -> new WorkOfAllService().serviceWork(aw));
    }

    @Test
    public void badTestAW2() {
        System.out.println("badTestAW2");
        AuthorizationWork aw = new AuthorizationWork("ByaKuya");
        Assertions.assertThrows(LoginException.class,
                () -> new WorkOfAllService().serviceWork(aw));
    }

    @Test
    public void goodTestMTS() {
        System.out.println("goodTestMTS");
        MoneyTransferWork mtw = new MoneyTransferWork(10000);
        Assertions.assertDoesNotThrow(() -> {
            new WorkOfAllService().serviceWork(mtw);
        });
    }

    @Test
    public void badTest1() {
        System.out.println("badTestMTS1");
        MoneyTransferWork mtw = new MoneyTransferWork(-10000);
        Assertions.assertThrows(MoneyAmountException.class,
                () -> new WorkOfAllService().serviceWork(mtw));
    }

    @Test
    public void badTest2() {
        System.out.println("badTestMTS2");
        MoneyTransferWork mtw = new MoneyTransferWork(100000);
        Assertions.assertThrows(MoneyAmountException.class,
                () -> new WorkOfAllService().serviceWork(mtw));
    }
}

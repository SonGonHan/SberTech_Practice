import org.junit.jupiter.api.Test;

public class TBTest {
    @Test
    public void test() {
        DataConteiner dc1 = new DataConteiner();
        dc1.setAge(19);
        dc1.setName("Миша");
        dc1.setSurname("Шабанов");
        DataConteiner dc2 = new DataConteiner(19, "Михаил", "Шабанов");
        System.out.println(dc2.getAge());
        System.out.println(dc2.getName());
        System.out.println(dc2.getSurname());
    }
}

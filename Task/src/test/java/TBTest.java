import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class TBTest {

    @Test
    public void test() {
        List<Sounding> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Hamster());
        animals.add(new Pig());
        animals.add(new Sounding() {
            @Override
            public void sound() {
                System.out.println("quack");
            }
        });
        animals.add(()-> System.out.println("piu"));
        animals.add(new Pig()::sound);
        animals.forEach(Sounding::sound);
    }
}

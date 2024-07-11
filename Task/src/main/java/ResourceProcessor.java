import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ResourceProcessor {
    private Resource res;
    private String name;

    public synchronized void increaseAndPrint() {
        res.setResource(res.getResource() + 1);
        print();
    }

    public void decreaseAndPrint() {
        res.setResource(res.getResource() - 1);
        print();
    }

    public void print() {
        System.out.println(name + ": " + res);
    }
}

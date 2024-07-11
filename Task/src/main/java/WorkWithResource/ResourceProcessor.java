package WorkWithResource;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ResourceProcessor {
    private final Resource RES;
    private String name;
    private int n = 10;

    public ResourceProcessor(Resource RES, String name) {
        this.RES = RES;
        this.name = name;
    }

    public synchronized void increaseAndPrint() {
        synchronized (RES) {
            try {
                while (RES.getResource() > 5) {
                    RES.wait();
                }
                while (n > 0 && RES.getResource() < 5) {
                    RES.setResource(RES.getResource() + 1);
                    print();
                    --n;
                }
                RES.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void decreaseAndPrint() {
        synchronized (RES) {
            try {
                while (RES.getResource() < 1) {
                    RES.wait();
                }
                while (n > 0 && RES.getResource() > 0) {
                    RES.setResource(RES.getResource() - 1);
                    print();
                    --n;
                }
                RES.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void print() {
        System.out.println(name + " : " + RES + " : " + n);
    }
}

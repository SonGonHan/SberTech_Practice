import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Increaser extends Thread {

    private final ResourceProcessor RP;
    private final Integer mod;
    private static final int N = 6;

    @Override
    public void run() {
        synchronized (RP.getRes()) {
            try {
                while ((RP.getRes().getResource() / 6) % 3 != mod) {
                    RP.getRes().wait();
                }
            for (int i = 0; i < N; i++) {
                RP.increaseAndPrint();
            }
            System.out.println();
            RP.getRes().notifyAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


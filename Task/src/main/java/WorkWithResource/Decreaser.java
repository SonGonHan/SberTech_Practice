package WorkWithResource;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Decreaser implements Runnable {
    private final ResourceProcessor RP;

    @Override
    public void run() {
        while (RP.getN() != 0){
            RP.decreaseAndPrint();
        }
    }
}

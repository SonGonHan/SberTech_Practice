package WorkWithResource;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Increaser extends Thread {

    private final ResourceProcessor RP;

    @Override
    public void run() {
        while (RP.getN() != 0){
            RP.increaseAndPrint();
        }
    }
}


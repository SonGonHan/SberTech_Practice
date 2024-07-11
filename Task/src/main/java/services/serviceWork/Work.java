package services.serviceWork;

import java.io.IOException;

public interface Work<E extends IOException> {

    void work() throws E;

}

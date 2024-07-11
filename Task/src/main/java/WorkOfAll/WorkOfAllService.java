package WorkOfAll;

import java.io.IOException;

import services.serviceWork.Work;

public class WorkOfAllService<S extends Work> {

    public void serviceWork(S serviceWork) throws IOException {
        serviceWork.work();
    }

}

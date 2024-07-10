import exceptions.ValidationException;
import serviceWork.Work;

public class mainWork<S extends Work> {

    public void serviceWork(S work) throws ValidationException {
        work.work();
    }

}

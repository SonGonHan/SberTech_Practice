import WorkWithResource.Decreaser;
import WorkWithResource.Increaser;
import WorkWithResource.Resource;
import WorkWithResource.ResourceProcessor;

public class Main {

    public static void main(String[] args) {
        Resource resource = new Resource(0);

        Increaser inc = new Increaser(new ResourceProcessor(resource, "inc"));
        Decreaser dec = new Decreaser(new ResourceProcessor(resource, "dec"));

        inc.start();
        dec.run();

        inc.interrupt();
    }
}

public class Main {

    public static void main(String[] args) {
        Resource resource = new Resource(0);

        for (int i = 0; i < 5; i++) {
            Increaser inc1 = new Increaser(new ResourceProcessor(resource, "inc1"), 0);
            Increaser inc2 = new Increaser(new ResourceProcessor(resource, "inc2"), 1);
            Increaser inc3 = new Increaser(new ResourceProcessor(resource, "inc3"), 2);
            inc1.start();
            inc2.start();
            inc3.start();
        }

    }
}

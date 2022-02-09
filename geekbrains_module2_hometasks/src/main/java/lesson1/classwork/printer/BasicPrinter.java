package lesson1.classwork.printer;

public abstract class BasicPrinter implements Printer {

    public void print() {
            System.out.println("Printing is preparing...");
            loadSpecification();
            loadEnvironment();
            System.out.println("Printer is ready");
            System.out.println("Printing...");
            System.out.println("Status DONE.");
        }

    protected abstract void loadEnvironment();

    private void loadSpecification() {
        System.out.println("Specification loading...");
        System.out.println("Specification loaded...");
        System.out.println("Status OK.");
    }
}

package lesson1.classwork.printer;

public class NetworkPrinter extends BasicPrinter{

    @Override
    protected void loadEnvironment() {
        System.out.println("Connection established...");
        System.out.println("Status OK.");
    }
}

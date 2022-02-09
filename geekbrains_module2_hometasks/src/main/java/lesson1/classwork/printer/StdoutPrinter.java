package lesson1.classwork.printer;

import java.io.OutputStream;

public class StdoutPrinter extends BasicPrinter {

    private OutputStream out;

    protected void loadEnvironment() {
        loadStream(out);
    }

    private void loadStream(OutputStream out) {
        System.out.println("Stream is loading...");
        System.out.println("Stream loaded...");
        System.out.println("Status OK.");
    }
}

package lesson1.classwork.printer;

import java.io.File;

public class PdfPrinter extends BasicPrinter{

    private File file;

    @Override
    protected void loadEnvironment() {
        loadFile(file);
    }

    protected void loadFile(File file) {
            System.out.println("File is loading...");
            System.out.println("File loaded...");
            System.out.println("Status OK.");
    }
}

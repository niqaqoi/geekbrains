package lesson1.newClasswork.pattern.decorator;

import java.util.Locale;

public class UppercasePrinter implements Printer{

    private Printer printer;

    public UppercasePrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        printer.print(text.toUpperCase());
    }
}

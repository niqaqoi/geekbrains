package lesson1.newClasswork.pattern.decorator;

public class App {
    public static void main(String[] args) {
        final Printer consolePrinter = new ConsolePrinter();
        final Printer borderPrinter = new BorderPrinter(consolePrinter);
        final Printer uppercasePrinter = new UppercasePrinter(borderPrinter);
        final Printer sparsePrinter = new SparsePrinter(uppercasePrinter);
        final Printer sparsePrinter1 = new SparsePrinter(sparsePrinter);
        sparsePrinter1.print("Hello world");
    }
}

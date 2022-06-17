package lesson1.newClasswork.pattern.decorator;

public class SparsePrinter implements Printer{

    private Printer printer;

    public SparsePrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        final StringBuilder stringBuilder = new StringBuilder(" ");
        for (char c : text.toCharArray()) {
            stringBuilder.append(c).append(" ");
        }
        printer.print(stringBuilder.toString());
    }
}

package lesson1.newClasswork.pattern.decorator;

public class ConsolePrinter implements Printer {
    public void print(String text) {
        System.out.print(text);
    }
}

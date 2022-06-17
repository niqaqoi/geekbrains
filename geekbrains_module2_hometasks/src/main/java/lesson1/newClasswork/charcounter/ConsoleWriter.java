package lesson1.newClasswork.charcounter;

public class ConsoleWriter implements Writer {
    @Override
    public void write(String text) {
        System.out.println(text);
    }
}

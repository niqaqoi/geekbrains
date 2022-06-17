package lesson1.newClasswork.charcounter;

public class App {
    public static void main(String[] args) {
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();
        Reader filereader = new FileReader("Pipiska.txt");
        Writer filewriter = new FileWriter("Pipiska_result.txt");

        final CharCounter charCounter = new CharCounter(reader,writer);
        final CharCounter charCounter1 = new CharCounter(filereader, filewriter);
        charCounter.processText();
    }
}

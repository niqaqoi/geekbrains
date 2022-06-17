package lesson1.newClasswork.charcounter;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    @Override
    public String read() {

        final Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

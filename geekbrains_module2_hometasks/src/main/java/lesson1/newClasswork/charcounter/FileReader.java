package lesson1.newClasswork.charcounter;

public class FileReader implements Reader {

    private String fileName;

    public FileReader(String fileReader) {
        this.fileName = fileReader;
    }

    @Override
    public String read() {
        return "123134324";
    }
}

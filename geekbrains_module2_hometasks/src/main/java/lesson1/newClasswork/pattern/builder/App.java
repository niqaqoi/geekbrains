package lesson1.newClasswork.pattern.builder;

public class App {
    public static void main(String[] args) {
        final Employee employee = new Employee.Builder()
                .lastname("Ivanov")
                .firstname("Ivan")
                .middlename("Ivanovich")
                .build();
    }
}

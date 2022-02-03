package lesson5.homework;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Alex", "Manager", "alex@sber.ru", "321", 320, 41);
        employees[1] = new Employee("Nik", "Director", "nik@sber.ru", "123", 620, 32);
        employees[2] = new Employee("Raf", "Developer", "raf@sber.ru", "456", 480, 45);
        employees[3] = new Employee("Sergey", "Scientist", "sergey@sber.ru", "654", 150, 28);
        employees[4] = new Employee("Ivan", "Account Manager", "ivan@sber.ru", "789", 200, 24);

        for (Employee e: employees
             ) {
            if (e.getAge() >= 40) {
                System.out.println(e + "\n");
            }
        }
    }
}

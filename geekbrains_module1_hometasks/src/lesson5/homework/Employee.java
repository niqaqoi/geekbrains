package lesson5.homework;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee: " + "\n" +
                "Full name: " + fullName + '\n' +
                "Position: " + position + '\n' +
                "Email: " + email + '\n' +
                "Phone number: " + phoneNumber + '\n' +
                "Salary: " + salary + '\n' +
                "Age: " + age;
    }
}

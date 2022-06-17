package lesson1.newClasswork.pattern.builder;

import java.time.LocalDate;

public class Employee {

    private final String firstname;
    private final String lastname;
    private final String middlename;
//    private final String email;
//    private final String room;
//    private final String phone;
//    private final int age;
//    private final double salary;
//    private final String department;
//    private final Employee manager;
//    private final Gender gender;
//    private final LocalDate birthday;

    private Employee(Builder builder) {
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.middlename = builder.middlename;
    }

    public static class Builder {
        private String firstname;
        private String lastname;
        private String middlename;

    public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
    }

    public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
    }

    public Builder middlename(String middlename) {
            this.middlename = middlename;
            return this;
    }

    public Employee build() {
            return new Employee(this);
    }

    }

}

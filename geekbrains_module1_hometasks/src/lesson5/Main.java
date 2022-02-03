package lesson5;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.name = "BMW";
        car.age = 33;

        Human maks = new Human();
        maks.name = "Maks D.";
        maks.age = 33;
        System.out.println(maks.name + " has age " + maks.age);
        maks.increaseAge();
        System.out.println(maks.name + " has age " + maks.age);

        Human kolyan = new Human();
        kolyan.name = "Nikolay";
        kolyan.age = 33;
        System.out.println(kolyan.name + " has age " + kolyan.age);

        Human kolyan2 = new Human();
        kolyan2.name = "Nikolay";
        kolyan2.age = 33;
        System.out.println(kolyan2.name + " has age " + kolyan2.age);

    }
}

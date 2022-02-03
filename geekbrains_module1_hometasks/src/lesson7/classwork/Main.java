package lesson7.classwork;

import lesson7.classwork.animals.Animal;
import lesson7.classwork.animals.Cat;
import lesson7.classwork.animals.Dog;
import lesson7.classwork.animals.Lion;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(300,100),
                new Cat(200),
                new Lion(500,50)
        };
        goAnimals(animals);
    }

    static void goAnimals(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
            animals[i].run(500);
            animals[i].swim(60);
            System.out.println("=================");
        }
    }
}

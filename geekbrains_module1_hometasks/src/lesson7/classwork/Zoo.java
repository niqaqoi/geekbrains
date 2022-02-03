package lesson7.classwork;

import lesson7.classwork.animals.AnimalGroup;
import lesson7.classwork.animals.Cat;
import lesson7.classwork.animals.Dog;
import lesson7.classwork.animals.Lion;

public class Zoo {
    public static void main(String[] args) {
        doDemoGroupOne();
        System.out.println("============");
        doDemoGroupTwo();
    }

    static void doDemoGroupOne() {
        AnimalGroup animalGroup = new AnimalGroup();
        animalGroup.add(new Cat(100));
        animalGroup.add(new Cat(100));
        animalGroup.add(new Dog(100,50));
        animalGroup.add(new Lion(300,100));

        System.out.println("Total: " + animalGroup.getCounter().getTotal());
        System.out.println("Cats: " + animalGroup.getCounter().getCats());
        System.out.println("Dogs: " + animalGroup.getCounter().getDogs());
        System.out.println("Lions: " + animalGroup.getCounter().getLions());
    }

    static void doDemoGroupTwo() {
        AnimalGroup animalGroup = new AnimalGroup();
        animalGroup.add(new Cat(100));
        animalGroup.add(new Lion(300,100));
        animalGroup.add(new Dog(100,50));
        animalGroup.add(new Lion(300,100));
        animalGroup.add(new Dog(100,50));

        System.out.println("Total: " + animalGroup.getCounter().getTotal());
        System.out.println("Cats: " + animalGroup.getCounter().getCats());
        System.out.println("Dogs: " + animalGroup.getCounter().getDogs());
        System.out.println("Lions: " + animalGroup.getCounter().getLions());
    }
}

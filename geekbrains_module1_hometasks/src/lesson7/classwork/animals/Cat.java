package lesson7.classwork.animals;

public class Cat extends Animal {
    public Cat(int runDistance) {
        super(runDistance, -1);
    }

    @Override
    public void run(int distance) {
        System.out.println("Cat run distance: " + (distance <= getRunDistance()));
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats can swim but do not like that");
    }
}

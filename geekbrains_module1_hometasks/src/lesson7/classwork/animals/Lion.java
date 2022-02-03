package lesson7.classwork.animals;

public class Lion extends Animal{

    public Lion(int runDistance, int swimDistance) {
        super(runDistance, swimDistance);
    }

    @Override
    public void run(int distance) {
        System.out.println("Lion run distance: " + (distance <= getRunDistance()));
    }

    @Override
    public void swim(int distance) {
        System.out.println("Lion run distance: " + (distance <= getSwimDistance()));
    }
}

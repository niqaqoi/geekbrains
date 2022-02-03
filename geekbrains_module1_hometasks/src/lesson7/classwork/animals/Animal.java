package lesson7.classwork.animals;

public abstract class Animal {

    private final int runDistance;
    private final int swimDistance;

    public Animal(int runDistance, int swimDistance) {
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    @Override
    public String toString() {
        return "Animal{" +
                "runDistance=" + runDistance +
                ", swimDistance=" + swimDistance +
                '}';
    }
}

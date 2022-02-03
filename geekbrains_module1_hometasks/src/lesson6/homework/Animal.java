package lesson6.homework;

public abstract class Animal {

    private String name;
    private final int runDistance;
    private final int swimDistance;

    public Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public String getName() {
        return name;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public abstract void run(int runDistance);
    public abstract void swim(int swimDistance);
}

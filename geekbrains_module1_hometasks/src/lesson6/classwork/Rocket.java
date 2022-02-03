package lesson6.classwork;

public class Rocket extends Vehicle {

    public Rocket(String id) {
        super(id);
    }

    @Override
    public void move() {
        System.out.printf("Jet[%s] is flying...%n", getId());
    }
}

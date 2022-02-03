package lesson6.classwork;

public class Car extends Vehicle{

    public Car(String id) {
        super(id);
    }

    @Override
    public void move() {
        System.out.printf("Car[%s] is moving...%n", getId());
    }
}

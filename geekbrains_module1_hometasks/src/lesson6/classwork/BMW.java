package lesson6.classwork;

public class BMW extends Car{
    public BMW(String id) {
        super(id);
    }

    @Override
    public void move() {
        System.out.printf("BMW M3[%s] is moving...%n", getId());
    }
}

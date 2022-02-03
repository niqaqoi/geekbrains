package lesson6.classwork;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("2"),
                new Rocket("3"),
                new BMW("4")
        };

        startVehicles(vehicles);
    }

    static void startVehicles(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
        }
    }
}
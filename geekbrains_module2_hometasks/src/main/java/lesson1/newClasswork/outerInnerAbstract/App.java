package lesson1.newClasswork.outerInnerAbstract;

public class App {
    public static void main(String[] args) {
        final Outer.Inner inner = new Outer().new Inner();
        final Outer.SInner sInner = new Outer.SInner();

        Animal animal = new Animal() { //анонимный класс
            @Override
            public void swim(int length) {
                System.out.println("run");
            }

            @Override
            public void run(int length) {
                System.out.println("swim");
            }
        };
    }

    class Cat extends Animal {

        @Override
        public void swim(int length) {

        }

        @Override
        public void run(int length) {

        }
    }
}

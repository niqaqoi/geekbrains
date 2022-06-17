package lesson1.newClasswork.outerInnerAbstract;

public class Outer {

    private int a;
    private static int i;

    private void m() {

    }

    private static void sm() {

    }

    public class Inner { //внутренний класс
        void innerM() {
            a = 1;
            i = 42;
            m();
            sm();
        }
    }

    public static class SInner { //вложенный класс
        void innerM() {
            i = 42;
            sm();
        }
    }
}

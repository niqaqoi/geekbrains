public class Test implements Runnable {
    @Override
    public void run() {
    }

    public static void main(String[] args) {
        new Thread(new Test()).start();
    }
}

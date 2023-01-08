package synchronization.exothread;

public class MainDemo {
    public static void main(String[] args) {
        OddNumbersThread oddThread = new OddNumbersThread();
        EvenNumbersThread evenThread = new EvenNumbersThread();
        Thread t = new Thread(evenThread);
        t.start();
        oddThread.start();
    }
}

package synchronization.deadlock;

public class DeadLockDemo implements Runnable {
    FirstReource fr = new FirstReource();
    SecondReource sr = new SecondReource();

    public DeadLockDemo() {
        new Thread(this).start();
        //sr.method1(fr); deadlock
    }
    public static void main(String[] args) {
        new DeadLockDemo();
    }

    @Override
    public void run() {
        fr.method1(sr);
    }
}

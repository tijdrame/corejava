package synchronization.deadlock;

public class FirstReource {
    public synchronized void method1(SecondReource sr) {
        System.out.println("Inside method1 of FR");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Invoking method2 of FR");
        sr.method2();
    }

    public synchronized void method2() {
        System.out.println("Inside method2 of FR");
    }
}

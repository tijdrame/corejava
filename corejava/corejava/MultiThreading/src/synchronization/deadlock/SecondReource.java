package synchronization.deadlock;

public class SecondReource {
    public synchronized void method1(FirstReource fr) {
        System.out.println("Inside method1 of SR");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Invoking method2 of SR");
        fr.method2();
    }

    public synchronized void method2() {
        System.out.println("Inside method2 of SR");
    }
}

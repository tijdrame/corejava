package threadgroups;

public class ThreadGroupMethods {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mtg = new ThreadGroup("MyThreadGroup");
        Customthread thread1 = new Customthread(mtg, "Thread 1");
        Customthread thread2 = new Customthread(mtg, "Thread 2");

        thread1.start();
        thread2.start();
        System.out.println(mtg.activeCount());
        mtg.list();//aff les thread (name, priorité, group)
        Thread.sleep(5000);
        System.out.println(mtg.activeCount());
    }
}

package threadgroups;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        ThreadGroup parent = new ThreadGroup("Parent");
        ThreadGroup child = new ThreadGroup(parent, "Child");
        System.out.println(child.getName());
        System.out.println(child.getParent().getName());

        child.setMaxPriority(4);
        Thread thread1 = new Thread(child, "Thread 1");
        Thread thread2 = new Thread(child, "Thread 2");
        System.out.println(thread1.getThreadGroup().getName());
        System.out.println(thread1.getPriority());
    }
}

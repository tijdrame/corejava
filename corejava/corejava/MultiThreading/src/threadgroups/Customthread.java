package threadgroups;

public class Customthread extends Thread {
    
    Customthread(ThreadGroup tg, String name){
        super(tg, name);
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

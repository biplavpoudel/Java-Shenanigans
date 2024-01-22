public class Threading implements Runnable{

    public void run(){
        System.out.println("Running inside the thread");
    }
    public static void main(String[] args) {

        Runnable r = new Threading();
        Thread t1 = new Thread(r, "CustomName");
        t1.start();

        String threadName = t1.getName();
        System.out.println("Thread Name "+ threadName);
    }
}

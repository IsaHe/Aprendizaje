package JavaLearning.Hilos;

public class MyThr extends Thread {
    @Override
    public void run() {
        if (this.isDaemon()) {
            System.out.println("Daemon thread running...");
        } else {
            System.out.println("User thread running...");
        }
    }
}

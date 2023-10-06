package JavaLearning.Hilos;

public class MainThr {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.activeCount()); // Returns the number of active threads in the current thread's thread group.

        Thread.currentThread().setName("Mainnnnnnn Thread"); // Changes the name of this thread to be equal to the argument name.
        System.out.println(Thread.currentThread().getName()); // Returns this thread's name.

        Thread.currentThread().setPriority(7); // Changes the priority of this thread.
        System.out.println(Thread.currentThread().getPriority()); // Returns this thread's priority.

        System.out.println(Thread.currentThread().isAlive()); // Tests if this thread is alive.

        for (int i = 0; i < 3; i++) {
            System.out.println(3-i);
            Thread.sleep(1000); // Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
        }
        System.out.println("Done");

        MyThr t1 = new MyThr();

        System.out.println(t1.isDaemon());  // Tests if this thread is a daemon thread.
        //t1.setDaemon(true); // Marks this thread as either a daemon thread or a user thread.
        System.out.println(t1.isDaemon());

        t1.start(); // Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
        System.out.println(t1.isAlive());

        t1.setName("My Thread");
        System.out.println(t1.getName());

        System.out.println(t1.getPriority()); // Cuando se crea un hilo, hereda la prioridad del hilo que lo ha creado.

        System.out.println(Thread.activeCount());
    }
}
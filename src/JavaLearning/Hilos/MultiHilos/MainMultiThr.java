package JavaLearning.Hilos.MultiHilos;

public class MainMultiThr {
    public static void main(String[] args) throws InterruptedException {
        MiThr t1 = new MiThr(); // Esta es una forma de crear un hilo, creando una clase que herede de Thread

        MyRunable r1 = new MyRunable();// Esta otra forma de crear un hilo haciendo uso de la interfaz Runable es mas flexible que la anterior, ya que podemos heredar de otra clase y aun asi crear un hilo
        Thread t2 = new Thread(r1);

        switch (t1.getState()) {
            case NEW -> System.out.println("Hilo #1: Nuevo");
            case RUNNABLE -> System.out.println("Hilo #1: En ejecucion");
            case BLOCKED -> System.out.println("Hilo #1: Bloqueado");
            case WAITING -> System.out.println("Hilo #1: Esperando");
            case TIMED_WAITING -> System.out.println("Hilo #1: Esperando por un tiempo determinado");
            case TERMINATED -> System.out.println("Hilo #1: Terminado");
            default -> {}
        }
        t1.start();
        t1.join(3000); // Espera a que el hilo termine para continuar con el hilo principal o asignar un valor a millis para que espere millis milisegundos
        t2.start();

    }

}

package JavaLearning.Hilos.MultiHilos;

public class MiThr extends Thread{
    @Override
    public void run() {
        for(int i = 10; i > 0; i--) {
            System.out.println("Hilo #1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            System.out.println(1/0); // Nos va a dar una excepcion, y como no la capturamos, el hilo se va a detener, pero los demas hilos van a seguir ejecutandose
        }
        System.out.println("Hilo #1: Terminado");
    }
}

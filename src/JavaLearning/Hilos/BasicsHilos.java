package JavaLearning.Hilos;

public class BasicsHilos {
    /*
    Hilo =>     Un hilo es un flujo de ejecución de un programa.
                Cada Hilo puede ejecutar un conjunto de instrucciones en paralelo con resto de hilos.
                Cada hilo tiene una prioridad, que va de 1 a 10, siendo 1 la prioridad más baja y 10 la más alta.
                Por defecto, todos los hilos tienen prioridad 5.
                Los hilos con mayor prioridad tienen más posibilidades de ejecutarse antes que los de menor prioridad.

                La JVM continuará ejecutando hilos hasta que ocurra una de las siguientes:
                    1. El método exit() de la clase Runtime ha sido invocado.
                    2. Todas las instancias de la clase Thread han muerto.
                Cuando la JVM inicia un programa, este tiene un hilo principal llamado "main".

                Hay dos tipos de hilos:
                    1. Hilos de usuario: Son los hilos que crea el programador.
                    2. Hilos del sistema(Daemon Thread): Son los hilos que crea el propio sistema.

                La JVM no se detiene hasta que todos los hilos de usuario hayan terminado. Sin importar los hilos de sistema
     */
}

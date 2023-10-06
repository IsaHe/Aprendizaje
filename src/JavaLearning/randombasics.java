package JavaLearning;

import java.util.Random;

public class randombasics {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(1, 6);   //Devuelve un int aleatorio ente lo que le des (si no pones nada puede cojer cualquier valor permitido por el tipo int)
        System.out.println(x);

        double y = random.nextDouble(1, 2); //Devuelve un double aleatorio entre lo que le des (si no pones nada es ente 0 y 1)
        System.out.println(y);

        boolean z = random.nextBoolean();   //Devuelve True o False
        System.out.println(z);
    }
}

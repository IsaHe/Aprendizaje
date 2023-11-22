package Prog3.Clase.Recursividad;

public class Bases {

    // Contar de 0 a n
    private static void contar(int m, int n) {
        if(m > n) throw new IllegalArgumentException("m debe ser menor o igual a n");

        if (n == m) {
            System.out.println(n);
        } else {
            contar(m, n - 1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        contar(0, 10);
    }
}

package Prog3.Clase.Recursividad;

public class Bases {

    // Contar de 0 a n
    private static void contar(int m, int n) {
        if(m > n) throw new IllegalArgumentException("m debe ser menor o igual a n");

        if (n == m) {
            System.out.println(n);
        } else {
            System.out.println(n);
            contar(m, n - 1);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return factorial(n-1) * n;
        }
    }
    public static void main(String[] args) {
        contar(0, 10);
        System.out.println(factorial(5));
    }
}
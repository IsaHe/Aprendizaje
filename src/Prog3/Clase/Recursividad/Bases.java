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

    //Recursividad lineal
    public static int maximoComunDivisor(int m, int n) {
        if (m == n) return m;

        if (m > n) return maximoComunDivisor(m - n, n);

        return maximoComunDivisor(m, n - m);
    }

    // Recursividad multiple
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        contar(0, 10);
        System.out.println(factorial(25));
        System.out.println(maximoComunDivisor(12, 8));
        System.out.println(fibonacci(8));
    }
}

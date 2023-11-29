package Prog3.Clase.Recursividad;

public class Ejercicios {

    private static boolean esPalindromo(String palabra) {
        if (palabra.length() == 1 || palabra.isEmpty()) return true;
        if (palabra.charAt(0) != palabra.charAt(palabra.length() - 1)) return false;

        return esPalindromo(palabra.substring(1, palabra.length() - 1));
    }

    private static String imprimirStrBinarios(String str) {
        if (!str.contains("b")) return str;
        return imprimirStrBinarios(str.replaceFirst("b", "0")) + "\n" + imprimirStrBinarios(str.replaceFirst("b", "1"));
    }

    // Otra forma de hacerlo con un mejor uso de memoria
    private static void imprimirStrBinarios2(char[] patron, int i) {
        if (patron.length == 0) return;
        if (i == patron.length) {
            System.out.println(patron);
            return;
        }
        if (patron[i] == 'b') {
            patron[i] = '0';
            imprimirStrBinarios2(patron, i + 1);
            patron[i] = '1';
            imprimirStrBinarios2(patron, i + 1);
            patron[i] = 'b';
        } else {
            imprimirStrBinarios2(patron, i + 1);
        }
    }
    private static int calcularCociente(int dividendo, int divisor) {
        if (dividendo < divisor) return 0;
        return 1 + calcularCociente(dividendo - divisor, divisor);
    }

    public static void main(String[] args) {
        System.out.println("------------ Ejercicio 1 ------------");
        System.out.println(esPalindromo("anitalavalatina"));
        System.out.println(esPalindromo(""));
        System.out.println(esPalindromo("b"));
        System.out.println(esPalindromo("aba"));
        System.out.println(esPalindromo("cabac"));

        System.out.println("------------ Ejercicio 2 ------------");
        System.out.println(imprimirStrBinarios("10b1"));
        System.out.println();
        System.out.println(imprimirStrBinarios("10bb1"));
        System.out.println();
        imprimirStrBinarios2("bbbb".toCharArray(), 0);

        System.out.println("------------ Ejercicio 3 ------------");
        System.out.println(calcularCociente(10, 3));
        System.out.println(calcularCociente(10, 2));
        System.out.println(calcularCociente(10, 10));
        System.out.println(calcularCociente(8, 4));
        System.out.println(calcularCociente(10, 11));
        System.out.println(calcularCociente(0, 11));
    }
}

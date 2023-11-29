package Prog3.Clase.Recursividad;

public class Ejercicios {

    private static boolean esPalindromo(String palabra) {
        if (palabra.length() == 1 || palabra.isEmpty()) return true;
        if (palabra.charAt(0) != palabra.charAt(palabra.length() - 1)) return false;

        return esPalindromo(palabra.substring(1, palabra.length() - 1));
    }

    private static String imprimirStrBinarios(String str) {
        if (!str.contains("b")) return str;

        String str0 = imprimirStrBinarios(str.replaceFirst("b", "0"));
        String str1 = imprimirStrBinarios(str.replaceFirst("b", "1"));

        return str0 + "\n" + str1;
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
        System.out.println(imprimirStrBinarios("10bb1"));
        System.out.println(imprimirStrBinarios("bbbb"));
    }
}

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

    private static void imprimirPermutacionesRecursivo(String str, String prefijo) {
        if (str.isEmpty()) {
            System.out.println(prefijo);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            imprimirPermutacionesRecursivo(str.substring(0, i) + str.substring(i + 1), prefijo + str.charAt(i));
        }
    }

    private static String invertirString(String str) {
        if (str.length() == 1) return str;
        return str.charAt(str.length() - 1) + invertirString(str.substring(0, str.length() - 1));
    }

    private static String invertirPalabras(String str) {
        if (str.isEmpty()) return "";

        String[] partes = str.split("[\\W]", 2); // [\\W] es cualquier caracter que no sea una letra o un numero
        if(partes.length < 2) return partes[0];

        return invertirPalabras(partes[1]) + " " + partes[0];
    }

    //Método longAHexa que recibe un long y devuelve su conversión a hexadecimal.
    private static String longAHexa(long num) {
        if (num < 16) {
            if (num > 9) {
                switch ((int) num) {
                    case 10:
                        return "A";
                    case 11:
                        return "B";
                    case 12:
                        return "C";
                    case 13:
                        return "D";
                    case 14:
                        return "E";
                    case 15:
                        return "F";
                }
            }
            return Long.toString(num);
        }
        return longAHexa(num / 16) + longAHexa(num % 16);
    }

    //Método imprimirVariaciones que imprima todos los strings de longitud r obtenidos al tomar r elementos con repetición de un conjunto de n elementos pasado como un array de caracteres. Por ejemplo, si recibe el array {A, B, C} y r = generará, AAA, AAB, AAC, ABA, ABB, . . . CCA, CCB, CCC.
    private static void imprimirVariaciones(char[] conjunto, int r, String resultado) {
        if (r == 0) {
            System.out.println(resultado);
            return;
        }
        for (char c : conjunto) {
            imprimirVariaciones(conjunto, r - 1, resultado + c);
        }
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

        System.out.println("------------ Ejercicio 4 ------------");
        imprimirPermutacionesRecursivo("ABC", "");

        System.out.println("------------ Ejercicio 5 ------------");
        System.out.println(invertirString("hola"));

        System.out.println("------------ Ejercicio 6 ------------");
        System.out.println(invertirPalabras("hola que tal"));

        System.out.println("------------ Ejercicio 7 ------------");
        System.out.println(longAHexa(10));
        System.out.println(longAHexa(16));
        System.out.println(longAHexa(17));
        System.out.println(longAHexa(255));

        System.out.println("------------ Ejercicio 8 ------------");
        imprimirVariaciones("ABC".toCharArray(), 3, " ");
    }
}

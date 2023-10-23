package Prog3.Clase.EjerciciosColecciones;

import java.util.Comparator;
import java.util.List;

public class Ejercicio02 {
    public static List<String> ordenarPalabrasInverso(List<String> palabras) {
        palabras.sort(Comparator.reverseOrder());
        return palabras;
    }
}

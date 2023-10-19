package Prog3.Clase.EjerciciosColecciones;

import java.util.List;

public class Ejercicio02 {
    public static List<String> ordenarPalabrasInverso(List<String> palabras) {
        palabras.sort((palabra1, palabra2) -> palabra2.compareTo(palabra1));
        return palabras;
    }
}

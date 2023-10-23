package Prog3.Clase.EjerciciosColecciones;

import java.util.List;

public class Ejercicio03 {
    public static List<String> ordenarPalabrasLongitud(List<String> palabras) {
        palabras.sort((palaba1, palabra2) -> -palabra2.length()+palaba1.length());
        return palabras;
    }
}

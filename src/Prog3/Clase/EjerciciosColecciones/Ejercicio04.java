package Prog3.Clase.EjerciciosColecciones;

import java.util.List;

public class Ejercicio04 {
    public static List<String> ordenarPalabrasLongitudInv(List<String> palabras) {
        palabras.sort((palabra1, palabra2)-> palabra2.length()-palabra1.length());
        return palabras;
    }
}

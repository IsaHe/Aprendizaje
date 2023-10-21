package Prog3.Clase.EjerciciosColecciones;

import java.util.List;

public class Ejercicio09 {
    public static List<String> convertirMayusculas(List<String> palabras) {
        palabras.replaceAll(String::toUpperCase);
        return palabras;
    }
}

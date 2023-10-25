package Prog3.Clase.EjerciciosColecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio10 {
    public static List<String> eliminarDuplicados(List<String> palabras) {
//        List<String> palabrasSinDuplicados = new ArrayList<>();
//        palabras.forEach(palabra -> {
//            if (!palabrasSinDuplicados.contains(palabra)) {
//                palabrasSinDuplicados.add(palabra);
//            }
//        });
        Set<String> palabrasSinDuplicados = new HashSet<>(palabras);

        return new ArrayList<>(palabrasSinDuplicados);
    }
}

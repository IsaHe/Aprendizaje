package Prog3.Clase.EjerciciosColecciones;

import java.util.*;

public class Ejercicio12 {
    public static List<Producto> eliminarDuplicados(List<Producto> productos) {
        Set<Producto> productosSinDuplicados = new LinkedHashSet<>(productos);
        return new ArrayList<>(productosSinDuplicados);
    }
}

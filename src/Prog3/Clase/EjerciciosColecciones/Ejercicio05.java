package Prog3.Clase.EjerciciosColecciones;

import java.util.Comparator;
import java.util.List;

public class Ejercicio05 {
    public static List<Producto> ordenarProductosId(List<Producto> productos) {
        productos.sort(Comparator.comparingInt(Producto::getId));
        return productos;
    }
}

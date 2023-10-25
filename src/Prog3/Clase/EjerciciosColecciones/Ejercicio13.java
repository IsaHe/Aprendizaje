package Prog3.Clase.EjerciciosColecciones;

import java.util.*;

public class Ejercicio13 {
    public static List<Producto> eliminarDuplicados(List<Producto> productos) {
//        Set<Producto> productosSinDuplicados = new HashSet<>(productos);
//        List<Producto> listaOrdenada = new ArrayList<>(productosSinDuplicados);
//        listaOrdenada.sort(Comparator.comparing(Producto::getEntrega).reversed());

        Set<Producto> productosSinDuplicadosOrdenados = new TreeSet<>(Comparator.comparing(Producto::getEntrega).reversed());
        productosSinDuplicadosOrdenados.addAll(productos);
        return new ArrayList<>(productosSinDuplicadosOrdenados);
    }
}

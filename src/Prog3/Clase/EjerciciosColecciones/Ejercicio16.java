package Prog3.Clase.EjerciciosColecciones;

import java.time.LocalDate;
import java.util.*;

public class Ejercicio16 {
    Map<LocalDate, List<Producto>> mapaEntregas = new TreeMap<>(Comparator.reverseOrder());
    public Ejercicio16(List<Producto> productos) {
        for (Producto p : productos) {
            mapaEntregas.putIfAbsent(p.getEntrega(), new ArrayList<>());
            mapaEntregas.get(p.getEntrega()).add(p);
        }
    }

    public List<Producto> obtenerProductos(LocalDate ld) {
        return mapaEntregas.getOrDefault(ld, Collections.emptyList());
    }

    public List<LocalDate> obtenerFechas() {
        return new ArrayList<>(mapaEntregas.keySet());
    }
}

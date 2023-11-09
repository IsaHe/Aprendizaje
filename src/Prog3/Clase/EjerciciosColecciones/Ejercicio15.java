package Prog3.Clase.EjerciciosColecciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio15 {
    public static List<Envio> agruparEnvios(List<Producto> productos) {

        Map<LocalDate, List<Producto>> mapaEntregas = new TreeMap<>();

        for(Producto p : productos) {
            mapaEntregas.putIfAbsent(p.getEntrega(), new ArrayList<>());
            mapaEntregas.get(p.getEntrega()).add(p);
        }

        List<Envio> envios = new ArrayList<>();
        for(Map.Entry<LocalDate, List<Producto>> e : mapaEntregas.entrySet()) {
            envios.add(new Envio(e.getKey(), e.getValue()));
        }

        return envios;
    }
}

package Prog3.Clase.EjerciciosColecciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio14 {
    public static List<Envio> agruparEnvios(List<Producto> productos) {

        Map<LocalDate, List<Producto>> listaEnviosAgrupados = new HashMap<>();
        for (Producto producto:productos) {
            listaEnviosAgrupados.putIfAbsent(producto.getEntrega(), new ArrayList<>());
            listaEnviosAgrupados.get(producto.getEntrega()).add(producto);
        }

        List<Envio> envios = new ArrayList<>();
        for (Map.Entry<LocalDate, List<Producto>> e : listaEnviosAgrupados.entrySet()) {
            envios.add(new Envio(e.getKey(), e.getValue()));
        }
        return envios;
    }
}

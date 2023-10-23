package Prog3.Clase.EjerciciosColecciones;

import java.time.LocalDate;
import java.util.List;

public class Ejercicio06 {
    public static List<Producto> ordenarProductosEntrega(List<Producto> productos) {
        productos.sort((producto1, producto2) -> {
            LocalDate fecha1 = producto1.getEntrega();
            LocalDate fecha2 = producto2.getEntrega();

            if(fecha1.getYear()<fecha2.getYear() || fecha1.getYear() == fecha2.getYear() && fecha1.getMonthValue()<fecha2.getMonthValue() || fecha1.getMonthValue() == fecha2.getMonthValue() && fecha1.getDayOfMonth()<fecha2.getDayOfMonth()) {
                return 1;
            }
            if (fecha1.getDayOfMonth() == fecha2.getDayOfMonth()) {
                return 0;
            }
            return -1;
        });
        return productos;
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Ejercicio01Test {
    
    @Test
    public void testOrdenarPalabras() {
        List<String> palabras = Arrays.asList("historia", "caricatura", "empatar", "zapato", "cueva");
        Prog3.Clase.EjerciciosColecciones.Ejercicio01.ordenarPalabras(palabras);
        Assertions.assertEquals("caricatura", palabras.get(0));
        Assertions.assertEquals("cueva", palabras.get(1));
        Assertions.assertEquals("empatar", palabras.get(2));
        Assertions.assertEquals("historia", palabras.get(3));
        Assertions.assertEquals("zapato", palabras.get(4));
    }
}

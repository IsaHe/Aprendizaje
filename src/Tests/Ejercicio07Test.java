import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ejercicio07Test {
    
    @Test
    public void testExistePalabra() {
        List<String> palabras = Arrays.asList("historia", "caricatura", "empatar", "zapato", "cueva");
        assertTrue(Prog3.Clase.EjerciciosColecciones.Ejercicio07.existePalabra(palabras, "caricatura"));
        assertTrue(Prog3.Clase.EjerciciosColecciones.Ejercicio07.existePalabra(palabras, "zapato"));

        assertFalse(Prog3.Clase.EjerciciosColecciones.Ejercicio07.existePalabra(palabras, "perro"));
    }
}

package Prog3.Clase.TestUnitarios;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlazaTest {

    @Test
    public void getId() {
        Plaza plaza = new Plaza("1", 1.0f);
        assertEquals("1", plaza.getId());
    }

    @Test
    public void getPrecioHora() {
        Plaza plaza = new Plaza("1", 1.0f);
        assertEquals(1.0f, plaza.getPrecioHora(), 0.1f);
    }

    @Test
    public void getOcupada() {
        Plaza plaza = new Plaza("1", 1.0f);
        assertFalse(plaza.getOcupada());
    }

    @Test
    public void setOcupada() {
        Plaza plaza = new Plaza("1", 1.0f);
        plaza.setOcupada(true);
        assertTrue(plaza.getOcupada());
    }

    @Test
    public void setPrecioHora() {
        Plaza plaza = new Plaza("1", 1.0f);
        plaza.setPrecioHora(2.0f);
        assertEquals(2.0f, plaza.getPrecioHora(), 0.0f);
    }

    @Test
    public void testToString() {
        Plaza plaza = new Plaza("1", 1.0f);
        assertEquals("1: 1,00", plaza.toString());
    }
}
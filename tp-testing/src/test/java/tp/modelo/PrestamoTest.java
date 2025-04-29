package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

class PrestamoTest {

    @Test
    void testCrearPrestamoCorrectamente() {
        Libro libro = new Libro("123", "Libro Prestamo", "Autor Prestamo");
        Prestamo prestamo = new Prestamo(libro);

        assertNotNull(prestamo.getFechaPrestamo());
        assertEquals(LocalDate.now(), prestamo.getFechaPrestamo());
        assertEquals(libro, prestamo.getLibro());
    }
}

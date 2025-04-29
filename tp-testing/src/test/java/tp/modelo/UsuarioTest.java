package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UsuarioTest {

    @Test
    void testAgregarPrestamoAlHistorial() {
        Usuario usuario = new Usuario("Bruno");
        Prestamo prestamoMock = mock(Prestamo.class);

        usuario.agregarPrestamo(prestamoMock);

        assertEquals(1, usuario.getHistorialPrestamos().size());
        assertTrue(usuario.getHistorialPrestamos().contains(prestamoMock));
    }

    @Test
    void testHistorialInicialVacio() {
        Usuario usuario = new Usuario("Bruno");
        assertTrue(usuario.getHistorialPrestamos().isEmpty());
    }
}

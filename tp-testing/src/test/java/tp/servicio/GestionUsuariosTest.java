package servicio;

import modelo.Usuario;
import modelo.Prestamo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GestionUsuariosTest {

    @Test
    public void testAgregarPrestamo() {
        Usuario usuario = new Usuario("Bruno");
        Prestamo prestamoMock = mock(Prestamo.class);

        usuario.agregarPrestamo(prestamoMock);

        assertEquals(1, usuario.getHistorialPrestamos().size());
        assertTrue(usuario.getHistorialPrestamos().contains(prestamoMock));
    }
}

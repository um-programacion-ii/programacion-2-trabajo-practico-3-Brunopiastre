package servicio;

import modelo.Libro;
import modelo.Usuario;
import modelo.Prestamo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

class SistemaPrestamosTest {

    private SistemaPrestamos sistema;
    private Libro libroMock;
    private Usuario usuarioMock;

    @BeforeEach
    void setUp() {
        sistema = new SistemaPrestamos();
        libroMock = mock(Libro.class);
        usuarioMock = mock(Usuario.class);
    }

    @Test
    void puedePrestarLibroDisponible() {
        when(libroMock.estaPrestado()).thenReturn(false);

        boolean resultado = sistema.prestarLibro(libroMock, usuarioMock);

        assertTrue(resultado);
        verify(libroMock).prestar();
    }

    @Test
    void noPuedePrestarLibroYaPrestado() {
        when(libroMock.estaPrestado()).thenReturn(true);

        boolean resultado = sistema.prestarLibro(libroMock, usuarioMock);

        assertFalse(resultado);
        verify(libroMock, never()).prestar();
    }

    @Test
    void puedeDevolverLibroPrestado() {
        when(libroMock.estaPrestado()).thenReturn(true);

        boolean resultado = sistema.devolverLibro(libroMock);

        assertTrue(resultado);
        verify(libroMock).devolver();
    }

    @Test
    void noPuedeDevolverLibroNoPrestado() {
        when(libroMock.estaPrestado()).thenReturn(false);

        boolean resultado = sistema.devolverLibro(libroMock);

        assertFalse(resultado);
        verify(libroMock, never()).devolver();
    }

    @Test
    void prestamosSeRegistranCorrectamente() {
        when(libroMock.estaPrestado()).thenReturn(false);

        sistema.prestarLibro(libroMock, usuarioMock);

        List<Prestamo> prestamos = sistema.getPrestamos();
        assertEquals(1, prestamos.size());
    }
}

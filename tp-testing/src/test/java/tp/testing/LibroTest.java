package tp.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @Test
    void libroSeCreaConTituloYAutorCorrectos() {
        Libro libro = new Libro("El Principito", "Saint-Exupéry");

        assertEquals("El Principito", libro.getTitulo());
        assertEquals("Saint-Exupéry", libro.getAutor());
        assertFalse(libro.estaPrestado());
    }

    @Test
    void libroPuedePrestarseYDevolverse() {
        Libro libro = new Libro("El Principito", "Saint-Exupéry");

        libro.prestar();
        assertTrue(libro.estaPrestado());

        libro.devolver();
        assertFalse(libro.estaPrestado());
    }
}

package modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @Test
    void testCrearLibroValido() {
        Libro libro = new Libro("978-3-16-148410-0", "Clean Code", "Robert C. Martin");
        assertEquals("978-3-16-148410-0", libro.getIsbn());
        assertEquals("Clean Code", libro.getTitulo());
        assertEquals("Robert C. Martin", libro.getAutor());
        assertEquals(EstadoLibro.DISPONIBLE, libro.getEstado());
    }

    @Test
    void testPrestarYDevolverLibro() {
        Libro libro = new Libro("123", "Libro Test", "Autor Test");
        assertFalse(libro.estaPrestado());

        libro.prestar();
        assertTrue(libro.estaPrestado());

        libro.devolver();
        assertFalse(libro.estaPrestado());
    }
}

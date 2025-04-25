package tp.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CatalogoTest {

    private Catalogo catalogo;

    @BeforeEach
    void setUp() {
        catalogo = new Catalogo();
        catalogo.agregarLibro(new Libro("El Principito", "Saint-Exupéry"));
        catalogo.agregarLibro(new Libro("1984", "George Orwell"));
        catalogo.agregarLibro(new Libro("Rebelión en la granja", "George Orwell"));
    }

    @Test
    void puedeAgregarLibrosYListarlosTodos() {
        List<Libro> todos = catalogo.getTodos();
        assertEquals(3, todos.size());
    }

    @Test
    void puedeBuscarPorTituloExistente() {
        List<Libro> resultados = catalogo.buscarPorTitulo("1984");
        assertEquals(1, resultados.size());
        assertEquals("George Orwell", resultados.get(0).getAutor());
    }

    @Test
    void puedeBuscarPorTituloInexistente() {
        List<Libro> resultados = catalogo.buscarPorTitulo("Cien años de soledad");
        assertTrue(resultados.isEmpty());
    }

    @Test
    void puedeBuscarPorAutorExistente() {
        List<Libro> resultados = catalogo.buscarPorAutor("George Orwell");
        assertEquals(2, resultados.size());
    }

    @Test
    void puedeBuscarPorAutorInexistente() {
        List<Libro> resultados = catalogo.buscarPorAutor("Gabriel García Márquez");
        assertTrue(resultados.isEmpty());
    }
}

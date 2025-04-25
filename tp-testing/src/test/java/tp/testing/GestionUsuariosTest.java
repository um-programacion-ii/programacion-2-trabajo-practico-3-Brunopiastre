package tp.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestionUsuariosTest {

    private GestionUsuarios gestionUsuarios;
    private Usuario usuario1;
    private Usuario usuario2;

    @BeforeEach
    void setUp() {
        gestionUsuarios = new GestionUsuarios();
        usuario1 = new Usuario("Bruno Piastrellini", "bruno@example.com");
        usuario2 = new Usuario("Juliana Piastrellini", "juliana@example.com");
    }

    @Test
    void puedeAgregarUsuarios() {
        gestionUsuarios.agregarUsuario(usuario1);
        gestionUsuarios.agregarUsuario(usuario2);

        assertEquals(2, gestionUsuarios.cantidadUsuarios());
    }

    @Test
    void puedeBuscarUsuarioExistente() {
        gestionUsuarios.agregarUsuario(usuario1);

        Usuario encontrado = gestionUsuarios.buscarUsuarioPorEmail("bruno@example.com");

        assertNotNull(encontrado);
        assertEquals("Bruno Piastrellini", encontrado.getNombre());
    }

    @Test
    void buscarUsuarioInexistenteDevuelveNull() {
        Usuario encontrado = gestionUsuarios.buscarUsuarioPorEmail("noexiste@example.com");

        assertNull(encontrado);
    }

    @Test
    void puedeEliminarUsuarioExistente() {
        gestionUsuarios.agregarUsuario(usuario1);

        boolean eliminado = gestionUsuarios.eliminarUsuarioPorEmail("bruno@example.com");

        assertTrue(eliminado);
        assertEquals(0, gestionUsuarios.cantidadUsuarios());
    }

    @Test
    void eliminarUsuarioInexistenteDevuelveFalse() {
        boolean eliminado = gestionUsuarios.eliminarUsuarioPorEmail("noexiste@example.com");

        assertFalse(eliminado);
    }
}

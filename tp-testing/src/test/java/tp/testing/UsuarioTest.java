package tp.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void usuarioSeCreaConNombreYEmailCorrectos() {
        Usuario usuario = new Usuario("Bruno Piastrellini", "bruno@example.com");

        assertEquals("Bruno Piastrellini", usuario.getNombre());
        assertEquals("bruno@example.com", usuario.getEmail());
    }
}

package tp.testing;

import java.util.HashMap;
import java.util.Map;

public class GestionUsuarios {
    private final Map<String, Usuario> usuarios;

    public GestionUsuarios() {
        this.usuarios = new HashMap<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.put(usuario.getEmail(), usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email) {
        return usuarios.get(email);
    }

    public boolean eliminarUsuarioPorEmail(String email) {
        return usuarios.remove(email) != null;
    }

    public int cantidadUsuarios() {
        return usuarios.size();
    }
}

package excepciones;

public class LibroNoDisponibleException extends RuntimeException {
    public LibroNoDisponibleException(String mensaje) {
        super(mensaje);
    }
}

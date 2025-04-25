package tp.testing;

import java.time.LocalDate;

public class Prestamo {
    private final Libro libro;
    private final Usuario usuario;
    private final LocalDate fechaPrestamo;

    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = LocalDate.now();
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
}

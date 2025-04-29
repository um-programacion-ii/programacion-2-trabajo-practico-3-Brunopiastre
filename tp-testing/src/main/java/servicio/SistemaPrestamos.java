package servicio;

import modelo.Libro;
import modelo.Usuario;
import modelo.Prestamo;

import java.util.ArrayList;
import java.util.List;

public class SistemaPrestamos {
    private List<Prestamo> prestamos;

    public SistemaPrestamos() {
        this.prestamos = new ArrayList<>();
    }

    public boolean prestarLibro(Libro libro, Usuario usuario) {
        if (!libro.estaPrestado()) {
            libro.prestar();
            prestamos.add(new Prestamo(libro));
            return true;
        }
        return false;
    }

    public boolean devolverLibro(Libro libro) {
        if (libro.estaPrestado()) {
            libro.devolver();
            return true;
        }
        return false;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
}

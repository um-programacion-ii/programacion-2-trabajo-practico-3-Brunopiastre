package tp.testing;

import java.util.ArrayList;
import java.util.List;

public class SistemaPrestamos {
    private final List<Prestamo> prestamos;

    public SistemaPrestamos() {
        this.prestamos = new ArrayList<>();
    }

    public boolean prestarLibro(Libro libro, Usuario usuario) {
        if (libro.estaPrestado()) {
            return false;
        }

        libro.prestar();
        Prestamo nuevoPrestamo = new Prestamo(libro, usuario);
        prestamos.add(nuevoPrestamo);
        return true;
    }

    public boolean devolverLibro(Libro libro) {
        if (!libro.estaPrestado()) {
            return false;
        }

        libro.devolver();
        return true;
    }

    public List<Prestamo> getPrestamos() {
        return new ArrayList<>(prestamos); // copia defensiva
    }
}

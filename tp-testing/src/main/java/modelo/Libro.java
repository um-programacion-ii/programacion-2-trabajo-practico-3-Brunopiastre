package modelo;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private EstadoLibro estado;

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.estado = EstadoLibro.DISPONIBLE;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public EstadoLibro getEstado() {
        return estado;
    }

    public boolean estaPrestado() {
        return estado == EstadoLibro.PRESTADO;
    }

    public void prestar() {
        estado = EstadoLibro.PRESTADO;
    }

    public void devolver() {
        estado = EstadoLibro.DISPONIBLE;
    }
}

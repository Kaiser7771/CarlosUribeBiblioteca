import java.util.Objects;

public class Libro extends Recurso{
private String autor;
private int ISBN;
    public Libro(int codigo, String titulo, int anio, String estado, String autor, int ISBN ) {
        super(codigo, titulo, anio, estado);
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public int getISBN() {
        return ISBN;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Libro libro)) return false;
        return getCodigo() == libro.getCodigo() && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, getCodigo());
    }
}


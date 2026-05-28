import java.util.Objects;

public class Revista extends Recurso{
private int numEdicion;
private String editorial;

    public Revista(int codigo, String titulo, int anio, String estado, int numEdicion, String editorial) {
        super(codigo, titulo, anio, estado);
        this.numEdicion = numEdicion;
        this.editorial = editorial;
    }

    public int getNumEdicion() {
        return numEdicion;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Revista revista)) return false;
        if (!super.equals(o)) return false;
        return numEdicion == revista.numEdicion && Objects.equals(editorial, revista.editorial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numEdicion, editorial);
    }
}

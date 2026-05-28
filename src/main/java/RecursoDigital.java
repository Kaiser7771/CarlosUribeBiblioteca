import java.util.Objects;

public class RecursoDigital extends Recurso{

private String URL;
    public RecursoDigital(int codigo, String titulo, int anio, String estado, String URL) {
        super(codigo, titulo, anio, estado);
        this.URL = URL;

    }

    public String getURL() {
        return URL;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RecursoDigital that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(URL, that.URL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), URL);
    }
}

import java.util.Objects;

public abstract class Recurso {
private int codigo;
private String titulo;
private int anio;
public String estado;

public Recurso(int codigo, String titulo, int anio, String estado){
    this.codigo = codigo;
    this.titulo = titulo;
    this.anio = anio;
    this.estado = estado;
}

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Recurso recurso)) return false;
        return codigo == recurso.codigo && anio == recurso.anio && Objects.equals(titulo, recurso.titulo) && Objects.equals(estado, recurso.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, titulo, anio, estado);
    }
}

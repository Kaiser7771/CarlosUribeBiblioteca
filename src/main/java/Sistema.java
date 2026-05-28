import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sistema {

    private List<Usuario> usuarios = new ArrayList<>();

    private List<Libro> libros = new ArrayList<>();

    private List<Revista> revistas = new ArrayList<>();

    private Map<Libro, Usuario> librosPrestados = new HashMap<>();

    private Map<Revista, Usuario> revistasPrestadas = new HashMap<>();

    private List<Recurso> recursos = new ArrayList<>();


    public void agregarLibro (Libro libro) throws RecursoDuplicadoException{
        for(int i = 0; i < libros.size(); i++){
            if(libros.get(i).equals(libro)){
                throw new RecursoDuplicadoException("Recurso duplicado");
            }else{
                libros.add(libro);
            }
        }
    }

    public void agregarRevista (Revista revista) throws RecursoDuplicadoException{
        for(int i = 0; i < revistas.size(); i++){
            if(revistas.get(i).equals(revista)){
                throw new RecursoDuplicadoException("Recurso duplicado");
            }else{
                revistas.add(revista);
            }
        }
    }

    public void agregarRecurso(Recurso recurso) throws RecursoDuplicadoException{
        for(int i = 0; i < recursos.size(); i++){
            if(revistas.get(i).equals(recurso)){
                throw new RecursoDuplicadoException("Recurso duplicado");
            }else{
                recursos.add(recurso);
            }
        }
    }

    public void prestarLibro (Libro libro, Usuario usuario)  throws RecursoNoDisponibleException{
        if(libro.getEstado() == "Disponible" && libro.getAnio() > 1923){
         librosPrestados.put(libro, usuario);
         libro.estado = "No disponible";
            System.out.println("Libro " + libro.getTitulo() + "Prestado a " + usuario.getNombre());
        }else throw new RecursoNoDisponibleException("Libro no disponible o no prestable");

    }
    public void prestarRevista (Revista revista, Usuario usuario)  throws RecursoNoDisponibleException{
        if(revista.getEstado() == "Disponible" && revista.getAnio() > 1923){
            revistasPrestadas.put(revista, usuario);
            revista.estado = "No disponible";
            System.out.println("Revista " + revista.getTitulo() + "Prestada a " + usuario.getNombre());
        }else throw new RecursoNoDisponibleException("Revista no disponible o no prestable");
    }
    public void buscarRecurso(int codigo, ArrayList<Recurso> recursos){
        for(int i = 0; i < recursos.size(); i++){
            if(codigo == recursos.get(i).getCodigo()){

            }
        }
    }





}

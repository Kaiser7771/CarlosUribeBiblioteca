public class BiblioApp {
    public static void main(String[] args){

        Sistema sistema = new Sistema();
        Libro libro1 = new Libro(10, "El codigo Da Vinci", 2010, "Disponible", "Dan Brown", 2910);
        Libro libro2 = new Libro(20, "El algebra de Baldor", 1950, "No disponible", "Baldor", 2000);
        Revista revista1 = new Revista(43, "Semana", 2026, "Disponible", 345, "Semana");
        Revista revista2 = new Revista(100, "Forbes", 2020, "Disponible", 30, "Mundo");
        RecursoDigital link1 = new RecursoDigital(241, "Enciclopedia", 2001, "Disponible", "www.ejemplo1.org");
        RecursoDigital link2 = new RecursoDigital(501, "Biblia online", 1, "Disponible", "www.ejemplo2.org");



    }
}

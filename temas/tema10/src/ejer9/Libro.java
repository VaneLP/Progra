package ejer9;

public class Libro extends Publicacion{
    //atributos
    private final int isbn;
    private final String titulo, autor;
    private int numeroEjemplares;

    //constructor
    public Libro(int isbn, String titulo, String autor, int numeroEjemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
    }


    @Override
    public String mostrarEnLinea() {
        return null;
    }
}

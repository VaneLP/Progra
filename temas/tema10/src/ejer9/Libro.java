package ejer9;

public class Libro extends Publicacion{
    //atributos
    private final String isbn;
    private final String titulo, autor;
    private int numeroEjemplares;

    //constructor
    public Libro(String isbn, String titulo, String autor) {
        if(isbn.matches("[0-9]{13}")) {
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.numeroEjemplares =1;
        }
        else {
            isbn = null;
            titulo = null;
            autor=null;
            numeroEjemplares=0;
        }
    }

    public Libro(int numeroEjemplares){
        this(isbn,titulo,autor);
        this.numeroEjemplares=numeroEjemplares;
    }


    @Override
    public String mostrarEnLinea() {
        return null;
    }
}

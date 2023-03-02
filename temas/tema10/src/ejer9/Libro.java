package ejer9;

import ejer9.Excepciones.PublicationException;
import ejer9.Excepciones.ValorIncorrecto;

public class Libro extends Publicacion{
    //atributos
    private final String isbn;
    private final String titulo, autor;
    private int numeroEjemplares;

    //constructor
    public Libro(String isbn, String titulo, String autor) throws PublicationException {
        if(isbn.matches("[0-9]{13}")) {
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.numeroEjemplares =1;
        }
        else {
            throw new PublicationException();
        }

    }

    public Libro(String isbn, String titulo, String autor,int numeroEjemplares) throws PublicationException{
        if(isbn.matches("[0-9]{13}")) {
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.numeroEjemplares = numeroEjemplares;
        }
        else {
            throw new PublicationException();
        }
    }

    //getters y setters
    //isbn
    public String getIsbn() {
        return isbn;
    }

    //titulo
    public String getTitulo() {
        return titulo;
    }

    //autor
    public String getAutor() {
        return autor;
    }

    //numero de ejemplares
    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }
    public void setNumeroEjemplares(int numeroEjemplares) throws ValorIncorrecto{
        if(numeroEjemplares>0)
            this.numeroEjemplares = numeroEjemplares;
        else
            throw new ValorIncorrecto(0);
    }

    //metodos
    @Override
    public String mostrarEnLinea() {
        return String.format("%15s, %15s, %15s, %15s, %15s","ID|", "isbn|","titulo|","autor|", "numero de ejemplares"+
                            "%15s, %15s, %15s, %15s, %15s",this.idUnico,this.isbn,this.titulo,this.autor,this.numeroEjemplares);
    }
}

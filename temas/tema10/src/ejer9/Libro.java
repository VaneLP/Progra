package ejer9;

import ejer9.Excepciones.PublicationException;
import ejer9.Excepciones.ValorIncorrecto;

import java.util.Objects;

public class Libro extends Publicacion {
    //atributos
    private final String isbn;
    private final String titulo;
    private final Autor autor;
    private int numeroEjemplares;

    //constructor
    public Libro(String isbn, String titulo, Autor autor) throws PublicationException {
        this(isbn,titulo,autor,1);
    }

    public Libro(String isbn, String titulo, Autor autor,int numeroEjemplares) throws PublicationException{
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
    public Autor getAutor() {
        return autor;
    }

    //numero de ejemplares
    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }
    public void setNumeroEjemplares(int numeroEjemplares) throws ValorIncorrecto{
        if(numeroEjemplares>=0)
            this.numeroEjemplares = numeroEjemplares;
        else
            throw new ValorIncorrecto("0");
    }

    //metodos
    @Override
    public String mostrarEnLinea() {
        return String.format("%15s, %15s, %15s, %15s, %15s","ID|", "isbn|","titulo|","autor|", "numero de ejemplares"+
                            "%15d, %15d, %15s, %15s, %15d",this.idUnico,this.isbn,this.titulo,this.autor,this.numeroEjemplares);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn) && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, titulo, autor, numeroEjemplares);
    }

//    @Override
//    public int compareTo(Libro o) {
//        int resultado=this.titulo.compareTo(libro.titulo)
//
//        if (resultado==0)
//                resultado=this.autor.compareTo(l.autor);
//
//        return resultado;
//    }
}

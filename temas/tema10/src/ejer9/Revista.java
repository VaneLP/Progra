package ejer9;

import ejer9.Excepciones.PublicationException;

import java.util.Objects;

public class Revista extends Publicacion implements Comparable<Revista>{
    //atributos
    private final String issn, nombre;
    private final int numero;

    //constructor
    public Revista(String issn, String nombre, int numero) throws PublicationException {
        if(issn.matches("[0-9]{8}")) {
            this.issn = issn;
            this.nombre = nombre;
            this.numero = numero;
        }
        else{
            throw new PublicationException();
        }
    }

    //getters
    //issn
    public String getIssn() {
        return issn;
    }

    //nombre
    public String getNombre() {
        return nombre;
    }

    //numero
    public int getNumero() {
        return numero;
    }

    //metodos
    @Override
    public String mostrarEnLinea() {
        return String.format("%15s, %15s, %15s, %15s","ID|", "issn|","nombre|","numero|"+
                "%15s, %15s, %15s, %15s",this.idUnico,this.issn,this.nombre,this.numero);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Revista revista = (Revista) o;
        return Objects.equals(issn, revista.issn) && Objects.equals(nombre, revista.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issn, nombre);
    }

    @Override
    public int compareTo(Revista r) {
        return nombre.compareTo(r.getNombre());
    }

}

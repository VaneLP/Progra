package ejer9;

import ejer9.Excepciones.PublicationException;

public class Revista{
    //atributos
    private final String issn;
    private final String nombre;
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

}

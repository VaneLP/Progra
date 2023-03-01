package ejer9;

public class Revista{
    //atributos
    private final String issn;
    private final String nombre;
    private final int numero;

    //constructor
    public Revista(String issn, String nombre, int numero) {
        if(issn.matches("[0-9]{8}")) {
            this.issn = issn;
            this.nombre = nombre;
            this.numero = numero;
        }
        else{
            this.issn=null;
            this.nombre=null;
        }
    }

}

package e_7_monopoly;

public class Casilla {
    //atributo
    private final String nombreMono;
    private int codigo = 0;

    //constructor
    public Casilla(String nombreMono) {
        this.nombreMono = nombreMono;
        codigo += 1;
    }


}

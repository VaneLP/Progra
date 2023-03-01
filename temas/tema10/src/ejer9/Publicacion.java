package ejer9;

public abstract class Publicacion {
    //atributos
    static int idGlobal=1;
    int idUnico;

    //constructor
    public Publicacion() {
        this.idUnico = idGlobal;
        idGlobal++;
    }

    //metodo
    public abstract String mostrarEnLinea();

}

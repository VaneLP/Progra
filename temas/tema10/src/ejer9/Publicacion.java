package ejer9;

public abstract class Publicacion implements Comparable<Publicacion> {
    //atributos
    static int idGlobal=1;
    final int idUnico;

    //constructor
    public Publicacion() {
        this.idUnico = idGlobal;
        idGlobal++;
    }

    //metodo
    public abstract String mostrarEnLinea();
    //el profe lo hace con void

    @Override
    public int compareTo(Publicacion publicacion) {
        if (this.getClass().equals(publicacion.getClass()))
            return 0;
        else if (this instanceof Revista)
            return 1;
        else
            return -1;
    }

}

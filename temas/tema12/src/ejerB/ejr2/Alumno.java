package ejerB.ejr2;

public class Alumno {
    //atributos
    String nombre, apellido;
    int notaMedia;

    //construcctor
    public Alumno(String nombre, String apellido, int notaMedia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaMedia = notaMedia;
    }

    //getter y setters
    //nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //apellido
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //nota media
    public int getNotaMedia() {
        return notaMedia;
    }
    public void setNotaMedia(int notaMedia) {
        this.notaMedia = notaMedia;
    }
}

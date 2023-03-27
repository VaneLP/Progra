package ejerAgendaTelefonica;

public class Registro {
    //atributos
    private String nombre, telefono;

    //constructor
    public Registro(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //getter y setters
    //nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //telefono
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

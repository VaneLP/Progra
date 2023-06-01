package Ejercicio_CRUD;
/*
Ciudades tiene
- CountryCode (char) - no lo pide
- District (char)
- id (int, clave)
- name (char)
- population (int)
*/
public class Ciudades {
    //atributos
    String nombre, distrito;
    String id;
    long poblacion;

    //constructor
    public Ciudades(String nombre, String distrito, String id, long poblacion) {
        this.nombre = nombre;
        this.distrito = distrito;
        this.id = id;
        this.poblacion = poblacion;
    }

    //getters y setters
    //nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //distrito
    public String getDistrito() {
        return distrito;
    }
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    //id
    public String getId() {
        return id;
    }

    //poblacion
    public long getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

}

package Ejercicio_CRUD;
/*
Clientes tiene
- direccion (varchar)
- id (int, clave)
- nombre (varchar)
*/
public class Cliente {
    //atributos
    String nombre, direccion;
    long id;

    //constructor
    public Cliente(String nombre, String direccion, long id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = id;
    }

    //getters y setters
    //nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //direccion
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //id
    public long getId() {
        return id;
    }

}

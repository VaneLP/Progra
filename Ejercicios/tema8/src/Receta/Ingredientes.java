package Receta;

public class Ingredientes {
    //atributos
    private String nombre, unidad;
    private int cantidad;

    //constructor
    public Ingredientes(String nombre, int cantidad, String unidad){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.unidad=unidad;
    }

    //getters y setters
    //nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //unidad
    public String getUnidad() {
        return unidad;
    }
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    //cantidad
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //metodos


    @Override
    public String toString() {
        return  nombre + " cantidad= " + cantidad + " " + unidad;
    }
}

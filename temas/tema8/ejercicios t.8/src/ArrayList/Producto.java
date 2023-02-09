package ArrayList;

public class Producto {
    //atributos
    private String nombre;
    private int cantidad;

    //constructor
    public Producto (String nombre,int cantidad){
        this.nombre=nombre;
        this.cantidad=cantidad;
    }

    //getters and setters
    //nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //cantidad
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto:" + nombre +
                " Cantidad:" + cantidad;
    }
}

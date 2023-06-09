package examen_2Oportunidad;

public abstract class Producto {
    //atributos
    public String nombre;
    public double precio;

    //constructor
    public Producto(String nombre, double precio) throws Exception{
        if(precio<0) {
            throw new Exception("Producto con precio negativo");
        }
        else {
            this.nombre = nombre;
            this.precio = precio;
        }

    }

    //getters de nombre y precio
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    //metodo abstracto
    public abstract double calcularDescuento();

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}

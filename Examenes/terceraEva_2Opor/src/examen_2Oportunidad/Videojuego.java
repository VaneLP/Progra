package examen_2Oportunidad;

public class Videojuego extends Producto {
    //atributos
    private int edadRecomendada;

    //constructor
    public Videojuego(String nombre, double precio, int edadRecomendada) throws Exception {
        super(nombre, precio);
        this.edadRecomendada = edadRecomendada;
    }

    //metodo heredado
    @Override
    public double calcularDescuento() {
        //si la edad recomandada es inferior o = 7 descuento 15%
        if (edadRecomendada <= 7)
            return getPrecio() * 0.15;
            //en caso contrario no se aplica descuento
        else
            return getPrecio();
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "edadRecomendada=" + edadRecomendada +
                '}';
    }
}


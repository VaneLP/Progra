package examen_2Oportunidad;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GestionProductos {
    //guardamos todos los productos en una lista
    private List<Producto> productos =new ArrayList<>();

    //metodos
    /**
     * para agregar productos a nuestra lista que son de tipo electrodomestico
     * @param nombre le pasamos el nombre
     * @param precio le pasamos el precio
     * @param consumoEnergetico le pasamos el consumo
     */
    public void agregarProductos (String nombre, double precio, Consumos consumoEnergetico){
        try {
            productos.add(new Electrodomestico(nombre,precio,consumoEnergetico));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * metodo sobrecargado al cual añadiremos productos de tipo videojuego a nuestra lista
     * @param nombre le pasamos el nombre
     * @param precio le pasamos el precio
     * @param edadRecomendada le pasamos la edad recomendada
     */
    public void agregarProductos (String nombre, double precio, int edadRecomendada){
        try {
            productos.add(new Videojuego(nombre,precio,edadRecomendada));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Videojuego> listaViedeoJuegos(){
        //creamos una nueva lista en la que vamos a añadir nuestros videojuegos que tengamos en productos
        List<Videojuego> lista = new ArrayList<>();

        //recoorremos nuestra lista de productos
        for (Producto producto : productos) {
            //cuando un producto sea un videojuego
            if (producto instanceof Videojuego)
                //lo guardamos en nuestra lista
                lista.add((Videojuego) producto);
        }

        //clase anonima para ordenar los videojuegos por precio de menor a mayor
        lista.sort(new Comparator<Videojuego>() {
            @Override
            public int compare(Videojuego v1, Videojuego v2) {
                if (v1.getPrecio() > v2.getPrecio())
                    return -1;
                if (v1.getPrecio() < v2.getPrecio())
                    return 1;
                else
                    return 0;
            }
        });

        return lista;
    }

    /**
     * metodo que busca el producto que coincida con el nombre que se le pasa
     * @param nombreBuscar nombre del producto que estamos buscando
     * @return devuelve ese producto buscaod
     */
    public Producto buscarProducto(String nombreBuscar) throws Exception{
        //recorremos nuestra lista de productos
        for (Producto producto : productos) {
            //si el nombre del producto es igual al nombre que se busca
            if(producto.getNombre().equalsIgnoreCase(nombreBuscar)) {
                //lo devolvemos y salimos
                return producto;
            }
        }

        //si no encontramos el producto tiramos excepcion
        throw new Exception("Producto no encontrado");
    }

    public void mostrarLista(){
        //ordenamos la lista por nombre
        productos.sort(new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                return p1.getNombre().compareToIgnoreCase(p2.getNombre());
            }
        });

        //recorremos los productos
        for (Producto p : productos) {
            //devolvemos una cadena formateada
            System.out.printf("%10s Nombre %.2f Precio %d Descuento %.2f Precio_Descuento%n", p.getNombre(),p.getPrecio(),(p.getPrecio()-p.calcularDescuento()),p.calcularDescuento());
        }

    }

}

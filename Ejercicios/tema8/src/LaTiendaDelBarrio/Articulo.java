package LaTiendaDelBarrio;

import java.util.ArrayList;

public class Articulo {
    //atributos
    private static int idTodos;
    private int id;
    private int stock;
    private double precioVenta, precioCompra;
    private final static int iva=21;
    private String nombre;
    private static ArrayList <Articulo> listaArticulos = new ArrayList<>();

    //constructor
    public Articulo (String nombre, double precioVenta, double precioCompra, int stock){
        if (precioVenta>0 && precioCompra>0 && stock>=0){
            this.nombre = nombre;
            this.id = idTodos + 1;
            idTodos=id;
            this.precioVenta = precioVenta;
            this.precioCompra = precioCompra;
            this.stock = stock;
        }else {
            System.err.println("ERROR al instanciar el Articulo...");
        }
    }

    //getters y setters
    //id
    public int getId() {
        return id;
    }

    //precio venta
    public double getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    //precio compra
    public double getPrecioCompra() {
        return precioCompra;
    }
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    //stock
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    //nombre
    public String getNombre() {
        return nombre;
    }

    //lista articulo
    public static ArrayList<Articulo> getListaArticulos() {
        return listaArticulos;
    }
    public static void setListaArticulos(ArrayList<Articulo> listaArticulos) {
        Articulo.listaArticulos = listaArticulos;
    }



    //metodos
    public boolean venderCliente (int cantidad){
        if(stock>0 && cantidad>0 && cantidad<stock){
            this.stock= this.stock-cantidad;
            return true;
        }
        System.err.println("No se puede realizar la accion solicitada");
        return false;
    }

    public boolean comprarProve (int cantidad){
        if(cantidad>0){
            this.stock= this.stock+cantidad;
            return true;
        }
        System.err.println("No se puede realizar la accion solicitada");
        return false;
    }

    //creamos un metodo en el que le pasamos como parametro un objeto y lo añadimos a la arraylist
    public void anyadirArticulo(Articulo arti){
        this.listaArticulos.add(arti);
    }
    //Creamos un nuevo articulo con las atributos asignadas
    public void anyadirArticulo(String nombre, double precioVenta, double precioCompra, int stock){
        anyadirArticulo(new Articulo(nombre,precioVenta,precioCompra,stock));
    }

    @Override
    public String toString() {
        return "\nArticulo" +
                "\n______________________"+
                "\nID: "+ id +
                "\nNombre: "+ nombre+
                "\nPrecio de venta al publico: " + precioVenta +
                "\nPrecio de compra: " + precioCompra +
                "\nIVA: "+ iva +
                "\nStock: " + stock;
    }
}

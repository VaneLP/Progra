package LaTiendaDelBarrio;

public class Articulo {
    //atributos
    private static int id;
    private int stock;
    private double precioVenta, precioCompra;
    private final static int iva=21;
    private String nombre;

    //constructor
    public Articulo (String nombre, double precioVenta, double precioCompra, int stock){
        if (precioVenta>0 && precioCompra>0 && stock>=0){
            this.nombre = nombre;
            this.id = Articulo.id + 1;
            this.precioVenta = precioVenta;
            this.precioCompra = precioCompra;
            this.stock = stock;
        }
        System.err.println("ERROR al instanciar el Articulo...");
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
    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    //precio compra
    public double getPrecioCompra() {
        return precioCompra;
    }
    public void setPrecioCompra(int precioCompra) {
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

    @Override
    public String toString() {
        return "Articulo" +
                "\n______________________"+
                "\nID: "+ id +
                "\nNombre: "+ nombre+
                "\nPrecio de venta al publico: " + precioVenta +
                "\nPrecio de compra: " + precioCompra +
                "\nIVA: "+ iva +
                "\nStock: " + stock;
    }
}

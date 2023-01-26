package ejerciciosD;
/*
Crea un programa con una clase llamada Articulo con los siguientes atributos: nombre,
precio (sin IVA), iva (siempre será 21) y cuantosQuedan (representa cuantos quedan en
el almacén)
 */
public class Articulo {
    private String nombre;
    private double precio;
    private int iva, cuantosQuedan;

    //getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //-------------------------------
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        if (precio>0) {
            this.precio = precio;
        }
        else
            System.err.println("ERROR al instanciar Articulo...");
    }
    //-------------------------------
    public int getIva() {
        return iva;
    }
    public void setIva(int iva) {
        if (iva == 21) {
        }
        else
            System.err.println("ERROR al instanciar Articulo...");
    }
    //-------------------------------
    public int getCuantosQuedan() {
        return cuantosQuedan;
    }
    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan>0) {
            this.cuantosQuedan=cuantosQuedan;
        }
        else
            System.err.println("ERROR al instanciar Articulo...");
    }

    //constructor
    public Articulo (String nombre, double precio, int iva, int cuantosQuedan) {
        if (iva == 21 && precio > 0 && cuantosQuedan > 0) {
            this.iva = iva;
            this.precio = precio;
            this.nombre = nombre;
            this.cuantosQuedan = cuantosQuedan;
        } else
            System.err.println("ERROR al instanciar Articulo...");
    }

    //añadir metodos
    public void imprime(){
        System.out.println("Nombre del articulo: "+ this.nombre+ " - Precio: "+ this.precio+"€ - IVA: "+this.iva+ "% - Cuantos quedan: "+this.cuantosQuedan);
    }

    public double getPVP (){
        return (((this.precio/100)*this.iva)+this.precio);
    }

    public double getPVPDescuento(int descuento){
        return this.precio-((getPVP()/100)*descuento);
    }

    public boolean vender(int cantidad){
        if (this.cuantosQuedan>=cantidad){
            this.cuantosQuedan=this.cuantosQuedan-cantidad;
            return true;
         }
         else
            return false;
    }

    public boolean almacenar(int cantidad){
        if (cantidad>0){
            this.cuantosQuedan+=cantidad;
            return true;
        }
            return false;
    }
}

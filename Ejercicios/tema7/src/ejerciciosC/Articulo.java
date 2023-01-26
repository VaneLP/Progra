package ejerciciosC;
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
    public Articulo (String nombre, double precio, int iva, int cuantosQuedan){
        if (iva == 21 && precio>0 && cuantosQuedan>0) {
            this.iva = iva;
            this.precio = precio;
            this.nombre= nombre;
            this.cuantosQuedan=cuantosQuedan;
        }
        else
        System.err.println("ERROR al instanciar Articulo...");

    }
}

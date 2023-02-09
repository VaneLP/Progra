package ejerciciosB;
/*
Crea un programa con una clase llamada Articulo con los siguientes atributos: nombre,
precio (sin IVA), iva (siempre será 21) y cuantosQuedan (representa cuantos quedan en
el almacén)
 */
public class Articulo {
    String nombre;
    double precio;
    int iva=21, cuantosQuedan;

    public Articulo (String nombre, double precio, int iva, int cuantosQuedan){
        this.nombre= nombre;

        if (iva == 21 && precio>0 && cuantosQuedan>0) {
            this.iva = iva;
            this.precio = precio;
            this.cuantosQuedan=cuantosQuedan;
        }
        else {
            System.err.println("ERROR al instanciar Articulo...");
        }

    }
}

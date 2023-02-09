package ejerciciosA;
/*
En el main de la clase principal instancia un objeto de la clase artículo. Asígnale valores a
todos sus atributos (los que quieras) y muestra por pantalla un mensaje del estilo
“Pijama - Precio:10€ - IVA:21% - PVP:12,1€” (el PVP es el precio de venta al público, es
decir, el precio con IVA). Luego, cambia el precio y vuelve a imprimir el mensaje
 */
public class main_Articulo {
    public static void main(String[] args) {
        //variable
        Articulo a1=new Articulo();

        a1.nombre= "Pijama";
        a1.precio=10;
        a1.cuantosQuedan=8;

        System.out.println(a1.nombre+ " - " + "Precio: " + a1.precio + "€ - " + "IVA:" +a1.iva + "% - " + "PVP:" + (((a1.precio/100)*a1.iva)+a1.precio) + "€");

        a1.precio=20;

        System.out.println(a1.nombre+ " - " + "Precio: " + a1.precio + "€ - " + "IVA:" +a1.iva + "% - " + "PVP:" + (((a1.precio/100)*a1.iva)+a1.precio) + "€");
    }
}

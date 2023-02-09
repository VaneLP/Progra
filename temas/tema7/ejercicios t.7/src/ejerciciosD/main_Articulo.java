package ejerciciosD;

/*
En el main de la clase principal instancia un objeto de la clase artículo. Asígnale valores a
todos sus atributos (los que quieras) y muestra por pantalla un mensaje del estilo
“Pijama - Precio:10€ - IVA:21% - PVP:12,1€” (el PVP es el precio de venta al público, es
decir, el precio con IVA). Luego, cambia el precio y vuelve a imprimir el mensaje
 */
public class main_Articulo {
    public static void main(String[] args) {
        //variable
        Articulo a1=new Articulo("Pijama",10,21,8);

        System.out.println(a1.getNombre()+ " - " + "Precio: " + a1.getPrecio() + "€ - " + "IVA:" +a1.getIva() + "% - " + "PVP:" + (((a1.getPrecio()/100)*a1.getIva())+a1.getPrecio()) + "€");

        a1.setPrecio(20);

        System.out.println(a1.getNombre()+ " - " + "Precio: " + a1.getPrecio() + "€ - " + "IVA:" +a1.getIva() + "% - " + "PVP:" + (((a1.getPrecio()/100)*a1.getIva())+a1.getPrecio()) + "€");


        System.out.println("-----------------------------------------------------------");
        a1.imprime();
        a1.getPVP();
        System.out.println("Descuento:"+a1.getPVPDescuento(40));
        System.out.println("vendido:"+a1.vender(15));
        System.out.println("almacenado:"+a1.almacenar(15));
    }
}

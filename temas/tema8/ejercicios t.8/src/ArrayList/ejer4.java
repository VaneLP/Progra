package ArrayList;

public class ejer4 {
    /*Diseñar una clase Factura que consta de:
• Número identificador: lo proporciona el usuario en el alta de la factura.
• Fecha de la factura: la toma del sistema en el momento del alta.
• Número de cliente: lo proporciona el usuario en el alta de la factura.
• Porcentaje de IVA: 21% para todas las facturas.
• Un número indeterminado de lineaFactura que contienen:
    ◦ Descripción del producto
    ◦ Precio unitario
    ◦ Cantidad de unidades
    ◦ Porcentaje de descuento: 5% para líneas con más de 10 unidades.
    ◦ Importe total de la línea.
• Importe total: inicialmente cero, y se va actualizando siempre que se añadan/eliminen líneas.

Implementar la clase con su constructor y métodos para añadir línea de factura, eliminar línea de factura y mostrar la factura por consola.
Te hará falta una clase LineaFactura con su constructor. Para añadir línea de factura, habrá que solicitar al usuario los campos necesarios
para añadirlo (descripción, precio unitario y cantidad de unidades). Para eliminar una línea, solicitaremos el número de línea.

Hacer también un programa con un menú para gestionar una factura (alta, añadir/eliminar líneas, mostrar factura) Nota: pensar en método toString() para LíneaFactura.*/
    public static void main(String[] args) {
        LineaFactura l1= new LineaFactura("tornillo",0.75,15);
        System.out.println(l1);

        Factura miFactura=new Factura("1001","1");
        miFactura.anyadirLinea("tornillos",0.75,15);
        miFactura.anyadirLinea("tuercas",0.345,150);
        miFactura.anyadirLinea("Arandelas",1.8,5);
        miFactura.mostrar();

        miFactura.eliminarLinea(2);
        miFactura.mostrar();

    }
}

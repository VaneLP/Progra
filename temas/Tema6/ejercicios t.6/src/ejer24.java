import java.util.Scanner;

public class ejer24 {
    /*
    24.Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada uno tras aplicarle un 21% de IVA.
    Implementa y utiliza la función
    double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
     */

    //-----------FUNCIONES---------------
    /**
     *Funcion para dar el precio tras aplicarle el 21% de iva
     * @param precio
     * @return el precio con el iva ya aplicado
     */

    public static double precioConIVA(double precio){
        double precioConIVA= ((precio*21)/100)+precio;
        return precioConIVA;
    }

    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada = new Scanner(System.in);

        //pedir 5 precios
        for (int i = 1; i<=5; i++){
            System.out.println("Dime un precio para el producto "+i);
            double precio = entrada.nextDouble();

            //mostrar
            System.out.println("El precio con el IVA es " + precioConIVA(precio));
        }

    }
}

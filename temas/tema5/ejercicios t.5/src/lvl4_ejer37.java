import java.util.Scanner;

public class lvl4_ejer37 {
    /*
    37. Hacer un programa para llevar el control de venta de entradas. Lo primero que ha de
hacer es pedir la cantidad de entradas que se pondrán a la venta, después irá
solicitando la cantidad de entradas que quiere comprar, estando limitado a un
máximo de 10 por cliente. El programa finalizará cuando se agoten las entradas
mostrando la cantidad de entradas que se ha llevado el que más ha comprado. Si un
cliente introduce un número negativo o mayor que 10 le informe de su error y le
obligue a meter correctamente las entradas que desea, las veces que sea necesario
hasta que lo haga bien.
     */
    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);

        int compra;

        System.out.println("¿Cuantas entradas se pondran a la venta?");
        int venta= entrada.nextInt();


        do {
            System.out.println("¿Cuantas entradas quieres comprar?(maximo 10)");
            compra= entrada.nextInt();
            if (compra > 10) {
            System.out.println("Error. Solo puedes comprar 10 o has introducido un numero negativo. Intentelo de nuevo");
            }

        }
        while (compra > 10);



    }
}

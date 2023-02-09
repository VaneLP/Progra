import java.util.Scanner;

public class lvl2_ejer6 {
    /*
    6. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si
ha leído algún número negativo o no.
     */

    public static void main(String[] args) {

        int cont=1, num;

        String respuesta = "No hay numero negativos";

        Scanner entrada = new Scanner(System.in);

        while (cont<10){
            cont++;

            num = entrada.nextInt();

            if (num<0){
                respuesta = "si hay numeros negativos";
            }
        }

        System.out.println(respuesta);
    }
}

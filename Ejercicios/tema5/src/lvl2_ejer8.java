import java.util.Scanner;

public class lvl2_ejer8 {
    /*
    8. Realiza un programa que lea una secuencia de números no nulos hasta que se
introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos positivos
y cuantos negativos.
     */

    public static void main(String[] args) {

        System.out.println("Dime un numero");
        int num, contPosi=0, contNeg=0;

        Scanner entrada= new Scanner(System.in);
        num = entrada.nextInt();

        String respuesta="No";

        while (num != 0){
            if (num > 0) {
                contPosi++;
            }
            else{
                contNeg++;
                respuesta = "Si";
            }
            num = entrada.nextInt();
        }

        System.out.println(respuesta+" hay numeros negativos. "+ contNeg+" son numeros negativos y "+contPosi+" son numero positivos");

    }
}

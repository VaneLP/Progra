import java.util.Scanner;

public class ejer2 {
    /*
    2.Diseña un algoritmo capaz de obtener la letra del nif a partir del número de dni.Consiste   en   dividir   dicho   número   entre   23   y   tomar   el   resto
    de   la   división asignándole la letra correspondiente según la siguiente tabla. Almacena las letras del NIF en una cadena.

    CÓDIGO PARA LA LETRA DEL D.N.I. O DEL N.I.F.
    RESTO 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
    LETRA T R W A G M Y F P D  X  B  N  J  Z  S  Q  V  H  L  C  K  E
     */

    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);

        //pedimos dni
        System.out.println("Dime tu numero del DNI");
        int num= entrada.nextInt();

        //hacemos la division para asignar la letra
        int div = num%23;

        //asignamos las letras a una string
        String  letra="TRWAGMYFPDXBNJZSQVHLCKE";

        //mostramos el dni y el caracter asignado de la posicion al dividirlo
        System.out.println("La letra para el "+ num+ " es: " + letra.charAt(div));

    }
}

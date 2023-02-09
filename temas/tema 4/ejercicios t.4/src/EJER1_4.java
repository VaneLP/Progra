import java.util.Scanner;

public class EJER1_4 {
    /*
    4. Escribe un programa que pregunte al usuario el precio de
        la cuenta de la cena,pregunte cuantos habeis cenado, y nos muestre cuanto tiene que pagar cada uno.
     */

    public static void main(String[] args) {

        System.out.println("Dime el precio de la cuenta de la cena");
            int precio;

        Scanner entrada = new Scanner(System.in);
              precio= entrada.nextInt();

        System.out.println("¿Cuantos habeis cenado?");
            int personas;

        Scanner entrada2 = new Scanner(System.in);
            personas = entrada2.nextInt();

        int pxp;
            pxp= precio / personas;

        System.out.println("Cada uno teneis que pagar " + pxp + " cada uno");
    }
}

import java.util.Scanner;

public class lvl1_ejer4 {
    /*
    4. Realiza un programa que muestre los números desde el 1 hasta un número N que se
        introducirá por teclado.
     */

    public static void main(String[] args) {

        int num, numFin;

        System.out.println("Introduce un numero");

        Scanner entrada = new Scanner(System.in);
        numFin = entrada.nextInt();

        for (num = 1; num <= numFin; num++) {
            System.out.println(num);
        }
    }
}

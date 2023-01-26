import java.util.Scanner;

public class EJER2_4 {
    /*
    2.4. Escribe un programa de un programa que lee dos números y los visualiza en
        orden ascendente.
     */

    public static void main(String[] args) {
        System.out.println("Introduce dos numeros");
        int n1;
        int n2;

        Scanner entrada = new Scanner(System.in);
        n1 = entrada.nextInt();
        n2= entrada.nextInt();

        if (n1 < n2) {
            System.out.println(n1 + "," + n2);
        }
        else {
            System.out.println( n2 + "," + n1);
        }
    }
}

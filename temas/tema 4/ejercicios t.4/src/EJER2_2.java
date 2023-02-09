import java.sql.SQLOutput;
import java.util.Scanner;

public class EJER2_2 {

    /*
    2.2. Escribe un programa de un programa que lee 2 números y muestra el mayor
     */

    public static void main(String[] args) {
        System.out.println("Dime dos numeros");
            int n1;
            int n2;

        Scanner entrada = new Scanner(System.in);
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        if (n1>n2) {
            System.out.println(n1 + " es mayor");

        }
        else {
            System.out.println(n2 + " es mayor");
        }
    }
}

import java.util.Scanner;

public class EJER2_5 {

    /*
    2.5. Escribe un programa que lee dos números y nos dice cuál es el mayor o si son
        iguales.
     */

    public static void main(String[] args) {
        System.out.println("Dime dos numeros");
        int n1;
        int n2;

        Scanner entrada = new Scanner(System.in);
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        if (n1 >= n2) {
            System.out.println( n1 + " Es mayor o igual a " + n2);
        }
        else {
            System.out.println(n2 + " Es mayor o igual a " + n1);
        }
    }
}

import java.util.Scanner;

public class EJER2_6 {
    /*
    2.6. Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.
     */

    public static void main(String[] args) {
        System.out.println("Escribe tres numeros");
        int n1;
        int n2;
        int n3;

        Scanner entrada = new Scanner(System.in);
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();

        if (n1 > n2) {
            System.out.println(n1);
        }
        else if (n2 > n3) {
            System.out.println(n2);
        }
        else if (n1 > n3) {
            System.out.println(n1);
        }
        else {
            System.out.println(n3);
        }
    }
}

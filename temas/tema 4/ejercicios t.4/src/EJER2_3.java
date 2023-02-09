import java.util.Scanner;

public class EJER2_3 {

    /*
    2.3. Escribe un programa de un programa que lee un número y me dice si es positivo
        o negativo, consideraremos el cero como positivo.
     */

    public static void main(String[] args) {
        System.out.println("Dime un numero");
        int n1;

        Scanner entrada = new Scanner(System.in);
        n1 = entrada.nextInt();

        if (n1>=0) {
            System.out.println("Es positivo");
        }
        else {
            System.out.println("Es negativo");
        }
    }
}

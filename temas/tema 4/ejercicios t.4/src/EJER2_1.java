import java.util.Scanner;

public class EJER2_1 {

    /*
    2.1. Escribe un programa que lee dos números, calcula y muestra el valor de su suma,
        resta, producto y división. (Ten en cuenta que no se puede divir entre 0 ).
     */
    public static void main(String[] args) {

        System.out.println("Introduce dos numeros");
        int n1;
        int n2;

        Scanner entrada = new Scanner(System.in);
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        int suma, resta, multi, divi;
            suma = n1 + n2;
            resta = n1 - n2;
            multi = n1 * n2;

        if (n1 == 0) {
            System.out.println("No se puede hacer una division entre 0");
        }
        else {
            divi = n1 / n2;

            System.out.println("La division es: " + divi);
        }

        System.out.println("La suma es: " + suma + ". La resta es: " + resta + ". La multiplicacion es: " + multi);
    }
}

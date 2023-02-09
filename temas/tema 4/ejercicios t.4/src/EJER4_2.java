import java.sql.SQLOutput;
import java.util.Scanner;

public class EJER4_2 {
    /*
   4.2. Escribe un programa que lea por teclado un número y muestre el último dígito
        del número.
    */
    public static void main(String[] args) {

        System.out.println("Introduce un numero");
        int n;

        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();

        int nUltimoDig = n % 10;

        System.out.println("EL ultimo digito de "+n+ " es "+nUltimoDig);
    }
}

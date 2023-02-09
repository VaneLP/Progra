import java.util.Scanner;

public class lvl4_ejer29 {
    /*
    29. Realiza un programa que pida dos número enteros A y B, siendo B mayor que A.
Luego visualiza los números desde A hasta B e indicar cuantos hay que sean pares.
Ejemplo:
run:
dime un numero: 5
dime otro numero mayor que el anterior: 11
5 6 7 8 9 10 11
La cantidad de pares son: 3
     */

    public static void main(String[] args) {

        System.out.println("Dime un numero");
        Scanner entrada= new Scanner(System.in);
        int a = entrada.nextInt();

        System.out.println("Dime otro numro mayor que el anterior");
        int b = entrada.nextInt();

        for (int i= a; i<=b; i++){
            System.out.print(i+ " ");
        }



    }
}

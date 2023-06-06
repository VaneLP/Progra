package bucles;

import java.util.Scanner;

//Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá por teclado.
public class Ejer4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("pon un numero");
        int num= entrada.nextInt();

        for (int i=1; i<=num;i++){
            System.out.println(i);
        }

    }
}

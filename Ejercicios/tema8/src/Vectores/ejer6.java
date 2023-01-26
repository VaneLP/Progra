package Vectores;

import java.util.Scanner;

public class ejer6 {
    /* Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
    N, escriba M en todas sus posiciones y lo muestre por pantalla.*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Que valor quieres para n: ");
        int n = entrada.nextInt();
        int[] longArray= new int[n];

        System.out.print("Que valor quieres para m: ");
        int m= entrada.nextInt();

        System.out.println("-------");

        for (int i=0; i<longArray.length;i++){
            longArray[i]=m;
        }

        for (int mostrar:longArray) {
            System.out.println(mostrar);
        }

    }
}

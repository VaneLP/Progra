package Vectores;

import java.util.Scanner;

public class ejer15 {
    /*Crea un programa que pida la usuario dos valores N y M y luego cree un array de
tamaño N que contenga M en todas sus posiciones. Luego muestra el array por
pantalla.

REPE == EJER 6 */
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

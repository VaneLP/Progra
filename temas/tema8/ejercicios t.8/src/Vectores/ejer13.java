package Vectores;

import java.util.Scanner;

public class ejer13 {
    /*Crea un programa que permita al usuario almacenar una secuencia aritmética en un
    array y luego mostrarla. Una secuencia aritmética es una serie de números que
    comienza por un valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1
    e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37…
    El programa solicitará al usuario V, I además de N (nº de valores a crear).*/
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("Dame un valor inicial");
        int v = entrada.nextInt();
        System.out.println("Dime el incremento que deseas");
        int i= entrada.nextInt();
        System.out.println("Dime el numero de valores a crear");
        int n= entrada.nextInt();

        int[] secuencia = new int[n];

        for (int j=0;j<secuencia.length;j++){
            secuencia[j]= v+(i*j);
        }

        for (int mostrar:secuencia) {
            System.out.print(mostrar+", ");
        }
    }
}

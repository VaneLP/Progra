package Vectores;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ejer20 {
    /*Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
aleatorios entre 0 y 99. Luego pedirá por teclado un valor N y se mostrará por pantalla
si N existe en el array, además de cuantas veces*/
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        int[] array = new int[1000];

        for (int i=0; i < array.length; i++){
            int ale = ThreadLocalRandom.current().nextInt(0,99+1);
            array[i]=ale;
        }

        System.out.println("Introduce un numero para ver si esta en el array");
        int n= entrada.nextInt();

        int cont=0;
        for (int mostrar:array) {
            if (mostrar==n){
                cont++;
            }
        }

        System.out.println("Tu numero '"+n+"' se a repetido: "+cont);

    }
}

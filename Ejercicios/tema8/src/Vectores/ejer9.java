package Vectores;

import java.util.Scanner;

public class ejer9 {
    /* Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
    enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N
    y mostrará en qué posiciones del array aparece N. */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aleatorio;

        int[] array= new int[100];

        System.out.print("Introduce un valor real: ");
        int n= entrada.nextInt();

        System.out.println("La posicion en la que aparece el valor introducido es: ");

        for (int i=0;i<array.length; i++){
            aleatorio =(int) (1 + Math.random()*10);

            array[i]= aleatorio;

            if(aleatorio==n)
                System.out.println(i);
        }

    }
}

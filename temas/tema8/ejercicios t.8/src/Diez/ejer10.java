package Diez;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*Implementa un programa que cree una matriz de tamaño F x C (estos valores se
introducirán como parámetros en la línea de comandos) y la rellene con números
enteros aleatorios entre 1 y 20. Luego pedirá por teclado un número V y mostrará por
pantalla cuántos valores de cada fila son múltiplos de V. Supondremos que el usuario
introducirá valores válidos por lo que no será necesario comprobarlos.

Por ejemplo, dada esta matriz de 3x3 y V=5
5 10 9
1 6 19
20 15 10

El programa mostrará por pantalla:
Fila 1: 2
Fila 2: 0
Fila 3: 3*/
public class ejer10 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("Introduce un valor para F");
        int f = Integer.parseInt(args[0]);//primer valor para la linea de comandos
        System.out.println("Introduce un valor para C");
        int c = Integer.parseInt(args[1]);//segundo valor para la linea de comandos

        int[][] matriz = new int [f][c];

        //añadir a la matriz los numeros aleatorios
        for (int i=0;i< matriz.length; i++){
            for (int j=0;j<matriz[i].length;j++){
                matriz[i][j]= ThreadLocalRandom.current().nextInt(1,20+1);
            }
        }

        //mostramos la matriz
        for (int[] mostrar1 : matriz) {

            for (int mostrar2 : mostrar1) {
                System.out.print( mostrar2 + " ");
            }
            System.out.println();
        }

        //pedimos el numero para ver si es multiplo
        System.out.println();
        System.out.println("Dime un numero para ver si es multiplo en alguna fila:");
        int n = entrada.nextInt();

        int cont, cont2=1;

        //mostramos las coincidencias
        for (int[] mostrar1 : matriz) {
            cont=0;

            for (int mostrar2 : mostrar1) {
                if(mostrar2%n==0){
                    cont++;
                }
            }

            System.out.println("Fila "+(cont2++)+": "+cont);

        }

    }
}

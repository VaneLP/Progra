package Vectores;

import java.util.Scanner;

public class ejer8 {
    /*Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
    utilizando Math.random(), y luego le pida al usuario un valor real R. Por último,
    mostrará cuántos valores del array son igual o superiores a R*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] array= new double[100];

        System.out.print("Introduce un valor real: ");
        double r= entrada.nextDouble();

        for (int i=0;i<array.length; i++){
            array[i]= Math.random();

        }

        for (double mostrar:array) {
            if(mostrar>=r)
                System.out.println(mostrar);
        }

    }
}

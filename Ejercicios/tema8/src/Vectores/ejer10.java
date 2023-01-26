package Vectores;

import java.util.Scanner;

public class ejer10 {
    /*Crea un programa para realizar cálculos relacionados con la altura (en metros) de
    personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por
    teclado. Luego mostrará la altura media, máxima y mínima así como cuántas personas
    miden por encima y por debajo de la media.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sumatorio=0;

        System.out.print("Introduce el tamaño del array:");
        int longArray = input.nextInt();

        double[] alturas = new double[longArray];

        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Altura "+(i+1)+": ");
            alturas[i] = input.nextDouble();
        }

        double maxima = alturas[0];
        double minima = alturas[0];

        for (double mostrar:alturas) {
            maxima = Math.max(maxima,mostrar);
            minima = Math.max(minima,mostrar);
            sumatorio+=mostrar;
        }

        double media = sumatorio/ alturas.length;

        int encimaMedia = 0;
        int debajoMedia = 0;

        for (double alt:alturas) {
            if(alt>media)
                encimaMedia++;
            else
                debajoMedia++;
        }

        System.out.printf("Altura media: "+media+
                "%nAltura maxima: "+maxima+
                "%nAltura minima: "+minima+
                "%nPersonas por encima de la media: "+encimaMedia+
                "%nPersonas por debajo de la media: "+debajoMedia);


    }
}

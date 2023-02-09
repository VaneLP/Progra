package Vectores;

import java.util.Scanner;

public class ejer5 {
    /*Crea un programa que pida veinte números reales por teclado, los almacene en un
    array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de
    valores. */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int suma=0, media;
        //creamos el array
        int[] n= new int[20];

        //creamos un bucle for para poder pedir los 10 numeros
        for (int i=0; i<20; i++){
            System.out.println("Introduce un numero");
            n[i]= entrada.nextInt();
            suma += n[i];
        }

        media=suma/n.length;
        System.out.println("La media de todos los numero que has introducido es: "+media);
    }
}

package Vectores;

import java.util.Scanner;

public class ejer4 {
    /*Crea un programa que pida veinte números enteros por teclado, los almacene en un
    array y luego muestre por separado la suma de todos los valores positivos y negativos.*/
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int posi=0, nega=0;
        //creamos el array
        int[] n= new int[20];

        //creamos un bucle for para poder pedir los 10 numeros
        for (int i=0; i<20; i++){
            System.out.println("Introduce un numero");
            n[i]= entrada.nextInt();
        }


        for (int j=0;j<20;j++){
            if (n[j]>0) {
                posi += n[j];
            }
            if (n[j]<0) {
                nega += n[j];
            }

        }

        System.out.println("La suma de todos los numeros positivos es: "+posi);
        System.out.println("La suma de todos los numeros negativos es: "+nega);


    }
}

package Vectores;

import java.util.Scanner;

public class ejer2 {
    /*Crea un programa que pida diez números reales por teclado, los almacene en un
    array, y luego muestre la suma de todos los valores.*/
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int suma=0;

        //creamos el array
        int[] n= new int[10];

        //creamos un bucle for para poder pedir los 10 numeros
        for (int i=0; i<10; i++){
            System.out.println("Introduce un numero");
            n[i]= entrada.nextInt();
            suma += n[i];
        }

        System.out.println("La suma de los numeros introducidos es: "+suma);

    }
}

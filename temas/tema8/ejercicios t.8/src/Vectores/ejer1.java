package Vectores;

import java.util.Scanner;

public class ejer1 {
    /* Crea un programa que pida diez números reales por teclado, los almacene en un
    array, y luego muestre todos sus valores.*/
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        //creamos el array
        int[] n= new int[10];

        //creamos un bucle for para poder pedir los 10 numeros
        for (int i=0; i<10; i++){
            System.out.println("Introduce un numero");
            n[i]= entrada.nextInt();
        }

        System.out.println("Los numeros introducidos son:");

//        for (int j=0; j<=10; j++){
//            System.out.println(n[j]);
//        }

        //Mostramos por pantalla con un foreach
        //foreach = for (int nuevaVariable:variableAnterior)
        for (int mostrar:n) {
            System.out.println(mostrar);
        }


    }
}

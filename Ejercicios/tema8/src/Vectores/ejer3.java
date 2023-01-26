package Vectores;

import java.util.Scanner;

public class ejer3 {
    /* Crea un programa que pida diez números reales por teclado, los almacene en un
    array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.*/
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        //creamos el array
        double[] n= new double[10];

        //creamos un bucle for para poder pedir los 10 numeros
        for (int i=0; i<10; i++){
            System.out.println("Introduce un numero");
            n[i]= entrada.nextDouble();
        }

        double mayor=-999999999,menor=999999999;

        for (int j=0;j<10;j++){
            if (n[j]>mayor) {
                mayor = n[j];
            }
            if (n[j]<menor) {
                menor = n[j];
            }

        }

        System.out.printf("El numero mayor de los que has introducido es: "+mayor+
                        "%nEl numero menor de los que has introducido es: "+menor);


    }
}

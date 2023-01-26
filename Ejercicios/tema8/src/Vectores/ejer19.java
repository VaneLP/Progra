package Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class ejer19 {
    /*Necesitamos crear un programa para mostrar el ranking de puntuaciones de un
torneo de ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las
puntuaciones de todos los jugadores (habitualmente valores entre 1000 y 2800, de
tipo entero) y luego muestre las puntuaciones en orden descendente (de la más alta a
la más baja).*/
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        int[] jugadores= new int[8];

        System.out.println("Introduce las puntuaciones de los jugadores");

        for (int i=0;i<jugadores.length;i++){

            System.out.println("Puntuacion del jugador "+ (i+1) +": ");
            int puntuaciones = entrada.nextInt();

            if(puntuaciones>=1000 && puntuaciones<=2800) {
                jugadores[i] = puntuaciones;
            }else {
                System.out.println("puntuacion no valida");
                i--;
            }

        }

        Arrays.sort(jugadores);

        for(int i= jugadores.length;i>0;i--){
            System.out.print(jugadores[i-1]);
        }


    }
}

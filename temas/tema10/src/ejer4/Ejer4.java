package ejer4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejer4 {
    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);

        //creamos un numero aleatorio entre el 1 y el 100
        int nAle= ThreadLocalRandom.current().nextInt(1,100+1);
        //al que luego se lo asignamos a un vector
        int[] vector= new int[nAle];

        int numero=0;

        //rellenamos el vector con numero aleatorios del 1 al 10
        for(int i=0;i<vector.length;i++) {
           int nAle2=ThreadLocalRandom.current().nextInt(1,10+1);
           vector[i]=nAle2;
        }


        System.out.println("Elige la posicion que deseas ver, hay: " + vector.length + " posiciones");
         do {

             try {
                     numero = entrada.nextInt();
                     System.out.println("en la posicion " + numero + " se encuentra el numero: " + vector[numero]);

             } catch (InputMismatchException e1) {
                 System.out.println("valor no valido");
                 e1.printStackTrace();
                 entrada.next();
             }
             catch (ArrayIndexOutOfBoundsException e2){
                 if(numero<0) {
                     break;
                 }
                 System.out.println("valor del array no valido");
                 e2.printStackTrace();
             }

             System.out.println("elige otra posicion que deseas ver: ");
         }while (numero>=0);







    }
}

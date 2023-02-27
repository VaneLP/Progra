package ejer3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {

        double[] vector= new double[5];
        Scanner entrada= new Scanner(System.in);
        double numero;

        for(int i=0;i<vector.length;i++) {
            System.out.println("Dime un numero");


            try {
                numero = entrada.nextDouble();
                vector[i] = numero;

            } catch (InputMismatchException e2) {
                System.out.println("valor no valido");
                e2.printStackTrace();
                entrada.next();
                i--;
            }

        }

        for (int j = 0; j < vector.length; j++) {
            System.out.println("Posicion " + j + ": " + vector[j]);
        }

    }
}

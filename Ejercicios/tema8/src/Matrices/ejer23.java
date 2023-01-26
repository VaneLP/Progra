package Matrices;

import java.util.Scanner;

public class ejer23 {
    /* Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por
teclado) e introduzca en ella NxM valores (también introducidos por teclado). Luego
deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores
que cero, cuántos son menores que cero y cuántos son igual a cero.*/
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.print("introduce el tamaño de n: ");
        int n = entrada.nextInt();
        System.out.print("Introduce el tamaño de m: ");
        int m = entrada.nextInt();

        int[][] matriz=new int[n][m];

        for(int i=0;i< matriz.length;i++){

            for (int j=0;j<matriz[i].length;j++){
                System.out.print("introduce el valor que deseas: ");
                int leer= entrada.nextInt();
                matriz[i][j]=leer;
            }
        }

        int mayor=0, menor=0, igual=0;

        for (int[] mostrar1 : matriz) {

            for (int mostrar2 : mostrar1) {
                if (mostrar2>0)
                    mayor++;
                else if (mostrar2<0)
                    menor++;
                else if (mostrar2==0)
                    igual++;
            }
        }

        System.out.printf("-------------------------"+
                        "%nNumeros mayores a cero: "+mayor+
                        "%nNumeros menores a cero: "+menor+
                        "%nNumeros iguales a cero: "+igual);

    }
}

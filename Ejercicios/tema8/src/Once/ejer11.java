package Once;

import java.util.concurrent.ThreadLocalRandom;

/*Realiza un programa que construya una matriz de 3x3 y la rellene aleatoriamente de
números 0 o 1. El programa mostrará el tablero que se ha generado y cuantas ‘3 en raya’
tienen los 0’s y cuantas tienen los 1’s, indicando quien en el ganador y si han empatado.
Hay que tener en cuenta las filas, las columnas y las diagonales principal y secundaria.

Por ejemplo, dada esta matriz, mostrará Lineas 0: 2 Lineas 1: 0 Gana 0
0 1 1
0 1 0
0 0 0*/
public class ejer11 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int nAle;

        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                nAle= ThreadLocalRandom.current().nextInt(0,1+1);

                matriz[i][j]=nAle;
            }
        }

        for (int[] mostrar1: matriz) {
            System.out.println();
            for (int mostrar2 : mostrar1) {
                System.out.print(mostrar2 + " ");
            }
        }
    }
}

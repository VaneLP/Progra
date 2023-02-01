package JuandoAl;

import java.util.ArrayList;
import java.util.Arrays;

public class ejer9 {
    public static void main(String[] args) {
        int[][] tablero= {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,3},{0,2,2,0,3},{2,2,1,1,3},{0,3,2,2,1},{1,3,2,2,1}, {3,3,1,2,1}};

        ArrayList <int[]> lineas = lineas(tablero);

        for (int[] mostrar1 : lineas) {
            System.out.println(Arrays.toString(mostrar1));
        }
    }


    public static ArrayList lineas (int[][] matriz){
        ArrayList<int[]> lista= new ArrayList<>();

        for (int[] mostrar1 : matriz) {
            System.out.println();

            for (Integer mostrar2 : mostrar1) {
                System.out.print(mostrar2 + " ");
            }

        }
        return lista;
    }


}
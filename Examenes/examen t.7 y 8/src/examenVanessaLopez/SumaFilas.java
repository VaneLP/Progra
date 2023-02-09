package examenVanessaLopez;

import java.util.concurrent.ThreadLocalRandom;

public class SumaFilas {
    public static void main(String[] args) {

        System.out.println("introduce un valor para n");
        int n = Integer.getInteger(args[0]);

        System.out.println("introduce un valor para m");
        int m = Integer.getInteger(args[1]);

        int[][] matriz = new int[n][m];

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]= ThreadLocalRandom.current().nextInt(0,100+1);
            }
        }

        int suma=0;

        for (int[] mostrar1 : matriz) {
            for (int mostrar2 : mostrar1) {
                System.out.println(mostrar2 + " ");
                suma=suma+mostrar2;

                System.out.println("["+suma+"]");
            }
            System.out.println();
        }

    }
}

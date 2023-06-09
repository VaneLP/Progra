package examen_2Oportunidad;


import java.util.concurrent.ThreadLocalRandom;

public class SumaFilas {
    public static void main(String[] args) {
        //pedimos los numeros por linea de comando
        int num1= Integer.parseInt(args[0]);
        int num2= Integer.parseInt(args[1]);

        //cremos la matriz
        int[][] matriz = new int[num1][num2];

        //recorremos la matriz y la llenamos con numnero aleatorios del 0-100
        for(int i =0;i<=num1;i++){
            for(int j=0;j<=num2;j++){
                int numAle= ThreadLocalRandom.current().nextInt(0,100+1);
                matriz[i][j]=numAle;
            }
        }

        //mostramos por pantalla
        for (int[] numero : matriz) {
            System.out.printf("%10d",numero);

        }

    }
}

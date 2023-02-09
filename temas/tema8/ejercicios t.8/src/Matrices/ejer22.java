package Matrices;

public class ejer22 {
    /* Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas
de multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por
pantalla.*/
    public static void main(String[] args) {
        int[][] matriz=new int[10][10];

        int cont=1;

        for(int i=0;i< matriz.length;i++){

            for (int j=0;j<matriz[i].length;j++){
                matriz[i][j]=(i+1)*(j+1);
            }
        }

        for (int[] mostrar1 : matriz) {
            System.out.println("-----------------");
            System.out.println("Tabla del "+cont++);

            for (int mostrar2 : mostrar1) {
                System.out.println(mostrar2);
            }
        }

    }
}

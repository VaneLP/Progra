package Vectores;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ejer18 {
    /*Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios
entre 0 y 9. Luego ordena los valores del array y los mostrará por pantalla.*/
    public static void main(String[] args) {
        int[] array= new int[30];

        for (int i=0; i < array.length; i++){
        int ale = ThreadLocalRandom.current().nextInt(0,9+1);
        array[i]=ale;
        }

        Arrays.sort(array);

        for (int mostrar:array) {
            System.out.print(mostrar+" ");
        }

    }
}

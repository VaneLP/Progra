package Vectores;

import java.lang.reflect.Array;

public class ejer11 {
    /*Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá
    en el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los
    valores del primer array al segundo array en orden inverso, y mostrar ambos por
    pantalla.*/
    public static void main(String[] args) {
        int[] array1= new int[100];
        int[] array2= new int[100];

        for(int i=0;i<array1.length;i++){
            array1[i]=i+1;
        }

        for (int mostrar1:array1) {
            System.out.print(mostrar1+ " ");
        }

//        System.arraycopy(array1, 0, array2, 0, array1.length);
//        for(int i=array2.length; i>0; i--){
//            array2[i-1]=i;
//        }

        for (int i=0;i<array1.length;i++){
            array2[i]= array1[(array1.length-1)-i];
        }

        System.out.println(" ");


        for (int mostrar2:array2) {
            System.out.print(mostrar2+ " ");
        }

    }
}

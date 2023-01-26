package Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class ejer17 {
    /*Crea un programa que pida al usuario 20 valores enteros e introduzca los 10
primeros en un array y los 10 últimos en otro array. Por último, comparará ambos
arrays y le dirá al usuario si son iguales o no*/
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        int[] array1= new int[10];
        int[] array2= new int[10];

        System.out.println("Introduce 20 numeros");

        for(int i=0;i < array1.length;i++){
            int n = entrada.nextInt();
            array1[i]=n;
        }

        for(int i=0;i < array2.length;i++){
            int n = entrada.nextInt();
            array2[i]=n;
        }

        if(Arrays.compare(array1,array2)==0)
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");

    }
}

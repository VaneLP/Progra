package Vectores;

import java.util.Scanner;

public class ejer7 {
    /*Crea un programa que pida dos valores enteros P y Q, luego cree un array que
    contenga todos los valores desde P hasta Q, y lo muestre por pantalla.*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mayor, menor;

        //pedimos datos por pantalla
        System.out.print("Que valor quieres para p: ");
        int p = entrada.nextInt();

        System.out.print("Que valor quieres para q: ");
        int q= entrada.nextInt();

        System.out.println("-------");
        //comprobamos si p es mayor q guardamos que p es el mayor
        if(p>q){
            mayor=p;
            menor=q;
        }else {
            mayor=q;
            menor=p;
        }

        //al mayor le quitamos uno para dar los valores intermedios menos el mayor
        int numero=mayor-1;

        //creamos la array que sea igual de grande que los valores intermedios
        int[] longArray= new int[mayor-menor];

        //recorremos la array restandole al numero uno para dar los valores intermedios
        for (int i=0; i<longArray.length;i++) {
                longArray[i] = numero;
                numero = numero - 1;
        }

        //mostramos
        for (int mostrar:longArray) {
            System.out.println(mostrar);
        }

    }
}

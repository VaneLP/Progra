package Vectores;

import java.util.Scanner;

public class ejer12 {
    /* Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones:
    a. Mostrar valores.
    b. Introducir valor.
    c. Salir.
    La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y
    una posición P, luego escribirá V en la posición P del array. El menú se repetirá
    indefinidamente hasta que el usuario elija la opción ‘c’ que terminará el programa.
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char caso;

        int[] num = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        do {
            System.out.printf("%n-------------------------"+
                    "%na. Mostrar valores" +
                    "%nb. Introducir valor" +
                    "%nc. Salir" +
                    "%n Opcion: ");
            String opcion = entrada.next();
            caso = opcion.charAt(0);

            System.out.println("-------------------------");

            switch (caso) {
                case 'a':
                    for (int i = 0; i < num.length; i++) {
                        System.out.println("En la posicion " + (i + 1) + " tenemos el valor: " + num[i]);
                    }
                    break;

                case 'b':
                    System.out.print("Introduce un valor: ");
                    int v = entrada.nextInt();
                    System.out.print("Introduce una posicion: ");
                    int p = entrada.nextInt();

                    while(p>10){
                        System.out.println("introduce");
                        p=entrada.nextInt();
                    }

                    num[p-1] = v;

                    System.out.println("El valor de la posicion " + p + " se a cambiado por el valor introducido " + v);
                    break;

                case 'c':
                    break;
            }
        } while (caso != 'c');

    }
}

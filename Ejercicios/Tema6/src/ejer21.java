import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ejer21 {
    /*
    21.Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el mínimo.
    Implementa y utiliza la función:

    int minimo(int a, int b) // Devuelve el menor entre a y b
     */

    //-----------FUNCIONES---------------
    /**
     * Funcion para decit el numero minimo
     * @param a
     * @param b
     * @return el numero menor entre a y b
     */

    public static int minimo (int a , int b){
        int minimo;
        if (a>b)
            minimo=b;
        else
            minimo=a;

        return minimo;
    }


    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);

        //pedir dos numero enteros
        System.out.println("Dime un numero");
        int n1 = entrada.nextInt();
        System.out.println("Dime otro numero");
        int n2 = entrada.nextInt();

        //mostrar minimo
        System.out.println("el minimo de los numeros " + n1 + " y "+ n2+" es "+minimo(n1,n2));
    }
}

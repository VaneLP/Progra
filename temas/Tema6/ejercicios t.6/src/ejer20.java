import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ejer20 {
    /*
    20.Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad o no.
    Implementa y utiliza la función:

    boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
     */

    //-----------FUNCIONES---------------
    /**
     * Funcion para decir si es mayor de edad o no
     * @param a
     * @return un verdadero o falso, dependiendo si es mayor de edad o no
     */
    public static boolean esMayorEdad(int a){
       boolean esMayorEdad= false;
        if (a>=18)
            esMayorEdad=true;

        return esMayorEdad;
    }


    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);

        //pedir edad
        System.out.println("Dime tu edad");
        int edad= entrada.nextInt();

        //muestre si es mayor de edad o no
        System.out.println(esMayorEdad(edad));
    }
}

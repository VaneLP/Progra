import java.util.Scanner;

public class EJER4_1 {
    /*
  4.1. Escribe un programa que lea un año como dato de entrada y diga si es año es
        bisiesto o no. Un año es bisiesto si es divisible entre 4, pero no es divisible por 100,
        excepto que también sea divisible por 400.
    */
    public static void main(String[] args) {

        /*
        Introducimos una cadena de texto en la que pedimos un año y asignamos una variable para
        poder pedir luego el año y que se guarde el numero
         */
        System.out.println("introduce un año");
        int ano;

        Scanner entrada= new Scanner(System.in);
        ano = entrada.nextInt();

        /*
        Hacemos un condicional en el que miramos si el año introducido por pantalla sea divisible entre 4 o 400
        y que no sea divisible entre 100 y segun el resultado diremos si es bisiesto o no
         */
        if (ano % 4 == 0 && 100 !=0 || (ano % 400==0)) {
            System.out.println("El año "+ano+" es bisiesto");
        }
        else {
            System.out.println("El año "+ano+" no es bisiesto");
        }
    }
}

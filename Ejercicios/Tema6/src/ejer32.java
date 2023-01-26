import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class ejer32 {
    /*
32.Programa que calcule el factorial de números menores de 20. El programa permite al   usuario   meter   los
números   que   desee   y   finalizará   cuando   meta   un   número menor   que   1   o   mayor   que   20.   Crea
las   funciones   que   consideres   útiles   y   que puedas reutilizar en otros programas
     */

    //-----------FUNCION 1---------------

    /**
     * FUncion para calcular el factorial de un numero introducido por el usuario
     * @param number
     * @return devuelve el factorial desde 1 hasta el numero
     */
    public static double factorial(double number){
        double producto=1;

        for (int i=1; i<=number;i++){
            producto= i * producto;
        }

        return producto;
    }

    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);
        double n;

        //pedir un numero
        System.out.print("Intruduce un numero para calcular el factorial. El programa finalizara cuando intruzcas un numero mayor que 20 o menor que 1. Dime el numero que deseas: ");
        n = entrada.nextDouble();

        while (n>=1 && n<=20){
            //mostrar
            System.out.println("El factorial del numero intruducido es "+n+"!= "+factorial(n));

            System.out.print("Intruduce un numero para calcular el factorial. El programa finalizara cuando intruzcas un numero mayor que 20 o menor que 1. Dime el numero que deseas: ");
            n = entrada.nextDouble();
        }

    }
}

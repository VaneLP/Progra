import java.util.Scanner;

public class ejer19 {
    /*
19.Escribe un programa que pida dos números reales por teclado y muestre por pantalla el resultado de multiplicarlos.
Implementa y utiliza la función:

double multiplica(double a, double b) // Devuelve la multiplicación de dos números
     */

    //-----------FUNCIONES---------------
    /**
     * funcion para hacer la multiplicacion de
     * @param a
     * @param b
     * @return devolver el resultado
     */
    public static double multiplica(double a, double b){

        return a*b;
    }


    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada = new Scanner(System.in);

        //pedir dos numero reales
        System.out.println("Dime un numero");
        double n1= entrada.nextDouble();
        System.out.println("Dime otro numero");
        double n2 = entrada.nextDouble();

        //mostrar por pantalla res multi
        System.out.println(multiplica(n1,n2));

    }
}

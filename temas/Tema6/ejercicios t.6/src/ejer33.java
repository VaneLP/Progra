import java.util.Scanner;

public class ejer33 {
    /*
33.Realiza una función llamada cantidadDivisores al que se le pase como parámetro un número entero y devuelva el
número de divisores o bien cero si el número es negativo
     */

    //-----------FUNCION 1---------------

    /**
     * Funcion que te devuelve la cantidad de divisores que tiene un numero introducido por el usuario
     * @param number
     * @return devuelve la cantidad de divisores
     */
    public static int cantidadDivisores(int number){
        int cont=0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0)
                    cont++;
            }

            return cont;
    }
    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);

        //pedir numero
        System.out.println("Introduce un numero");
        int n = entrada.nextInt();

        //mostrar
        System.out.println("El numero de divisores es "+cantidadDivisores(n));
    }
}

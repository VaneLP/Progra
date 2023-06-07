package bucles;

import java.util.Scanner;

//Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha leído algún número negativo o no.
public class Ejer6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        String contNeg="SI";

        System.out.println("dime 10 numero");

        for(int i = 1; i<=10;i++){
            numero = entrada.nextInt();

            if(numero<0) {
                contNeg = "NO";
                break;
            }
        }

        System.out.println("numeros neg= "+contNeg);

    }
}

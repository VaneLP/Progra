package ejer2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        int a,b;
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("dime un numero entero");
            a = entrada.nextInt();
            System.out.println("dime otro");
            b = entrada.nextInt();

            System.out.println("Division: " + a / b);
        }
        catch (InputMismatchException e1){
            System.out.println("Valor no valido");
            e1.printStackTrace();
        }
        catch (ArithmeticException e2){
            System.out.println("no se puede dividir entre 0");
            e2.printStackTrace();
        }

    }
}

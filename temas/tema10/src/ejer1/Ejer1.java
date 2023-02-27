package ejer1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer1{
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int a=0;

        try {
            System.out.println("dime un entero");
            a= entrada.nextInt();
            System.out.println("Valor introducido: "+a);
        }
        catch (InputMismatchException e1){
            System.out.println("Valor no valido");

            e1.printStackTrace();
        }

    }
}

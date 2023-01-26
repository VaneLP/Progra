import java.util.Scanner;

public class lvl4_ejer21 {
    /*
    21. Realiza un programa que lea un número por teclado y nos diga si es primo o no. Un
número es primo si sólo es divisible entre 1 y sí mismo
     */
    public static void main(String[] args) {

        System.out.println("Dime un numero");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        String r = "Si";

        for(int i = 2; i < num; i++){

            if (num % i == 0) {
                r= "no";
            }
        }

        System.out.println(r);

    }
}

import javax.swing.*;
import java.util.Scanner;

public class lvl3_ejer12 {
    /*
    12. Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del
operador de potencia (^), siendo A y B valores introducidos por teclado, y luego
muestre el resultado por pantalla
     */

    public static void main(String[] args) {

        System.out.println("Introduce dos numeros, el primero sera elevado al segundo");
        int datoA, datoB, calculo=1;

        Scanner entrada= new Scanner(System.in);
        datoA= entrada.nextInt();
        datoB= entrada.nextInt();

        while (datoB>0){
            datoB = datoB -1;
            calculo = calculo *datoA;
        }

        System.out.println(calculo);

    }
}

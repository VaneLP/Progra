package bucles;

import java.util.Scanner;
//Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del operador de potencia (^),
// siendo A y B valores introducidos por teclado, y luego muestre el resultado por pantalla
public class Ejer10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("dime un num");
        double a =entrada.nextInt();
        System.out.println("dime otro un num");
        int b =entrada.nextInt();

        double v=1;

        for (int i=1; i<=b;i++){
            v*=a;
        }
        System.out.println(v);
    }
}

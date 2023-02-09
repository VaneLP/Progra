import java.util.Scanner;

public class EJER1_6 {
    /*
    6. Una pinta son 0,473176. Realiza un programa que pregunte al usuario cuantas
        pintas se ha tomado, y le muestre el equivalente en litros.
    */

    public static void main(String[] args) {

        double pinta = 0.473176;

        System.out.println("¿Cuantas pintas te has tomado?");
        double consu;

        Scanner entrada = new Scanner(System.in);
            consu = entrada.nextDouble();

         double calculo;
             calculo= pinta * consu;

        System.out.println("Has consumido " + calculo + " litros");
    }
}

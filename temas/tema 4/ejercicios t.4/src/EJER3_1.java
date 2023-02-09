import java.util.Scanner;

public class EJER3_1 {
    /*
    3.1. Escribe un programa que lea una calificación numérica entre 0 y 10 y la
        transforma en calificación alfabética, escribiendo el resultado.
            • de 0 a <3 Muy Deficiente.
            • de 3 a <5 Insuficiente.
            • de 5 a <6 Bien.
            • de 6 a <9 Notable
            • de 9 a 10 Sobresaliente
     */
    public static void main(String[] args) {

        System.out.println("Dime una nota");
        int nota;

        Scanner entrada = new Scanner(System.in);
        nota = entrada.nextInt();

        if (nota<=0 && nota<=3) {
            System.out.println("Muy deficiente");
        }
        else if (nota<=3 && nota<=5) {
            System.out.println("Insuficiente");
        }
        else if (nota<=5 && nota<=6) {
            System.out.println("Bien");
        }
        else if (nota<=6 && nota<=9) {
            System.out.println("Notable");
        }
        else if (nota == 9|| nota == 10) {
            System.out.println("Sobresaliente");
        }
        else {
            System.out.println("Nota no valida");
        }
    }
}

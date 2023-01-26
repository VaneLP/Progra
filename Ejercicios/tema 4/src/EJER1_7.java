import java.util.Scanner;

public class EJER1_7 {
    /*
    7. Realiza un programa que resuelva el siguiente problema. En las aulas de un
        instituto sólo podemos poner 24 pupitres por aula, realiza un programa que nos
        pregunte cuantos pupitres tenemos, y nos mostrará cuantas aulas podemos rellenar
        por completo, y cuantoas pupitres nos sobran.
     */

    public static void main(String[] args) {

            System.out.println("¿Cuantos pupitres hay?");
            int pupitre;

            Scanner entrada = new Scanner(System.in);
            pupitre = entrada.nextInt();


            int aula;
            aula = pupitre / 24;
            int resto;
            resto= pupitre % 24;

            System.out.println("Tenemos " + pupitre + " pupitres y podemos rellenar por completo " + aula + " aulas y nos sobran " + resto);
    }
}
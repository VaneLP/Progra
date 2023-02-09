import java.util.Scanner;

public class ejer5 {
    /*
    5. Crea un programa que pida una cadena de texto por teclado y luego muestre cada
    palabra de la cadena en una línea distinta
     */
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);

        //pedir cadena texto
        System.out.println("Dime una cadana de texto");
        String cadena= entrada.nextLine();

        //mostrar cada palabra linea dis
        for(int i =0; i<cadena.length(); i++){

            System.out.print(cadena.charAt(i));

            if (cadena.charAt(i) == ' ')
                System.out.println();

        }
    }
}

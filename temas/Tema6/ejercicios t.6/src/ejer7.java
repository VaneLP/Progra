import java.util.Scanner;

public class ejer7 {
    /*
    7. Realiza un programa que lea una frase por teclado e indique si la frase es un
    palíndromo o no (ignorando espacios y sin diferenciar entre mayúsculas y
    minúsculas). Supondremos que el usuario solo introducirá letras y espacios (ni
    comas, ni puntos, ni acentos, etc.). Un palíndromo es un texto que se lee igual de
    izquierda a derecha que de derecha a izquierda. Por ejemplo:
Amigo no gima
Dabale arroz a la zorra el abad
Amo la pacífica paloma
A man a plan a canal Panama
     */
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);

        //pedir frase
        System.out.println("Dime una frase");
        String frase= entrada.nextLine();

        //pasar a minus
        frase = frase.toLowerCase();

        //ignorar espacios
        frase= frase.replace(" ","");

        //dar la vuelta a la palabra
        StringBuilder fraseRe = new StringBuilder(frase).reverse();

        //hacer que mire si es palindromo
            if(frase.equals(fraseRe.toString()))
                System.out.println("palindroma");
            else
                System.out.println("no palindroma");
    }
}

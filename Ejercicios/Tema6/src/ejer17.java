import java.util.Scanner;

public class ejer17 {
    /*
17.Realizar un programa al que se le introduzca una cadena por teclado, que la
convierta a StringBuilder, y aplicando métodos de esa clase, haga lo siguiente:
a. Borrar el carácter que haya en la posición 3.
b. Insertar una ‘x’ en la posición 5.
c. Sustituir el carácter de la posición 1 por una ‘z’.
d. Borrar los caracteres entre la posición 5 y 10.
e. Darles la vuelta a todos los caracteres del StringBuilder.
f. Convertir el StringBuilder en cadena.
Habrá que verificar en algunos casos que la cadena tiene una longitud mayor que
la dela posición indicada, sino producirá errores.
     */
    public static void main(String[] args) {
        //variable
        Scanner entrada = new Scanner(System.in);

        //pedir cadena de txt
        System.out.println("Dime una cadena");
        String cadena= entrada.nextLine();

        //cambiar a StringBuilder
        StringBuilder cadenaMod= new StringBuilder(cadena);

        //borrar carac posi 3
        if (cadenaMod.length()>=3)
            System.out.println(cadenaMod.deleteCharAt(3));
        else
            System.out.println("Muy corta");


        //insertar x posi 5
        if (cadenaMod.length()>=5)
            System.out.println(cadenaMod.insert(5,'x'));
        else
            System.out.println("Muy corta");

        //sustituir carac posi 1 una z
        System.out.println(cadenaMod.replace(1,2,"z"));

        //borrar los  carac posi 5 ENTRE 10
        if (cadenaMod.length()>=10)
            System.out.println(cadenaMod.delete(5,11));
        else
            System.out.println("Muy corta");


        //vuelta a todos los carac
        System.out.println(cadenaMod.reverse());

        //convertir en string
        System.out.println(cadenaMod.toString());

    }
}

import java.util.Scanner;

public class ejer3 {
    /*
    3. Crea un programa que pida dos cadenas de texto por teclado y luego indique si
    son iguales, además de si son iguales sin diferenciar entre mayúsculas y
    minúsculas.
     */
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);
        //pedimos las dos palabras
        System.out.println("Dime una palabra");
        String s1= entrada.next();

        System.out.println("Dime otra palabra");
        String s2= entrada.next();

        //pasamos a minus
        s1= s1.toLowerCase();
        s2= s2.toLowerCase();

        //indicar si son iguales
        if (s1.equals(s2))
            System.out.println("son iguales");
        else
            System.out.println("no son iguales");

    }
}

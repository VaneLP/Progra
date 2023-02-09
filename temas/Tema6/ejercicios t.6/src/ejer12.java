import java.util.Scanner;

public class ejer12 {
    /*
12. Realizar un programa que solicite una cadena, un número que indica una posición
de la cadena y una letra. El programa reemplazará sobre la misma cadena, el
carácter que hubiera en la posición indicada por la letra introducida. Hacer dos
versiones, la primera con String y otra con StringBuilder.
     */
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);

        //Solicitar cadena
        System.out.println("Dime una cadena");
        String cadena= entrada.nextLine();

        //solicitar num
        System.out.println("Dime un numero");
        int num = entrada.nextInt();

        //solicitar letra
        System.out.println("Dime un caracter");
        char carac = entrada.next().charAt(0);

        //version String
        System.out.println(cadena.substring(0,num) + carac + cadena.substring(num+1));

        //version StringBuilder
        StringBuilder nueva = new StringBuilder(cadena);
        nueva.setCharAt(num,carac);

        //mostramos
        System.out.println(nueva.toString());

    }
}

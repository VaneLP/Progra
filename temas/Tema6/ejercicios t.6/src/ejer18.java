import java.util.Scanner;

public class ejer18 {
    /*
18.Realizar un programa en el que el usuario introduzca un texto y sustituya sus
posiciones impares por asteriscos, por ejemplo: “abcdefg” cambie las posiciones
impares pasaría a: “a*c*e*g”
     */
    public static void main(String[] args) {
        //variable
        Scanner entrada = new Scanner(System.in);

        //pedir cadena de txt
        System.out.println("Dime una cadena");
        String cadena= entrada.nextLine();

        //cambiar a StringBuilder
        StringBuilder cadenaMod= new StringBuilder(cadena);

        for(int i = 1;i<cadenaMod.length();i=i+2){
            cadenaMod.setCharAt(i,'*');
        }

        System.out.println(cadenaMod.toString());

    }
}

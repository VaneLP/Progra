import java.util.Scanner;

public class ejer13 {
    /*
13. Realizar un programa que solicite la entrada de 10 cadenas de caracteres y
construya una cadena con el primer carácter de cada cadena. Finalmente mostrará
dicha cadena por pantalla.
     */
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);
        String conca="";

        //solicitar 10 cadenas
        for(int i=0;i<10;i++){
            System.out.println("Dime una cadena");
            String cadena= entrada.nextLine();
            //primer caracter de cada cadena
            char carac = cadena.charAt(0);
            conca= conca+carac;
        }
        //mostrar caracteres concatenados
        System.out.println(conca);
    }
}

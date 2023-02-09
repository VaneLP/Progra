import java.util.Scanner;

public class lvl4_ejer24 {
    /*
    24. Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que
introducimos por teclado.
Ejemplo:
run:
dime un numero:13
cantidad de multiplos de 3:4
     */
    public static void main(String[] args) {

        System.out.println("Dime un numero");
        Scanner entrada= new Scanner(System.in);
        int num = entrada.nextInt();

        for(int mul=3;mul<=num;mul+=3){
            System.out.println("Los multiplos de " + num + " son:" + mul);
        }
    }
}

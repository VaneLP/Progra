import java.util.Scanner;

public class EJER4_3 {
    /*
  4.3. Escribe un programa que lea un número entero y diga si es par y/o divisible entre 7.
    */
    public static void main(String[] args) {

        System.out.println("Introduce un numero");
        int n;

        Scanner entrada=new Scanner(System.in);
        n= entrada.nextInt();

        if (n %2==0) {
            System.out.println("Es par");
        }
        else{
            System.out.println("Es impar");
        }

        if (n%7 == 0) {
            System.out.println("Es divisible entre 7");
        }
        else {
            System.out.println("No es divisible entre 7");
        }
    }
}

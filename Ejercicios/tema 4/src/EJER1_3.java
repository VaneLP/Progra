import java.util.Scanner;

public class EJER1_3 {
    /*
    3. Escribe un programa que pregunte al usuario tres números, y muestre la suma
        del primero más el segundo, multiplicado por el tercero.
     */
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        int operacion;

        Scanner entrada = new Scanner(System.in);
          numero1 = entrada.nextInt();
          numero2 = entrada.nextInt();
          numero3 = entrada.nextInt();

          operacion= (numero1+numero2)*numero3;
    System.out.println("(" + numero1 + " + " + numero2 + ")" + "* " + numero3 + " = " + operacion);
    }
}

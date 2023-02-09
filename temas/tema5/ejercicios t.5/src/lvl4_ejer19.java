import java.util.Scanner;

public class lvl4_ejer19 {
    /*
    19. Realiza un programa que lea un número entero positivo y escriba los divisores de ese
número.
     */
    public static void main(String[] args) {

        System.out.println("Dime un numero");
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();

        for (int i = 1;i<=n;i++){
            if (n % i == 0){
                System.out.println(i);
            }

        }

    }
}

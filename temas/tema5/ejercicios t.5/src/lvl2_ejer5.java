import java.util.Scanner;

public class lvl2_ejer5 {
    /*
    5. Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
        Siendo el factorial:
0! = 1
1! = 1
2! = 2 * 1
3! = 3 * 2* 1
N! = N * (N-1) * (N-2) * … * 1
     */

    public static void main(String[] args) {

        System.out.println("Dime un numero");
        int num, factorial=1;

        Scanner entrada = new Scanner(System.in);
        num= entrada.nextInt();

        while (num > 1) {
            factorial = num * factorial;
            num = num - 1;
        }


        System.out.println(factorial);
    }
}

package bucles;

import java.util.Scanner;

/*Realiza un programa que lea un número positivo N y calcule y visualice su factorial N! Siendo el factorial:
0! = 1
1! = 1
2! = 2 * 1
3! = 3 * 2* 1
N! = N * (N-1) * (N-2) * … * 1
*/
public class Ejer5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int facto=1;


        System.out.println("dime un numero positivo");
        int n = entrada.nextInt();

        for(int i=n;i>=1;i--){
            facto*=i;
        }

        System.out.println(facto);
    }
}

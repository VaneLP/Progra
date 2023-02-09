import java.util.Scanner;

public class lvl2_ejer7 {
    /*
    7. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
indicando cuántos son positivos y cuantos negativos.
     */
    public static void main(String[] args) {

        int contar=0, num, neg=0, posi=0;

        System.out.println("Dime 10 numeros");

        while (contar<10){
           contar= contar+1;

            Scanner entrada= new Scanner(System.in);
            num = entrada.nextInt();

            if (num < 0) {
                neg++;
            }
            else {
                posi++;
            }
        }

        System.out.println("hay "+posi+" numero positivos y "+neg+" numero negativos");

    }
}

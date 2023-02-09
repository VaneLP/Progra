import java.util.Scanner;

public class lvl4_ejer20 {
    /*
    20. Realiza un programa que muestre la serie de Fibonacci. El primer término es 0, el
segundo término es 1, el resto se calcula a partir de la suma de los dos anteriores, así
la serie sería: 0, 1, 1, 2, 3, 5, 8, ….
 El número de números a mostrar se leerá por teclado al inicio del programa
     */
    public static void main(String[] args) {

       int pri = 0, seg =1;

        System.out.println("Dime un numero");

        Scanner entrada= new Scanner(System.in);
       int num= entrada.nextInt();


       for (int i = 0; i<=num; i++){

           System.out.println(pri);
         int resto=pri + seg;
         pri = seg;
         seg = resto;

       }
    }
}

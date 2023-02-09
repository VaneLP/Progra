import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class lvl4_ejer30 {
    /*
    30. Realiza un programa que pida un número y construya por pantalla su pirámide.
Ejemplo:
Dime un numero para realizar su piramide: 6

     *
    ***
   *****
  *******
 *********
***********

     */
    public static void main(String[] args) {

        System.out.println("Dime un numero");
        Scanner entrada = new Scanner(System.in);
        int altura = entrada.nextInt();

        for (int l= 1; l<=altura;l++){

            System.out.println();

            //hacemos los espacios
            for (int espa=1;espa<=altura-l;espa++) {
                System.out.println(" ");
            }

            //hacemos los asteriscos
            for (int e=1;e == l;e=e+2){
                System.out.println("*");
            }

        }

    }
}
/*
---------
  *
 ***
*****
3 alto, 5 base, 2 espacios

   *
  ***
 *****
*******
4 alto, 7 base, 3 espacios

    *
   ***
  *****
 *******
*********
5 alto, 9 base, 4 espacios
----------
 */
import java.util.Scanner;

public class lvl3_ejer15 {
    /*
    15. Realiza un programa que muestre la tabla de multiplicar de un número que se pide
por teclado entre el 1 y el 9. Se debe controlar que el número se encuentra entre el
rango permitido y volver a pedirlo mientras que no sea correcto. Realiza la solución de
mostrar la tabla utilizando un bucle do-while
     */

    public static void main(String[] args) {

        System.out.println("Intruce un numero del 1 al 9");

        Scanner entrada= new Scanner(System.in);
        int num;

        do {
            num= entrada.nextInt();

            if ( num<1 && num>9){
                System.out.println("El numero introducido no es correcto");
            }

        }
        while (num<=1 ||  num>=9);
        //--------------------
        int contador=0, multi;
        do {
            contador++;
            multi = num* contador;
            System.out.println(multi);
        }
        while (contador!=10);
    }
}

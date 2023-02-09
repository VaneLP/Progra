import java.util.Scanner;

public class lvl4_ejer35 {
    /*
    35. Realiza un programa que permita introducir números y nos muestre el resultado de
sumarlos, hasta que introduzca un número mayor que 1000. Si no se introduce un
número mayor que 1000 el programa finalizará después de introducidos 15 números.
     */
    public static void main(String[] args) {

        int cont = 1, suma = 0, num;


       do{
            System.out.println("Dime un numero");
            Scanner entrada = new Scanner(System.in);
            num = entrada.nextInt();

            cont= cont+1;

            suma= suma + num;


       }while (cont<=15 && num < 1000);

        System.out.println("La suma de los numeros introducidos es " + suma);

    }
}

import java.util.Scanner;

public class lvl4_ejer28 {
    /*
    28. Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por
pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada número
tantas veces como su valor. Ejemplo:
run:
Dime un numero: 5
1
22
333
4444
55555
     */
    public static void main(String[] args) {

        System.out.println("Introduce un numero entre 0 y 20");
        Scanner entrada = new Scanner(System.in);
        int num= entrada.nextInt();

        for (int i=1; i <= num; i++){

            for (int j=1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

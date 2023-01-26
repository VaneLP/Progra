import java.util.Scanner;

public class lvl3_ejer13 {
    /*
    13. Realiza un programa que mostrará un menú en pantalla:
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
0. Salir
Introduce la opción deseada:
Leerá la opción del menú, mostrará un mensaje con la opción que ha pulsado y volverá a
mostrar el menú hasta que se elija la opción de Salir.
     */

    public static void main(String[] args) {

        int num;

        do {
            System.out.println("------");
            System.out.println("Menu");
            System.out.println("------");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");

            Scanner entrada = new Scanner(System.in);
            num = entrada.nextInt();

            switch (num){
                case 1:
                    System.out.println("1. Sumar");
                break;

                case 2:
                    System.out.println("2. Restar");
                    break;

                case 3:
                    System.out.println("3. Multiplicar");
                    break;

                case 4:
                    System.out.println("4. Dividir");
                    break;

                case 0:
                    System.out.println("0. Salir");
                    break;
            }

            System.out.println("------");

        }
        while (num != 0);

        System.out.println("------");
        System.out.println("Has salido del programa");

    }

}

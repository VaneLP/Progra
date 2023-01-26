import java.util.Scanner;

public class lvl4_ejer25 {
    /*
    25. Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el
último dado. La introducción de números finaliza con la introducción de un 0. Al final
se mostrará:
El total de números introducidos, excluido el 0.
El total de números fallados.

Ejemplo:
Dime un numero inicial: 20
dime un numero: 21
Dime un numero: 8
Fallo es menor.
Dime un numero: 15
Dime un numero:10
Fallo es menor.
Dime un numero: 30
Dime un numero: 0
TOtal de numeros introducidos: 6
Numero de fallos: 2
     */
    public static void main(String[] args) {

        System.out.println("Introduce un numero inicial:");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int ulti=0,fallo=-1, cont=0;

        do{
            System.out.println("Dime un numero");
            num = entrada.nextInt();

            if (num<ulti){
                System.out.println("Fallo es menor");
                fallo++;
            }

            ulti=num;
            cont++;

        }
        while(num!=0);

        System.out.println("El total de numero introducidos, excluido el 0 es: "+ cont);
        System.out.println("EL total de numeros fallados "+ fallo);
    }
}

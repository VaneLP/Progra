import java.util.Scanner;

public class ejer22 {
    /*
    22.Escribe un programa que pida un número entero por teclado y muestre por pantalla si es positivo, negativo o cero.
    Implementa y utiliza la función:

    int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
     */

    //-----------FUNCIONES---------------
    /**
     * Funcion para decir si el numero introducido es positivo, negativo o 0
     * @param a
     * @return -1 si es neg, 0 si es igual, 1 si es posi
     */

    public static int dimeSigno(int a){
        int dimeSigno;

        if (a>0)
            dimeSigno=1;
        else if (a<0)
            dimeSigno=-1;
        else
            dimeSigno=0;

        return dimeSigno;
    }

    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);

        //pedir un numero por teclado
        System.out.println("dime un numero");
        int n1= entrada.nextInt();

        //mosrar por pantalla si es +,- o 0
        System.out.printf("Si numero es negativo mostrara un -1, si el numero es positivo mostrara 1 y si es un cero mostrara 0%n" + dimeSigno(n1));

    }
}

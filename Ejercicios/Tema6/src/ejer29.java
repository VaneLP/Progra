import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ejer29 {
    /*
29.Realiza   una   función   llamada   aleatorio()   que   se   le   pasan   dos   valores   enteros devuelve   un
entero   al   azar   comprendido   entre   esos   dos   valores   (el   primero   esmenor que el segundo, y ambos
mayores que cero, en caso contrario devuelve -1)
     */

    //-----------FUNCION---------------

    /**
     * Funcion para buscar un numero aleatorio entre dos numero establecidos
     * @param number1
     * @param number2
     * @return si las comprobaciones son verdaderas devuelve un numero random entre los intervalos y si no devuelve -1
     */
    public static int aleatorio(int number1, int number2){
        if(number1<number2 && number1>0 && number2>0)
            return ThreadLocalRandom.current().nextInt(number1,number2+1);
        else
            return -1;
    }
    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);

        //pedir dos numneros
        System.out.println("Dime un numero");
        int n1= entrada.nextInt();
        System.out.println("Dime otro numero");
        int n2= entrada.nextInt();

        //mostrar
        System.out.println(aleatorio(n1,n2));
    }
}

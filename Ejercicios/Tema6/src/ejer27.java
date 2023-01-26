import java.util.Scanner;

public class ejer27 {
    /*
    27.Realiza una función llamada sumaIntervalo() que le pasan dos long y devuelve otrolong  con  la   suma   de
    los   números   comprendidos  entre  los   números   pasados  (el primero es menor que el segundo, y ambos mayores
    que cero, en caso contrario devuelve -1)
     */

    //-----------FUNCION---------------
    /**
     * Funcion para hacer la suma de intervalos entre dos numeros, mientras que el numero 1 sea menor que el segundo y ambos
     * sean mayores a 0
     * @param number1
     * @param number2
     * @return si las comprobaciones son verdaderas devuelve la suma de los intervalos y si no devuelve -1
     */

    public static long sumaIntervalo(long number1, long number2){
        long suma= 0;

        if(number1<number2 && number1>0 && number2>0){

            for (long i = number1; i <= number2; i++) {
                suma = suma + i;
            }
            return suma;
        }
        else {
            return -1;
        }
    }

    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);

        //pedir dos numero
        System.out.println("Dime un numero");
        long num1= entrada.nextLong();
        System.out.println("Dime otro numero");
        long num2= entrada.nextLong();

        //mostrar suma
        System.out.println("La suma de los intervalos de "+num1+" y "+num2+" es de "+sumaIntervalo(num1,num2));
    }
}

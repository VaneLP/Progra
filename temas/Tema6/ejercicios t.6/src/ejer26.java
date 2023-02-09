import java.util.Scanner;

public class ejer26 {
    /*
    26.Escribe un programa que pida un valor N entero y luego muestre: el sumatorio desde 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N.
    Implementa y utiliza las funciones:

    int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
    int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
    double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
     */

    //-----------FUNCION 1---------------
    /**
     * Funcion para hacer el sumatorio desde 1 a N
     * @param n
     * @return Devuelve la suma de enteros de 1 a n
     */

    public static int suma1aN(int n){
        int suma=0;

        for (int i=1; i<=n;i++){
            suma= i + suma;
        }

        return suma;
    }

    //-----------FUNCION 2---------------
    /**
     * Funcion para hacer el producto de 1 a N
     * @param n
     * @return Devuelve el producto de enteros de 1 a n
     */

    public static int producto1aN(int n){
        int producto=1;

        for (int i=1; i<=n;i++){
            producto= i * producto;
        }

        return producto;
    }

    //-----------FUNCION 3---------------
    /**
     * Funcion para dar el valor intermedio entre 1 a N
     * @param n
     * @return Devuelve el valor intermedio entre 1 y n
     */

    public static double intermedio1aN(int n){
        double intermedio= n/2;

        return intermedio;
    }

    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada = new Scanner(System.in);

        //pedir un valor
        System.out.println("Dime un numero");
        int num = entrada.nextInt();

        //mostrar
        System.out.println(" El sumatorio de "+ num + " es "+suma1aN(num));
        System.out.println(" El productorio de "+ num + " es "+producto1aN(num));
        System.out.println(" El valor intermedio de "+ num + " es "+intermedio1aN(num));
    }
}

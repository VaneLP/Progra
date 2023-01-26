import java.util.Scanner;

public class ejer23 {
    /*
    23.Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros. Recuerda que una milla son 1,60934 kilómetros.
    Implementa y utiliza la función:

    double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
     */

    //-----------FUNCIONES---------------
    /**
     * Funcion para cambiar de millas a kilometros
     * @param millas
     * @return el cambio a kilometros
     */
    public static double millas_a_kilometros(int millas){
        double millas_a_kilometros = millas*(1.60934/1);
        return millas_a_kilometros;
    }

    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada = new Scanner(System.in);

        //pedir un valor entero en millas
        System.out.println("Dime un valor en millas");
        int vMillas = entrada.nextInt();

        //mostrar
        System.out.println(millas_a_kilometros(vMillas));
    }
}

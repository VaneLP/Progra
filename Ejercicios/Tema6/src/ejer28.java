import java.util.Scanner;

public class ejer28 {
    /*
28.Realiza una función llamada contarCeros() que se le pasa una cadena y devuelve la cantidad de ceros que tiene
     */

    //-----------FUNCION---------------

    /**
     * Funcion para buscar en una cadena de texto la cantidad de ceros que tiene
     * @param cadFun
     * @return devuelve un contador que nos dice los ceros que hay
     */
    public static int contarCeros(String cadFun){
        int cont=0;

        for (int i = 0;i<cadFun.length();i++){
            if(cadFun.charAt(i) == '0')
                cont++;
        }
        return cont;
    }

    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada = new Scanner(System.in);

        //pedir cadena
        System.out.println("Dime una cadena de texto");
        String cadena= entrada.nextLine();

        //mostrar
        System.out.println("La cadena de texto que has introducido "+"'"+cadena+"'"+" tiene una cantidad de ceros de "+contarCeros(cadena));
    }
}

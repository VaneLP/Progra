import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Valopa {

    /**
     * Funcion que realiza un pin de cifras
     * @return 4 cifras
     */
    public static int damePin4(){
        //variable
        int pin=0, ale;

        //for para que de 4 numeros
        for (int i=1 ; i<=4 ;i++){
            ale = ThreadLocalRandom.current().nextInt(0,9);
            pin=ale+pin;

                System.out.println(pin);
        }
        return pin;
    }

    /**
     * Funcion para sustituir un caracter en una poscion en concreto de una cadena de texto especifica
     * @param cad
     * @param n
     * @param carac
     * @return la cadena cambida
     */
    public static String sustituir (String cad, int n, char carac){
        //pasamos la cadena a stringbuiler
        StringBuilder cadSB= new StringBuilder(cad);
        //cambios en la posicion el caracter
        cadSB.setCharAt(n-1,carac);

        return cadSB.toString();

    }

    /**
     * Funcion que dobla el numero introducido
     * @param n
     * @return devuelve el numero introducido al cuadrado
     */
    public static int doblarNumeros (int n){

        return (int) Math.pow(n,2);
    }
    /**
     * Funcion que lea un numero que este entre el rango
     * @param n1
     * @param n2
     * @return el numero introducido
     */
    public static int leerNumero (int n1, int n2){
        //variable
        Scanner entrada= new Scanner(System.in);
        //introducimos el numero
        int n = entrada.nextInt();
        //hacemos que este dentro del rango
         while (n1>n || n>n2){
             n = entrada.nextInt();
         }

        return n;

    }

    public static void main(String[] args) {
//        System.out.println(damePin4());

//        System.out.println(sustituir("plaza", 4, 'y'));

//        System.out.println(doblarNumeros(9));

//        System.out.println(leerNumero(1,6));
    }
}

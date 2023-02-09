import java.util.Scanner;

public class ejer36 {
    /*
36.Crea una función letra NIF a la cual se le introduce un número de 8 cifras que Funciones representa un NDI y
nos devolverá la letra asociada a ese DNI. Si el número introducido no tiene la longitud adecuada
devolverá el carácter ‘-’.
     */

    //-----------FUNCION 1---------------

    /**
     * Funcion para determinar la letra correspondiente del DNI
     * @param number
     * @return la letra del DNI
     */

    public static char letra(int number) {
        if (number == 8) {
            int div = number % 23;

            String carac = "TRWAGMYFPDXBNJZSQVHLCKE";

            return carac.charAt(div);

        }else
            return '-';
    }

    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);

        //pedimos dni
        System.out.println("Dime tu numero del DNI");
        int num= entrada.nextInt();

        //mostramos el dni y el caracter asignado de la posicion al dividirlo
        System.out.println("La letra para el "+ num+ " es: " + letra(num));
    }
}

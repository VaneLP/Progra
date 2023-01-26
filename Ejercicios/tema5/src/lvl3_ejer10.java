import java.util.Scanner;

public class lvl3_ejer10 {
    /*
    10. Realiza un programa que lee una secuencia de notas (con valores que van de 0 a 10)
que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
     */

    public static void main(String[] args) {

        String respuesta = "No hay un 10";
        int notas=0;

        Scanner entrada= new Scanner(System.in);

        System.out.println("Dime las notas, cuando quieras finalizar introduce -1");

        while (notas !=-1) {
            notas= entrada.nextInt();

            if (notas == 10){
            respuesta = "Si hay un 10";
            }
        }

        System.out.println(respuesta);

    }
}

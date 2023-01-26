import java.util.Scanner;

public class EJER1_1 {
    //Ejercicios LVL 1
    /*
    1. Realiza un programa que pregunte al usuario
        por su nombre, y muestre por pantalla “Buenos dias [nombre]”
    */

    public static void main(String[] args) {
       // tengo que asignar una variable nombre como cadena de texto

        String nombre;
        Scanner entrada = new Scanner(System.in);

        //Para poder escribir por pantalla el nombre tengo que asignar el nombre a la entrada

        nombre=entrada.nextLine();
        System.out.println("Buenos dias " + nombre);
    }
}



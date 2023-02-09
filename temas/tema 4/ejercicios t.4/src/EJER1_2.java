import java.util.Scanner;

public class EJER1_2 {
    /*
    2. Realiza un programa que pregunte al usuario por su nombre y apellidos y
        muestre por pantalla “Buenos dias [nombre] [apellidos]”
     */
    public static void main(String[] args) {
        String nombre;
        String apellido;

        Scanner entrada= new Scanner(System.in);
            nombre = entrada.nextLine();
            apellido = entrada.nextLine();

        System.out.println("Buenos dias " + nombre + " " + apellido);
    }
}

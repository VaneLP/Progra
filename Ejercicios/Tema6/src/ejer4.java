import java.util.Scanner;

public class ejer4 {
    /*
    4. Crea un programa que pida por teclado tres cadenas de texto: nombre y dos
    apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por la
    concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo si se
    introduce “Lionel”, “Tarazón” y “Alcocer” mostrará “LIOTARALC”.
     */
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);

        //pedir 3 cadenas de texto
        System.out.println("Nombre: ");
        String nombre= entrada.next();

        System.out.println("1º apellido: ");
        String ape1= entrada.next();

        System.out.println("2º apellido: ");
        String ape2= entrada.next();

        //concatenar y seleccionar las 3 primeras
        String juntas= nombre.substring(0,3) + ape1.substring(0,3) + ape2.substring(0,3);

        //mostrar en mayus
        System.out.println("El nombre del usuario es: "+juntas.toUpperCase());
    }
}

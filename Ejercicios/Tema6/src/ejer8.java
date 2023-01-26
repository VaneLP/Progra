import java.util.Scanner;

public class ejer8 {
    /*
    8. Realiza un programa que solicite que se le introduzcan una cadena y un carácter y
    nos muestre cuantas veces está contenido el carácter en la cadena.
     */
    public static void main(String[] args) {
        //variable
        Scanner entrada= new Scanner(System.in);
        int cont=0;

        //introducir cadena y caracter
        System.out.println("Introduce una cadena");
        String cadena= entrada.next();

        System.out.println("Dime un caracter");
        String carac= entrada.next();
        //pasar variable carac que esta en string a char
        char cambio= carac.charAt(0);

        //variable
        int longi= cadena.length();

        //cuantas veces tiene la cadena el caracter
        for (int i=0; i<longi ;i++){
            //buscar caracter igual
           if (cadena.charAt(i)==(cambio))
            cont++;
        }

        //mostrar por pantalla resultados
        System.out.println("En la cadena: "+cadena+" .El caracter seleccionado "+carac+" se repite: "+cont+ " veces");

    }
}



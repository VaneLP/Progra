import java.util.Scanner;

public class lvl4_ejer34 {
    /*
    34. Dígitos de un número. Realiza un programa que nos diga los dígitos de un número
introducido por teclado. No trabajes con cadenas de caracteres.
     */
    public static void main(String[] args) {

        System.out.println("Dime un numero");

        Scanner entrada = new Scanner(System.in);
        int num= entrada.nextInt();
        int cont=1;

        while(num>9){
            num=num/10;
            cont = cont+1;
        }

        System.out.println("El numero tiene " + cont + " digitos");
    }
}

import java.util.Scanner;

public class lvl4_ejer27 {
    /*
    27. Realiza un programa que lea un número y a continuación escriba el carácter “*”
tantas veces igual al valor numérico leído. En aquellos casos en que el valor leído no
sea positivo se deberá escribir un único asterisco.
Ejemplo:
run:
Dime un numero: 8
     */
    public static void main(String[] args) {

        System.out.println("Introduce un numero");
        Scanner entrada= new Scanner(System.in);
        int num= entrada.nextInt();

        if (num<0){
            System.out.println("*");
        }
        else{
            for(int cont=1;cont<=num;cont++){
                System.out.println("*");
            }
        }
    }
}

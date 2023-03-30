import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Entornos11 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        int numAle= ThreadLocalRandom.current().nextInt(1,100+1);

        System.out.printf("Intenta adivinar el numero entre el 1 y el 100. " +
                            "\nIntroduce -1 si te quieres rendir :)" +
                "\nPorfavor NO INTRODUCIR LETRAS :D, NI DECIMALES :), NI NUMERO LARGOS :(, NI CARACTERES ESPECIALES >:[ si no el programa se rompe y no quiero arreglarlo jiji"+
                "\nNi dejes un victor o un gato encima del enter porfavor y gracias, no se rompe el programa, pero hay compañeros tocapelotas xD"+
                "\nIntroduce el numero = ");

        int r= entrada.nextInt();

        do {
            if(r>numAle) {
                System.out.printf("El numero es menor."+
                                    "\nIntroduce otro numero = ");
                r= entrada.nextInt();

            } else if (r<numAle) {
                System.out.printf("El numero es mayor."+
                                    "\nIntroduce otro numero = ");
                r= entrada.nextInt();

            }else {
                System.out.println("¡HAS ACERTADO!");
                break;
            }

        }while(r!=-1);
    }
}

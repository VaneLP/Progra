import java.util.Scanner;

public class lvl4_ejer17 {
    /*
    17. Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números una y
otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor, menor
o igual al número que ha pensado).
     */
    public static void main(String[] args) {

        System.out.println("Piensa un numero del 1 al 100");

        //inicializamos y asignamos variables
        int inicial= 50, calculo =25, adivinar=0;

        //Iniciamos un bucle while
        while (adivinar==0) {

            //mostramos si el numero es el incial (50)
            System.out.println("Tu numero es " + inicial);
            //pedimos que nos introduzca la respuesta
            Scanner entrada = new Scanner(System.in);
            String respuesta = entrada.nextLine();

            //Si la respuesta es SI, adivinar es igual a 1 y termina
            if (respuesta.equals("si")) {
                adivinar = 1;
            }
            //si la respuesta es NO, preguntamos nuevamente si es mayor
            else {
                System.out.println("Tu numero es mayor que " + inicial + "?");
                respuesta = entrada.nextLine();

                    //si la rwspuesta es SI, sumamos a la inicial, nuestra variable calculo
                    if (respuesta.equals("si")) {
                    inicial = inicial + calculo;
                    }
                    //Si la respuesta es NO, restamos a la inicial, nuestra variable calculo
                    else {
                    inicial = inicial - calculo;
                    }

                    /*Una vez habiendo sumando y restado, dependiendo de lo que haya respondido
                    a nuestra variable calculo la divimos entre dos para que nos de la mitad de la
                    mitad
                     */
                    calculo = calculo / 2;

                    //Cuando calculo sea
                    if (calculo == 0) {
                    calculo = 1;
                    }
            }


        }


        System.out.println("Tu numero es "+ inicial);

    }
}

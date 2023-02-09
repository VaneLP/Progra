import java.util.concurrent.ThreadLocalRandom;

public class lvl4_ejer32 {
    /*
    32. El dado. Realiza un programa que simule la tirada de un dado, aleatoriamente sacará
un número entre el 1 y el 6. Estamos jugando al parchís, ¿Cuántas veces hemos tenido
que tirar el dado hasta sacar un 5?
     */
    public static void main(String[] args) {

        int cont = 0, dado;

        do {
            dado = ThreadLocalRandom.current().nextInt(1, 6 + 1);
            System.out.println(dado);

            cont = cont + 1;

        }while(dado != 5);




        System.out.println("Para que salga un 5 hemos tirado el dado " + cont + " veces");


    }
}

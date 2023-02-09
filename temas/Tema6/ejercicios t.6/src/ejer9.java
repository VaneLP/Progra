import java.util.concurrent.ThreadLocalRandom;

public class ejer9 {
     /*
     9. Realiza un programa que muestre una contraseña generada aleatoriamente
teniendo las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo
pueden ser letras entre la ‘a’ y la ‘j’.
      */
     public static void main(String[] args) {
          //variable de las letras comprendidas de la a la j
          String letras="abcdefghij";

          //generar numero aleatorio del 5 al 10 para la long de la cadena
          int numR1=ThreadLocalRandom.current().nextInt(5,10+1);

          System.out.println("La contraseña generada aleatoriamente es: ");

          for (int i =0;i<numR1;i++) {

               //generar segundo numero random del 0 al 9 para que luego busque aleatoriamente el caracter
               int numR2 = ThreadLocalRandom.current().nextInt(0, 9 + 1);
               System.out.println(letras.charAt(numR2));

          }
     }
}

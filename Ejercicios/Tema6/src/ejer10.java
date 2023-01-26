import java.util.concurrent.ThreadLocalRandom;

public class ejer10 {
     /*
10.Realiza un programa que muestre una contraseña generada aleatoriamente
teniendo las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo
pueden ser letras entre la ‘a’ y la ‘j’ pero sin letras repetidas.
      */
     public static void main(String[] args) {
          //variable de las letras comprendidas de la a la j
          String letras="abcdefghij";
          String contra="";

          //generar numero aleatorio del 5 al 10 para la long de la cadena
          int numR1= ThreadLocalRandom.current().nextInt(5,10+1);

          //hacemos un do-while para que pare cuando el numero random sea igual a la long de la variable
              do {

                   //generar segundo numero random del 0 al 9 para que luego busque aleatoriamente el caracter
                   int numR2 = ThreadLocalRandom.current().nextInt(0, 9 + 1);

                   //asignamos a la variable carac que sea un char y que tenga el valor del caracter de la variable letras
                   char carac = letras.charAt(numR2);

                   /*
                   con el if comprobamos que cuando la posicion del caracter buscado con indezOf devuelva -1 y sea = a -1
                   a la variable contra le concatenamos el caracter que no se repite, mientras el caracter se este repitiendo
                   el bucle se sigue ejecutando hasta que la longitud sea igual al numero
                   */
                   if (contra.indexOf(carac) == -1)
                        contra = contra + carac;

              }while(contra.length() != numR1);


          System.out.println("La contraseña generada aleatoriamente es: "+ contra);
     }
}

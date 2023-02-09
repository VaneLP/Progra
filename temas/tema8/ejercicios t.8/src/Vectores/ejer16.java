package Vectores;

import java.util.Arrays;

public class ejer16 {
    /* Crea un programa que cree un array de enteros e introduzca la siguiente secuencia
de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego
la muestre por pantalla. En esta ocasión has de utilizar Arrays.fill().*/
    public static void main(String[] args) {
        //para cotar el tamaño de la array
        int tamanyo=0;
        for (int p=1; p<=10;p++){
            tamanyo+=p;
        }

        //creamos la array
        int[] numeros= new int[tamanyo];

        //Creamos dos variable que van a ser el valorIni que lo inicializamos 1 y otra variable que usaremos para la posicion del array
        int valorIni=1,posicion=0;

        // usamos array / posicion ini / posicion final / valor que quieras meterle al array
        Arrays.fill(numeros, valorIni, tamanyo,posicion );

        //cramos un bucle while en el que mientras que valorIni sea igual o menor a 10 continue
        while (valorIni<=10) {

            //creamos un for que empiece en la posicion 0 y continue mientras que j sea menor a nuestro valor inicial y le sumamos uno
            for (int j = 0; j <valorIni; j++) {
                //en nuestra array con la variable posicion vamos incrementando de 1 en uno cada vez que el for se cumpla y le asignamos el valorIni
                // usamos array / posicion ini / posicion final / valor que quieras meterle al array
                Arrays.fill(numeros, posicion++, tamanyo,valorIni);
            }

            //hacemos que nuentro valorIni incremente en uno cuando termina el for
            valorIni++;
        }

        //mostramos por pantalla
        for (int mostrar:numeros) {
            System.out.print(mostrar+" ");
        }





    }
}

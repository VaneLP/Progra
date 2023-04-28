package ejerB.ejr1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejer1B {
    public static void main(String[] args) {
        //le pasamos el archivo que queremos ver
        File f = new File("temas\\tema12\\DOCS\\numeros.txt");

        int numfichero, numMax=-1, numMin=999999999;

        //para leer el fichero
        try (Scanner entrada = new Scanner(f)){

            //mientras que queden lineas que continue
            while(entrada.hasNext()){
                //para leer el numero
                numfichero= entrada.nextInt();

                //comprobamos si el numero es mayor o menor
                if(numfichero>numMax){
                    numMax=numfichero;
                }
                if (numfichero<numMin) {
                    numMin=numfichero;
                }

            }

            //mostramos el numero
            System.out.println("Numero maximo: " + numMax + " - Numero minimo: " + numMin);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

package ejerB.ejr1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer1B {
    public static void main(String[] args) {
        //le pasamos el archivo que queremos ver
        File f = new File("numeros.txt");

        //para leer el fichero
        try (Scanner entrada = new Scanner(f)){



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

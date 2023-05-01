package ejerB.ejr5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ejer5B {
    public static void main(String[] args) {
        //cramos la carpeta
        File carpetaDiccionario = new File("temas\\tema12\\DOCS\\Diccionario");
        carpetaDiccionario.mkdir();

        File diccionario = new File("temas\\tema12\\DOCS\\diccionario.txt");

        char alfa;
        for (int i = 65; i <= 90; i++) {
            //al pasalo a char el ya sabe que numero es en el ASCII
            alfa = (char) i;

            //creamos la archivo
            try (PrintWriter pw = new PrintWriter("temas\\tema12\\DOCS\\Diccionario\\" + alfa + ".txt");
                 Scanner lectura = new Scanner(diccionario)) {
                //recorremos las palabras
                while (lectura.hasNext()) {
                    String palabra=lectura.next();

                    if(palabra.toUpperCase().charAt(0)==alfa)
                        pw.println(palabra);
                }
            }
            catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    }
}


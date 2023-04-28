package ejerB.ejr2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejer2B {
    public static void main(String[] args) {
        String linea;
        File f = new File("temas\\tema12\\DOCS\\alumnos_notas.txt");
        int notas=0,media,cont=1;

        try(Scanner entrada = new Scanner(f)){
            while (entrada.hasNextLine()){
                linea= entrada.nextLine();

                String[] partes = linea.split(" ");
                System.out.printf("%nNombre: %s %nApellido: %s %n", partes[0], partes[1]);

                for(int i = Integer.parseInt(partes[2]); i <= partes.length; i++){
                    System.out.println(i);
                    notas = notas + i;
                    cont++;
                }
                media=notas/cont;

                System.out.println("Nota media: "+media);
                System.out.println("-------------");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

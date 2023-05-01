package ejerB.ejr3;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ejer3B {
    public static void main(String[] args) {
        ArrayList<Persona> lista= new ArrayList<>();

        String linea;

        //le pasamos los archivos
        File a=new File("temas\\tema12\\DOCS\\usa_personas.txt");
        File b=new File("temas\\tema12\\DOCS\\usa_personas_sorted.txt");

        //para leer el fichero
        try(Scanner entrada = new Scanner(a);
            //para escribir en el fichero
            PrintWriter pw =new PrintWriter(b)){

            //mientras que queden lineas que continue
            while (entrada.hasNextLine()) {
                //para leer la linea
                linea = entrada.nextLine();

                String[] partes = linea.split(" ");
                lista.add(new Persona(partes[0], partes[1]));
            }

            //ordenar
            lista.sort(new Comparator<Persona>() {
                @Override
                public int compare(Persona p1, Persona p2) {
                    if (p1.getNombre().equals(p2.getNombre()))
                        return p1.getApellido().compareTo(p2.apellido);

                    return p1.getNombre().compareTo(p2.nombre);
                }
            });

            //mostrar prueba
            for (Persona persona : lista) {
                System.out.println(persona);
            }

            //Para la escritura del archivo B
            for (Persona persona : lista) {
                pw.println(persona);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

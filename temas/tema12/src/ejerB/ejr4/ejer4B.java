package ejerB.ejr4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ejer4B {
    public static void main(String[] args) {
        File nombre = new File("temas\\tema12\\DOCS\\usa_nombres.txt");
        File apellidos = new File("temas\\tema12\\DOCS\\usa_apellidos.txt");
        File nuevoArchivo = new File("temas\\tema12\\DOCS\\usa_personasPRUEBA.txt");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos nombre de personas deseas generar?");
        int numPerso = entrada.nextInt();

        ArrayList<Persona> lista = new ArrayList<>();

        String lineaNombre;
        String lineaApellido;


        //para leer el fichero
        try (Scanner entradaNombres = new Scanner(nombre); Scanner entradaApellidos = new Scanner(apellidos);
             //para escribir en el fichero
             PrintWriter pw = new PrintWriter(nuevoArchivo)) {

            //guardar todos los nombre y todos los apellidos
            ArrayList<String> listaNombres = new ArrayList<>();
            ArrayList<String> listaApellidos = new ArrayList<>();

            while (entradaNombres.hasNextLine() && entradaApellidos.hasNextLine()) {
                lineaNombre = entradaNombres.nextLine();
                lineaApellido = entradaApellidos.nextLine();

                listaNombres.add(lineaNombre);
                listaApellidos.add(lineaApellido);
            }

            //para generar nombre y ape ale
            for (int j=1;j <= numPerso;j++) {
                int numAleNom = ThreadLocalRandom.current().nextInt(0, listaNombres.size());
                int numAleApp = ThreadLocalRandom.current().nextInt(0, listaApellidos.size());

                String nombreAle = listaNombres.get(numAleNom);
                String apellidoAle = listaApellidos.get(numAleApp);

                lista.add(new Persona(nombreAle, apellidoAle));
            }

            //mostrar prueba
            for (Persona persona : lista) {
                System.out.println(persona);
            }

            //escrubir en el archivo
            for (Persona persona : lista) {
                pw.println(persona);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}

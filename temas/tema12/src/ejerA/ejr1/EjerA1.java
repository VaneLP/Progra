package ejerA.ejr1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class EjerA1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String ruta;


        do {
            System.out.println("Dime una ruta del sistema de archivos. Introduce una ruta vacia para salir");
            ruta = entrada.nextLine();

            //creamos el File y le pasamos como parametro la ruta que queremos comprobar
            File f = new File(ruta);

            //capturamos la excepcion
            try {
                muestraInfoRuta(f);

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("----------");

        } while (!ruta.equals(""));

    }


    public static void muestraInfoRuta(File ruta) throws FileNotFoundException {
        if (!ruta.exists())
            throw new FileNotFoundException("Ruta no encontrada/no existe");

        //archivos de FUERA
        if (ruta.isFile())
            System.out.println("[A] " + ruta.getName());

//         else if (ruta.isDirectory()){
            //asi mostramos lo dos directorios y archivos
//             for (File file : lista) {
//                 System.out.println(file);
//             }

        //directorios de FUERA
        else if (ruta.isDirectory()) {
            //array para la lista de los archivos de la ruta
            File[] lista = ruta.listFiles();

            //arraylist de ficheros para ordenarlos
            ArrayList<File> listaOrdenada = new ArrayList<>();

            //para los archivos de DENTRO
            //metemos toddo lo de la array al arrayList
            for (File meter : lista) {
                listaOrdenada.add(meter);
            }

            //ordenar con una clase anonima que con un comparator me compare:
            listaOrdenada.sort(new Comparator<File>() {
                @Override
                public int compare(File archivo1, File archivo2) {
                    //si ambos son arvhivos
                    if (archivo1.isFile() && archivo2.isFile())
                        return 0;

                        //el 1 es un archivo 2 es directorio
                    else if (archivo1.isFile() && !archivo2.isFile())
                        return 1;

                        //el 1 es directorio y el 2 si
                    else if (!archivo1.isFile() && archivo2.isFile())
                        return -1;

                        //si ninguno es un archivo
                    else
                        return 0;
                }
            });

            //mostramos
            for (File file : listaOrdenada) {
                if (file.isFile())
                    System.out.println("[A] " + file.getName());
                else if (file.isDirectory())
                    System.out.println("[*] " + file.getName());
            }

            /*tambien recorriendo dos veces la lisra, una para directorios y otra para los archivoss*/
        }

    }
}

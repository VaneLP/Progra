package ejerA.ejr3;

import java.io.File;
import java.util.ArrayList;

public class EjerA3 {
    public static void main(String[] args) {
        //cambiar nombres
        //DOCUMENTOS
        File documentos = new File("temas\\tema12\\documentos");
        System.out.println(documentos.getPath());

        System.out.println(documentos.renameTo(new File("temas\\tema12\\DOCS")));

        //FOTOGRAFIAS
        File fotografias = new File("temas\\tema12\\DOCS\\Fotografias");
        System.out.println(fotografias.getPath());

        System.out.println(fotografias.renameTo(new File("temas\\tema12\\DOCS\\FOTOS")));

        //LIBROS
        File libros = new File("temas\\tema12\\DOCS\\Libros");
        System.out.println(libros.getPath());

        System.out.println(libros.renameTo(new File("temas\\tema12\\DOCS\\LECTURAS")));

        System.out.println("-----------");

        //cambiar el nombre de todos los archivos de fotos y lecturas quitando extension
        //FOTOS

        File fotosRenombrar = new File("temas\\tema12\\DOCS\\FOTOS");
        //creamos un array de file
        File[] listaFotos = fotosRenombrar.listFiles();

        //creamos un string para guardar
        String imagenActual;

        for(int i=0; i< listaFotos.length;i++){
            //obtenemos la ruta de la imagen
            imagenActual = listaFotos[i].getPath();

            //pasamos a un stringBuilder la cadena de texto anterior
            StringBuilder imagenRenombrada = new StringBuilder(imagenActual);
            //eliminamos empezando al final de la cadena de texto original hasta -4 caracteres que seria hasta el .
            imagenRenombrada.delete(listaFotos[i].getPath().length()-4,listaFotos[i].getPath().length());

            System.out.println(imagenRenombrada);

            System.out.print("Foto renombrada: ");
            System.out.println(listaFotos[i].renameTo(new File(imagenRenombrada.toString())));
        }


        System.out.println("-------");


        //LIBROS

        File librosRenombrar = new File("temas\\tema12\\DOCS\\LECTURAS");
        //creamos un array de file
        File[] listaLibros = librosRenombrar.listFiles();

        //creamos un string para guardar
        String libroActual;

        for(int i=0; i< listaLibros.length;i++){
            //obtenemos la ruta de la libro
            libroActual = listaLibros[i].getPath();

            //pasamos a un stringBuilder la cadena de texto anterior
            StringBuilder libroRenombrada = new StringBuilder(libroActual);
            //eliminamos empezando al final de la cadena de texto original hasta -4 caracteres que seria hasta el .
            libroRenombrada.delete(listaLibros[i].getPath().length()-4,listaLibros[i].getPath().length());

            System.out.println(libroRenombrada);

            System.out.print("Libro renombrada: ");
            System.out.println(listaLibros[i].renameTo(new File(libroRenombrada.toString())));
        }



        /*
        Tambien con substring
        String nuevoNombre=f.getName().substring(0,f.getName().lastIndexOf('.'));
        f.renameTo(new File(f.getParent()+"/"+nuevonombre));
        */
    }
}

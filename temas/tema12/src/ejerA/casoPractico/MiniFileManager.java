package ejerA.casoPractico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class MiniFileManager {
    //atributos


    //metodos
    /**
     * pwd: Muestra cual es la carpeta actual
     */
    public void mostrarCarpetaActu (File ruta) throws FileNotFoundException{
        if(!ruta.exists())
            throw new FileNotFoundException("Ruta no encontrada/no existe");

        System.out.println(ruta.getPath());
    }

    /**
     * cd <DIR>: Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior
     */
    public void  cambiaCarpetaActuADir(File ruta) throws FileNotFoundException{
        if(!ruta.exists())
            throw new FileNotFoundException("Ruta no encontrada/no existe");

        else if(ruta.equals(".."))
            ruta.getParent();

        else
            ruta.renameTo(ruta);
    }

    /**
     * ls: Muestra la lista de directorios y archivos de la carpeta actual (primerodirectorios,
     * luego archivos, ambos ordenados alfabéticamente)
     */
    public void  mostrarListaDirecYArchi(File ruta) throws FileNotFoundException{
        if(!ruta.exists())
            throw new FileNotFoundException("Ruta no encontrada/no existe");

        //para los archivos de FUERA
        if(ruta.isFile())
            System.out.println(ruta.getName());

        //para las carpetas de FUERA
        if (ruta.isDirectory()){
            //array para la lista de los archivos de la ruta
            File[] lista = ruta.listFiles();

            //arraylist de ficheros para ordenarlos
            ArrayList<File> listaOrdenada =new ArrayList<>();

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
                        System.out.println(file.getName());
                    else if (file.isDirectory())
                        System.out.println(file.getName());
                }

        }
    }

    /**
     * ll: Como ls pero muestra también el tamaño y la fecha de última modificación
     */
    public void  mostrarTamanyoYFecha(File ruta) throws FileNotFoundException{
        if(!ruta.exists())
            throw new FileNotFoundException("Ruta no encontrada/no existe");

        //para los archivos de FUERA
        if(ruta.isFile())
            System.out.println(ruta.getName());

        //Para las carpetas de FUERA
        if (ruta.isDirectory()) {
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
                //el nombre del archivo
                if (file.isFile())
                    System.out.println(file.getName());

                    //el nombre de la carpeta
                else if (file.isDirectory())
                    System.out.println(file.getName());

                //lo que pesa y la ultima fecha de modificacion
                System.out.println(file.length() + " bytes");
                Date fechaMod = new Date(file.lastModified());
                System.out.println(fechaMod);
            }
        }
    }

    /**
     * mkdir <DIR>: Crea el directorio ‘DIR’ en la carpeta actual
     */
    public void  creaeDirec(File ruta){
        System.out.println("Carpeta añadido: " + ruta.mkdir());
    }

    /**
     * rm <FILE>: Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego lacarpeta.
     * Si tiene subcarpetas, las dejará intactas y mostrará un aviso al usuario
     */
    public void  borrar(){

    }

    /**
     * mv <FILE1> <FILE2>: Mueve o renombra ‘FILE1’ a ‘FILE2’
     */
    public void  mueveORenombra(){

    }


}

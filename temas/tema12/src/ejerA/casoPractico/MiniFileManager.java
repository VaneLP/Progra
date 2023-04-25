package ejerA.casoPractico;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class MiniFileManager {
    //atributos
    File rutaGuardada= new File("C:/");

    //metodos
    /**
     * pwd: Muestra cual es la carpeta actual
     */
    public void mostrarCarpetaActu (){
        System.out.println(rutaGuardada.getPath());
    }

    /**
     * cd <DIR>: Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior
     */
    public void  cambiaCarpetaActuADir(File ruta) throws FileNotFoundException{
        if(!ruta.exists())
            throw new FileNotFoundException("Ruta no encontrada/no existe");

        else if(ruta.equals(".."))
            rutaGuardada.getParent();

        else
            rutaGuardada=ruta;

    }

    /**
     * ls: Muestra la lista de directorios y archivos de la carpeta actual (primero directorios,
     * luego archivos, ambos ordenados alfabéticamente)
     */
    public void  mostrarListaDirecYArchi(){
        //para los archivos de FUERA
        if(rutaGuardada.isFile())
            System.out.println(rutaGuardada.getName());

        //para las carpetas de FUERA
        if (rutaGuardada.isDirectory()){
            //array para la lista de los archivos de la ruta
            File[] lista = rutaGuardada.listFiles();

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
    public void  mostrarTamanyoYFecha(){
        //para los archivos de FUERA
        if(rutaGuardada.isFile())
            System.out.println(rutaGuardada.getName());

        //Para las carpetas de FUERA
        if (rutaGuardada.isDirectory()) {
            //array para la lista de los archivos de la ruta
            File[] lista = rutaGuardada.listFiles();

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
    public void  creaeDirec(String carpeta){
        //modifico la ruta que ya teniamos le añadimos las barras porque no se ponenen solas y le añadimos la carpeta
        //que queremos crear nueva
        File creacion = new File(rutaGuardada + "\\" + carpeta);

        //creamos la carpeta
        System.out.println("¿Carpeta añadida? " + creacion.mkdir());
    }

    /**
     * rm <FILE>: Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego la carpeta.
     * Si tiene subcarpetas, las dejará intactas y mostrará un aviso al usuario
     */
    public void  borrar() throws Exception{
        //si es un archivo
        if(rutaGuardada.isFile()) {
            //eliminamos
            System.out.println("¿El archivo a podido eliminarse? "+ rutaGuardada.delete());
        }

        //si es una carpeta
        else{
            //array para la lista de los archivos de la ruta
            File[] lista = rutaGuardada.listFiles();

            //mostramos
            for (File file : lista) {
                if (file.isFile())
                    System.out.println("¿El archivo a podido eliminarse? "+ file.delete());

                else
                    throw new Exception("AVISO: 'Imposible borrar la carpeta actual, esta tiene subcarpetas dentro.'");
            }

            System.out.println("¿El directorio a podido eliminarse? "+ rutaGuardada.delete());
        }
    }

    /**
     * mv <FILE1> <FILE2>: Mueve o renombra ‘FILE1’ a ‘FILE2’
     */
    public void  mueveORenombra(File f1, File f2) throws FileNotFoundException{
        if(!f1.exists())
            throw new FileNotFoundException("Ruta 1 no encontrada/no existe");

        else if(!f2.exists())
            throw new FileNotFoundException("Ruta 2 no encontrada/no existe");

        System.out.println("¿Se a podido mover o renombrar? "+ f1.renameTo(f2));
    }

}

package ejerA.ejr5;

import java.io.File;
import java.io.FileNotFoundException;

public class EjerA5 {
    public static void main(String[] args) {
        try {
            borrarTodo(new File("temas\\tema12\\DOCS\\Mis Cosas\\FOTOS"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean borrarTodo(File f) throws Exception{
        if (!f.exists())
            throw new FileNotFoundException("Ruta no encontrada/no existe");

        //si es un archivo
        if(f.isFile()) {
            //eliminamos
            return f.delete();
        }

        else{
            //array para la lista de los archivos de la ruta
            File[] lista = f.listFiles();

            //mostramos
            for (File file : lista) {
                if (file.isFile())
                    return file.delete();

                //Super extra challenge
                else
                    return borrarTodo(file);
            }

            return f.delete();
        }
    }



}

package ejr3;

import java.io.File;
import java.util.ArrayList;

public class EjerA3 {
    public static void main(String[] args) {
        //cambiar nombres
        //DOCUMENTOS
        File documentos = new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\documentos");
        System.out.println(documentos.getPath());

        System.out.println(documentos.renameTo(new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\DOCS")));

        //FOTOGRAFIAS
        File fotografias = new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\documentos\\Fotografias");
        System.out.println(fotografias.getPath());

        System.out.println(fotografias.renameTo(new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\documentos\\FOTOS")));

        //LIBROS
        File libros = new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\documentos\\Libros");
        System.out.println(libros.getPath());

        System.out.println(libros.renameTo(new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\documentos\\LECTURAS")));

        //cambiar el nombre de todos los archivos de fotos y lecturas quitando extension
        File[] lista = fotografias.listFiles();
        

        
        for(int i=0; i<;i++)
            
        fotografias.isFile()
        
    }
}

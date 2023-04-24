package ejr4;

import java.io.File;

public class EjerA4 {
    public static void main(String[] args) {
        //crear carpeta mis cosas
        File misCosas = new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\documentos\\DOCS\\Mis Cosas");
        System.out.println(misCosas.mkdir());

        //crear carpeta alfabeto
        File alfabeto = new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\documentos\\DOCS\\Alfabeto");
        System.out.println(alfabeto.mkdir());

        //mover carpeta fotografias y libros dentro de mis cosas
        File fotografias = new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\documentos\\FOTOS");
        System.out.println(fotografias.renameTo(new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\documentos\\DOCS\\Mis Cosas")));

        File libros = new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\documentos\\LECTURAS");
        System.out.println(libros.renameTo(new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\documentos\\DOCS\\Mis Cosas")));

        //Dentro de la carpeta alfabeto crear carpeta para cada letra del alfabeto
        //ASCII A=65 - Z=90
        for (int i=65; i<=90; i++){

        }


    }
}

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

        //Dentro de la carpeta alfabeto crear carpeta para cada letra del alfabeto
        //ASCII A=65 - Z=90

    }
}

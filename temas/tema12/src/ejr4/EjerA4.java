package ejr4;

import java.io.File;

public class EjerA4 {
    public static void main(String[] args) {
        //crear carpeta mis cosas
        File misCosas = new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\DOCS\\Mis Cosas");

        System.out.println("Mis cosas añadida: "
                +misCosas.mkdir());

        //crear carpeta alfabeto
        File alfabeto = new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\DOCS\\Alfabeto");

        System.out.println("Alfabeto añadido: "
                +alfabeto.mkdir());

        //mover carpeta fotografias y libros dentro de mis cosas
        File fotografias = new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\DOCS\\FOTOS");

        System.out.println("Movido: "
                +fotografias.renameTo(new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\FOTOS\\Mis Cosas")));

        File libros = new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\DOCS\\LECTURAS");

        System.out.println("Movido: "
                +libros.renameTo(new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\DOCS\\Mis Cosas")));

        //Dentro de la carpeta alfabeto crear carpeta para cada letra del alfabeto

        //ASCII A=65 - Z=90
        char alfa;

        //le indicamos que empezamos en el 65 porque ahi es donde empieza en el caracter A y termina en
        // el 90 que es donde esta la Z en el ASCII
        for (int i=65; i<=90; i++){
            //al pasalo a char el ya sabe que numero es en el ASCII
            alfa= (char) i;

            //creamos la carpeta
            File carpetasAlfabeto =new File("C:\\Users\\Vanessa\\Documents\\GitHub\\Progra\\temas\\tema12\\documentos\\DOCS\\Alfabeto\\" + alfa);

            System.out.println("Carpeta añadida: "
                    +carpetasAlfabeto.mkdir());
        }


    }
}

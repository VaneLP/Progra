package ejerA.casoPractico;

import java.io.File;

public class pruebas {
    public static void main(String[] args) {
        File prueba = new File("C:\\Users\\Vane\\Documents\\Progra\\temas\\tema12\\DOCS");
        String stri= "Hola";

        File prueba2 = new File(prueba + "\\"+stri);
        System.out.println(prueba2.getPath());


    }
}

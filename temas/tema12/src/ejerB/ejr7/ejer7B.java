
package ejerB.ejr7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ejer7B {
    public static void main(String[] args) {
        File libros = new File("temas\\tema12\\DOCS\\Mis cosas\\LECTURAS\\lazarillo");
        int contadorLineas=0, contadorPalabras=0, contadorCaracteres=0;
        Map<String,Integer> mapaPalabras =new HashMap<>();

        try (Scanner lectura = new Scanner(libros)) {
            while (lectura.hasNextLine()){
                String espacio = lectura.nextLine();
                contadorLineas++;

                String[] palabras=espacio.split(" ");
                contadorPalabras = contadorPalabras + palabras.length;

                for (String palabra : palabras) {
                    if((mapaPalabras.containsKey(palabra)))
                        mapaPalabras.put(palabra,mapaPalabras.get(palabra)+1);
                    else
                        mapaPalabras.put(palabra,1);

                    contadorCaracteres = contadorCaracteres + palabra.length();
                }
            }
            System.out.println("Numero de lineas = "+contadorLineas);
            System.out.println("Numero de palabras = "+contadorPalabras);
            System.out.println("Numero de caracteres = "+contadorCaracteres);
            System.out.println("10 palabras mas usados");

            ArrayList<Map.Entry<String,Integer>> lista =new ArrayList<>(mapaPalabras.entrySet());
            lista.sort(new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });

            for (int i=0;i<10;i++){
                System.out.println(lista.get(i));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

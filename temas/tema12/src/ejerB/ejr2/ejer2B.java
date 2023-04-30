package ejerB.ejr2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ejer2B {
    public static void main(String[] args) {
        //arrayList para guardar a los alumnos
        ArrayList<Alumno> listaAlumno =new ArrayList<>();

        String linea;
        File f = new File("temas\\tema12\\DOCS\\alumnos_notas.txt");
        int notas,media,cont;

        try(Scanner entrada = new Scanner(f)){
            while (entrada.hasNextLine()){
                linea= entrada.nextLine();

                String[] partes = linea.split(" ");
                notas=0;cont=0;

                for(int i = 2; i < partes.length; i++){
                    notas = notas+Integer.parseInt(partes[i]);
                    cont++;
                }
                media=notas/cont;

                //cramos los alumnos y los guardamos
                listaAlumno.add(new Alumno(partes[0],partes[1],media));

                //los ordenamos por media
                listaAlumno.sort(new Comparator<Alumno>() {
                    @Override
                    public int compare(Alumno a1, Alumno a2) {
                        //nota media a1 > a2 = -1
                        if(a1.getNotaMedia() > a2.getNotaMedia())
                            return  -1;
                        //nota media a2 > a1 = 1
                        if(a1.getNotaMedia() < a2.getNotaMedia())
                            return  1;
                        //a1 = a2 =0
                        else
                            return 0;
                    }
                });

            }

            //mostramos los alumnos
            for (Alumno a : listaAlumno) {
                System.out.printf("%nNombre: %s, Apellido: %s, Media: %d",a.getNombre(),a.getApellido(),a.getNotaMedia());
                System.out.printf("%n-------------------------------------------------");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

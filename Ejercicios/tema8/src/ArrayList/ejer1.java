package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ejer1 {
    /*Realiza un programa que tenga un ArrayList llamado AlturaAlumnos que mantenga una lista con las alturas de los alumnos de un centro. Serán valores positivos entre 0,50 y 2,50
redondeados a dos decimales. El programa tendrá las siguientes funciones (accesibles mediante un menú):
a) Añadir altura.
b) Mostrar lista actual con el número de posición.
c) Eliminar por posición. Se le pasa como parámetro una posición y elimina la altura en dicha posición.
d) Eliminar por valor. Se le pasa como parámetro una altura y elimina todas las posiciones en las que se encuentre dicha altura. Devuelve la cantidad de eliminaciones.
e) Ordenar la lista*/
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int op=0, altura;

        ArrayList alturasAlumnos= new ArrayList<>();

        do {
            System.out.printf("%n_______________________" +
                    "%nMenu" +
                    "%n_______________________" +
                    "%n1. Añadir altura" +
                    "%n2. Mostrar lista" +
                    "%n3. Eliminar por posicion" +
                    "%n4. Eliminar por valor" +
                    "%n5. Ordenar lista" +
                    "%n6. Salir"+
                    "%nOpcion: ");

            op= entrada.nextInt();
            System.out.println("_______________________");

            switch (op){
                case 1:
                    System.out.println("¿Que altura deseas añadir?");
                    altura= entrada.nextInt();

                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;
            }

        }while(op!=6);
    }
    //añadir altura
    public void anyadirAltura (ArrayList alturasAlum, int altura){
        alturasAlum.add(altura);
    }

    //Mostrar lista actual con el número de posición.
    public void mostrarlista(ArrayList alturaAlum){
        for (int i =0;i<alturaAlum.size();i++){
            System.out.println("El alumno en la posicion "+i+"tiene una altura de: "+alturaAlum.get(i));
        }
    }

    //Eliminar por posición. Se le pasa como parámetro una posición y elimina la altura en dicha posición.
    public void eliminarPosi (ArrayList alturaAlum, int posicion){
        alturaAlum.remove(posicion);
    }

    //Eliminar por valor. Se le pasa como parámetro una altura y elimina todas las posiciones en las que se encuentre dicha
    // altura. Devuelve la cantidad de eliminaciones.
    public void eliminarValor (ArrayList alturaAlum, int altura){
        int cont=0;
        while(alturaAlum.remove((Object) altura)){
            cont++;
            System.out.println("Se han eliminado un total de: "+cont+" alturas");
        }
    }

    //Ordenar la lista
    public void ordernar (ArrayList alturaAlum){
        Collections.sort(alturaAlum);
    }

}

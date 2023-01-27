package ArrayList;

import java.util.ArrayList;
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
        int op=0;

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
                    System.out.printf("1. Añadir altura" +
                                    "%n¿Que altura deseas añadir? ");
                    double altura= entrada.nextDouble();
                    anyadirAltura(alturasAlumnos,altura);
                    break;

                case 2:
                    System.out.println("2. Mostrar lista");
                    mostrarlista(alturasAlumnos);
                    break;

                case 3:
                    System.out.printf("3. Eliminar por posicion" +
                            "%n¿Que posicion deseas eliminar? ");
                     int posicion= entrada.nextInt();
                    eliminarPosi(alturasAlumnos,posicion);
                    break;

                case 4:
                    System.out.printf("4. Eliminar por valor" +
                            "%n¿Que valor deseas eliminar? ");
                    double valor= entrada.nextDouble();
                    eliminarValor(alturasAlumnos,valor);
                    break;

                case 5:
                    System.out.println("5. Ordenar lista");
                    ordernar(alturasAlumnos);
                    mostrarlista(alturasAlumnos);
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;
            }

        }while(op!=6);
    }

    //añadir altura
    public static void anyadirAltura (ArrayList alturasAlum, double altura){
        alturasAlum.add(altura);
    }

    //Mostrar lista actual con el número de posición.
    public static void mostrarlista(ArrayList alturaAlum){
        for (int i =0;i<alturaAlum.size();i++){
            System.out.println("El alumno en la posicion "+(i+1)+" tiene una altura de: "+alturaAlum.get(i));
        }
    }

    //Eliminar por posición. Se le pasa como parámetro una posición y elimina la altura en dicha posición.
    public static void eliminarPosi (ArrayList alturaAlum, int posicion){
        alturaAlum.remove(posicion-1);
    }

    //Eliminar por valor. Se le pasa como parámetro una altura y elimina todas las posiciones en las que se encuentre dicha
    // altura. Devuelve la cantidad de eliminaciones.
    public static void eliminarValor (ArrayList alturaAlum, double altura){
        int cont=0;
        while(alturaAlum.remove((Object) altura)){
            cont++;
            System.out.println("Se han eliminado un total de: "+cont+" alturas");
        }
    }

    //Ordenar la lista
    public static void ordernar (ArrayList alturaAlum){
        Collections.sort(alturaAlum);
    }

}

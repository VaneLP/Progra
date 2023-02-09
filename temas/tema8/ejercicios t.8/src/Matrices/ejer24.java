package Matrices;

import java.util.Scanner;

public class ejer24 {
    /*Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados
“Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por
teclado y luego el programa mostrará la nota mínima, máxima y media de cada
alumno*/
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int media,suma=0, mayor=0, menor=11, alumno=1;

        int[][] matriz=new int[4][5];

        for(int i=0;i< matriz.length;i++){
            System.out.println("introduce las notas del alumno "+ (i+1) + ": ");

            for (int j=0;j<matriz[i].length;j++){
                System.out.print("notas: ");
                int notas= entrada.nextInt();
                matriz[i][j]=notas;
            }
        }

        for (int[] mostrar1 : matriz) {

            for (int mostrar2 : mostrar1) {
                if (mostrar2>mayor) {
                    mayor = mostrar2;
                }
                if (mostrar2<menor) {
                    menor = mostrar2;
                }

                suma=suma+mostrar2;
            }

            media=suma/ 5;
            System.out.printf("%n-------------------------"+
                    "%nAlumno "+(alumno++)+
                    "%nNota mayor: "+mayor+
                    "%nNota menor: "+menor+
                    "%nMedia: "+media);
            suma=0;
        }



    }
}

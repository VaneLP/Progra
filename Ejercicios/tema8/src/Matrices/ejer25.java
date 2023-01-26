package Matrices;

import java.util.Scanner;

public class ejer25 {
    /*Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por
teclado la información de N personas distintas (valor también introducido por teclado).
Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta
información debe guardarse en una única matriz. Luego se mostrará por pantalla el
sueldo medio de cada género*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mujeres=0, hombres=0;

        System.out.println("¿Cuantos empleados deseas regitrar?");
        int n= entrada.nextInt();

        int[][] matriz= new int[n][n];

        for(int i=0;i< matriz.length;i++){
            System.out.println("Si es hombre intruzca 0 y si es mujer introduzca 1");
            int sexo= entrada.nextInt();
            if(sexo==0){
                hombres++;
            } else if (sexo==1) {
                mujeres++;
            }

            for (int j=0;j<matriz[i].length;j++){
                System.out.print("introduce el sueldo del empleado: ");
                int sueldo= entrada.nextInt();
                matriz[i][j]=sueldo;
            }
        }



    }
}

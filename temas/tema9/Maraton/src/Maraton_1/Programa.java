package Maraton_1;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Triangulo t1= new Triangulo();

        System.out.println("dime el ancho");
        int anch = entrada.nextInt();
        t1.ancho=anch;

        System.out.println("dime el alto");
        int alt = entrada.nextInt();
        t1.alto=alt;

        System.out.println("dime como es tu triangulo");
        String esti = entrada.next();
        t1.estilo=esti;

        System.out.println("----------------------");

        t1.verDim();
        System.out.println("");
        t1.verEstilo();
        System.out.println("Area: "+t1.area());

    }
}

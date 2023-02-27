package Maraton_6;

import java.util.Scanner;

public class Programa_v6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Triangulo_v6 t1= new Triangulo_v6();
        Triangulo_v6 t2= new Triangulo_v6(8);

//        System.out.println("dime el ancho");
//        int anch = entrada.nextInt();
//        t1.setAncho(anch);
//
//        System.out.println("dime el alto");
//        int alt = entrada.nextInt();
//        t1.setAlto(alt);
//
//        System.out.println("dime como es tu triangulo");
//        String esti = entrada.next();
//        t1.setEstilo(esti);

        System.out.println("---------- Triangulo 1 ------------");

        t1.verDim();
        System.out.println("");
        t1.verEstilo();
        System.out.println("Area: "+t1.area());

//        System.out.println("---------- Triangulo 2 ------------");
//
//        t2.verDim();
//        System.out.println("");
//        t2.verEstilo();
//        System.out.println("Area: "+t2.area());

    }
}

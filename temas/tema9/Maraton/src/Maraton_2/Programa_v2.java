package Maraton_2;

import java.util.Scanner;

public class Programa_v2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Triangulo_v2 t1= new Triangulo_v2();

        System.out.println("dime el ancho");
        int anch = entrada.nextInt();
        t1.setAncho(anch);

        System.out.println("dime el alto");
        int alt = entrada.nextInt();
        t1.setAlto(alt);

        System.out.println("dime como es tu triangulo");
        String esti = entrada.next();
        t1.setEstilo(esti);

        System.out.println("----------------------");

        t1.verDim();
        System.out.println("");
        t1.verEstilo();
        System.out.println("Area: "+t1.area());

    }
}

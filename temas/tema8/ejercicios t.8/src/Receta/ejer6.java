package Receta;

import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.println("¿Cual es el nombre de tu receta?");
        String nombre = entrada.next();
        System.out.println("¿Que tipo de elaboracion lleva?");
        String elaboracion= entrada.next();
        System.out.println("¿Cual es su duracion?");
        int duracion = entrada.nextInt();
        Receta r1= new Receta(nombre,elaboracion,duracion);

        System.out.println("¿Cuantos ingredientes tiene tu receta?");
        int ingreTotal = entrada.nextInt();

        for (int i=1;i<=ingreTotal;i++){
            System.out.println("¿Cual es el nombre del ingrediente?");
            String nombreIngre = entrada.next();
            System.out.println("¿Cual es la cantidad?");
            int cantidadIngre = entrada.nextInt();
            System.out.println("¿En que unidad esta (gr/kl/L/...)?");
            String unidadIngre =entrada.next();
            r1.anyadirIngre(nombreIngre,cantidadIngre,unidadIngre);
        }

        System.out.println(r1);

    }
}

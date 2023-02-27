package ejer7;

import java.util.ArrayList;
import java.util.Scanner;

public class Progrma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Gato> listaGato = new ArrayList<>();
        int edad=0;
        String nombre=null;

        for (int i=0;i<5;i++){
            System.out.println("Intruduce el nombre del gato");
            try {
                nombre = entrada.nextLine();
            }catch (Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

            System.out.println("Intruduce la edad del gato");
            try {
                edad = Integer.parseInt(entrada.nextLine());
            }catch (Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

            try {
                Gato g1 = new Gato(nombre, edad);
                listaGato.add(g1);
            }catch (Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

        }

        for (Gato gato : listaGato) {
            System.out.println(gato);
        }

    }
}

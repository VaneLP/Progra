package e_1_astros;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Astros> lista = new ArrayList<>();
        int num;

        do {
            System.out.printf("\nMenu" +
                    "\n---------" +
                    "\n1. Añadir planeta" +
                    "\n2. Añadir satelite" +
                    "\n3. Mostrar" +
                    "\n4. Salir" +
                    "\n-----------" +
                    "\nOpcion: ");

            num = entrada.nextInt();
            System.out.println("-----------");

            switch (num){
                case 1:
                    System.out.printf("\n1. Añadir planeta"+
                            "\n--------------");

                    Astros p=new Planetas(50,20.5,120,15.5,0,500,80,true);

                    lista.add(p);
                    break;

                case 2:
                    System.out.printf("\n2. Añadir Satelite"+
                            "\n--------------");

                    Astros s=new Satelites(50,80,70,200,0,23,80,"marte");

                    lista.add(s);
                    break;

                case 3:
                    System.out.printf("\n3. Mostrar"+
                                    "\n--------------");

                    for (Astros astro : lista) {
                        astro.muestra();
                    }

                    break;

                case 4:
                    System.out.printf("\n4. Salir"+
                                    "\n------------"+
                                    "\nSaliendo....");
                    break;
            }

        } while (num != 4);
    }

}

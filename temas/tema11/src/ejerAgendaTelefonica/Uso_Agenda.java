package ejerAgendaTelefonica;

import java.util.Scanner;

public class Uso_Agenda {
    public static void main(String[] args) {

    }

    //creamos un menu
    public static void menu(){
        Scanner entrada=new Scanner(System.in);
        int opcion=0;

        do {
            System.out.printf("\nMenu"+
                    "\n1. Mostrar Agenda"+
                    "\n2. Añadir entrada"+
                    "\n3. Buscar por nombre"+
                    "\n4. Buscar por numero"+
                    "\n5. Borrar por nombre"+
                    "\n6. Borrar por numero"+
                    "\n7. Ordenar por nombre"+
                    "\n0. Salir"+
                    "\nOpcion:");

            opcion= entrada.nextInt();
            System.out.println("-------------");

            switch (opcion){
                case 1:
                    System.out.printf("1. Mostrar Agenda");

                    break;

                case 2:
                    System.out.printf("2. Añadir entrada");

                    break;

                case 3:
                    System.out.println("3. Buscar por nombre");


                    break;

                case 4:
                    System.out.println("4. Buscar por numero");

                    break;

                case 5:
                    System.out.println("5. Borrar por nombre");

                    break;

                case 6:
                    System.out.println("6. Borrar por numero");

                    break;

                case 7:
                    System.out.println("7. Ordenar por nombre");

                    break;

                case 0:
                    System.out.printf("0. Saliendo"+
                            "\nSaliendo...");
                    break;
            }

        }while(opcion!=0);
    }

}

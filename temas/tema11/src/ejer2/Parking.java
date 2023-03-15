package ejer2;

import java.util.LinkedList;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        menu();
    }
    static LinkedList<String> listaMatriculas = new LinkedList<>();

    public static void menu(){
        Scanner entrada=new Scanner(System.in);
        int opcion=0;

        do {
            System.out.printf("\nMenu"+
                                "\n1. Aparcar"+
                                "\n2. Desaparcar"+
                                "\n3. Mostrar lista de las matriculas"+
                                "\n4. Salir"+
                                "\nOpcion:");

            opcion= entrada.nextInt();
            System.out.println("-------------");

            switch (opcion){
                case 1:
                    System.out.printf("1. Aparcar"+
                            "\nDime la matricula del coche que quieras aparcar:");
                    String matricula= entrada.next();

                    aparcar(matricula);
                    break;

                case 2:
                    System.out.println("2. Desaparcar");
                    desarparcar();

                    break;

                case 3:
                    System.out.println("3. Mostrar lista de matriculas");
                    mostrarListaMatriculas();

                    break;

                case 4:
                    System.out.printf("4. Saliendo"+
                            "\nSaliendo...");
                    break;
            }

        }while(opcion!=4);
    }

    public static void aparcar(String matricula){
        if(listaMatriculas.size()<=10) {
            listaMatriculas.push(matricula);
        }
        else {
            System.out.println("EL parking esta lleno");
        }
    }

    public static void desarparcar(){
        if(listaMatriculas.size()!=0) {
            System.out.println(listaMatriculas.pop());
            //para mostrar unicamente podiamos usar pekk()
        }
        else{
            System.out.println("Parking vacio");
        }
    }

    public static void mostrarListaMatriculas(){
        for (String listaMatricula : listaMatriculas) {
            System.out.println(listaMatricula);
        }
    }

}

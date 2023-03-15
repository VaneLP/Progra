package ejer1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        LinkedList<String> listaMatriculas = new LinkedList<>();
//
//        if(listaMatriculas.size()<=10){
//            listaMatriculas.add("1111ABC");
//            listaMatriculas.add("2222ABC");
//            listaMatriculas.add("3333ABC");
//            listaMatriculas.add("4444ABC");
//            listaMatriculas.add("5555ABC");
//            listaMatriculas.add("6666ABC");
//            listaMatriculas.add("7777ABC");
//            listaMatriculas.add("8888ABC");
//            listaMatriculas.add("9999ABC");
//            listaMatriculas.add("1010ABC");
//        }




    }
    public void menu(){
        Scanner entrada=new Scanner(System.in);
        int opcion=0;

        do {
            System.out.printf("Menu"+
                                "1. Aparcar"+
                                "2. Desaparcar"+
                                "3. Mostrar lista de las matriculas"+
                                "4. Salir"+
                                "Opcion:");

            opcion= entrada.nextInt();
            System.out.println("-------------");

            switch (opcion){
                case 1:
                    System.out.printf("1. Aparcar"+
                            "Dime la matricula del coche que quieras aparcar");
                    String matricula= entrada.next();

                    aparcar(matricula);
                    break;

                case 2:
                    System.out.printf("2. Desaparcar");
                    break;

                case 3:
                    System.out.printf("3. Mostrar lista de matriculas");
                    break;

                case 4:
                    System.out.printf("4. Saliendo"+
                            "Saliendo...");
                    break;
            }

        }while(opcion!=4);
    }

    public void aparcar(String matricula){
        LinkedList<String> listaMatriculas = new LinkedList<>();

        if(listaMatriculas.size()<=10) {
            listaMatriculas.add(matricula);
        }

    }

    public String desarparcar(String matricula){

        return "";
    }

    public void mostrarListaMatriculas(){

    }

}

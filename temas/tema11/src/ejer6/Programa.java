package ejer6;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Programa {
    public static void main(String[] args) {


    }
    //creamos el HashMap
    static HashMap<String, Double> plantillaJugadores = new HashMap<>();

    //creamos un menu
    public static void menu(){
        Scanner entrada=new Scanner(System.in);
        int opcion=0;

        do {
            System.out.printf("\nMenu"+
                    "\n1. Añadir jugador"+
                    "\n2. Eliminar jugador"+
                    "\n3. Consultar salario"+
                    "\n4. Incrementar salario"+
                    "\n5. Salir"+
                    "\nOpcion:");

            opcion= entrada.nextInt();
            System.out.println("-------------");

            switch (opcion){
                case 1:
                    System.out.printf("1. Añadir jugador"+
                                    "\nDime el nombre del jugador");
                    String nombre= entrada.next();

                    System.out.println("Dime el salario del jugador");
                    double salario= entrada.nextDouble();

                    anyadirJugador(nombre,salario);
                    break;

                case 2:
                    System.out.printf("2. Eliminar jugador"+
                                        "\nDime el nombre del jugador que deseas eliminar");
                    nombre= entrada.next();

                    eliminarJugador(nombre);
                    break;

                case 3:
                    System.out.println("3. Consultar salario");

                    consultarSalario();
                    break;

                case 4:
                    System.out.println("4. Incrementar salario"+
                            "\nDime el nombre del jugador que deseas incrementar el sueldo");
                    nombre= entrada.next();

                    incrementarSalario(nombre);
                    break;
                case 5:
                    System.out.printf("5. Saliendo"+
                            "\nSaliendo...");
                    break;
            }

        }while(opcion!=4);
    }

    public static void anyadirJugador(String nombre, double salario){
        plantillaJugadores.put(nombre,salario);
    }

    public static void eliminarJugador(String nombre){
        plantillaJugadores.remove(nombre);
    }

    public static void consultarSalario(){
        for (String s : plantillaJugadores.keySet()) {
            System.out.println("El jugador "+s+" tiene un salario de: "+plantillaJugadores.get(s));
        }
    }

    public static void incrementarSalario(String nombre){
        plantillaJugadores.put(nombre, plantillaJugadores.get(nombre)*1.10);
    }

}

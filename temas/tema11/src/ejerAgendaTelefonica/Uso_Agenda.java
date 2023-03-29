package ejerAgendaTelefonica;

import java.util.*;

public class Uso_Agenda {
    public static void main(String[] args) {
        menu();
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
                    System.out.println("1. Mostrar Agenda");

                    mostrarAgenda();
                    break;

                case 2:
                    System.out.printf("2. Añadir entrada"+
                                    "\nDime el nombre:");
                    String nombre= entrada.next();

                    System.out.println("Dime el numero de telefono");
                    String telefono= entrada.next();

                    anyadirEntrada(nombre,telefono);

                    break;

                case 3:
                    System.out.printf("3. Buscar por nombre"+
                                        "\nDime el nombre:");
                    nombre=entrada.next();

                    buscarNombre(nombre);
                    break;

                case 4:
                    System.out.printf("4. Buscar por numero"+
                                        "\nDime el numero:");
                    telefono=entrada.next();

                    buscarNumero(telefono);
                    break;

                case 5:
                    System.out.printf("5. Borrar por nombre"+
                                        "\nDime el nombre:");
                    nombre=entrada.next();

                    borrarNombre(nombre);
                    break;

                case 6:
                    System.out.printf("6. Borrar por numero"+
                                        "\nDime el numero:");
                    telefono=entrada.next();

                    borrarNumero(telefono);
                    break;

                case 7:
                    System.out.println("7. Ordenar por nombre");

                    ordenarNombre();
                    break;

                case 0:
                    System.out.printf("0. Saliendo"+
                            "\nSaliendo...");
                    break;
            }

        }while(opcion!=0);
    }

    /**
     * Mostrará todos las entradas de la agenda o "La agenda está vacía"
     * si no tiene
     */
    public static void mostrarAgenda(){
        if(Agenda.listaAgenda.isEmpty())
            System.out.println("La agenda esta vacia");
        else
            System.out.println(Agenda.listaAgenda);
    }

    /**
     * Pedirá el nombre y el teléfono para añadir esos datos en la agenda
     */
    public static void anyadirEntrada(String nombre, String telefono){
        Agenda.listaAgenda.add(new Registro(nombre,telefono));
    }

    /**
     * Pedirá que se introduzca un nombre y mostrará todas las entradas
     * de la agenda que contengan ese nombre
     */
    public static void buscarNombre(String nombre){
        for (Registro r : Agenda.listaAgenda) {
            if(r.getNombre().contains(nombre))
                System.out.println(r);
        }
    }

    /**
     * Pedirá que se introduzca un teléfono y mostrará todas las entradas
     * de la agenda que contengan ese número
     */
    public static void buscarNumero(String telefono){
        for (Registro r : Agenda.listaAgenda) {
            if(r.getTelefono().contains(telefono))
                System.out.println(r);
        }
    }

    /**
     * Pedirá que se introduzca un nombre y borrará todas las entradas
     * de la agenda que contengan ese nombre
     */
    public static void borrarNombre(String nombre){
        Iterator<Registro> iter= (Agenda.listaAgenda).iterator();

        while (iter.hasNext()){
            if(iter.next().getNombre().contains(nombre))
                iter.remove();
        }
    }

    /**
     * Pedirá que se introduzca un teléfono y borrará todas las entradas
     * de la agenda que contengan ese teléfono
     */
    public static void borrarNumero(String telefono){
        Iterator<Registro> iter= (Agenda.listaAgenda).iterator();

        while (iter.hasNext()){
            if(iter.next().getTelefono().contains(telefono))
                iter.remove();
        }
    }

    /**
     * Mostrará todas las entradas de la agenda (o "La agenda está vacía")
     * ordenados por nombre ascendente
     */
    public static void ordenarNombre(){
        if(Agenda.listaAgenda.isEmpty())
            System.out.println("La agenda esta vacia");
        else {
            Collections.sort(Agenda.listaAgenda);
            System.out.println(Agenda.listaAgenda);
        }
    }

}

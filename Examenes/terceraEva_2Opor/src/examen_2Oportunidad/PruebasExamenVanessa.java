package examen_2Oportunidad;

import java.util.Scanner;

public class PruebasExamenVanessa {
    public static void main(String[] args) {
        //inplementar funciones del examen

        //palindromo
        System.out.println("Es palindroma: "+esPalindromo("luz azul"));
        //menu
//        miMenu();

        //obligatorias
        //crear un objeto para gestionar productos
        GestionProductos gestion = new GestionProductos();

        //añadir 2 electrodomesticos
        gestion.agregarProductos("lavadora",250,Consumos.A);
        gestion.agregarProductos("frigorifico",500,Consumos.D);

        //añadir 2 videojuegos
        gestion.agregarProductos("The Legend Of Zelda",60,18);
        gestion.agregarProductos("Animal Crossing",70,7);

        //añadir 1 producto cualquiera con precio neg
        try {
            gestion.agregarProductos("Producto neg", -500, 5);
        }catch (Exception e){
            e.getMessage();
        }

        //buscar producto que se encuentre en la lista y mostrar datos, gestionar si no se encuentra
        try {
            System.out.println("buscar producto");
            System.out.println(gestion.buscarProducto("The Legend Of Zelda").toString());

        } catch (Exception e) {
            e.getMessage();
        }

        //usar metodo mostrar los videojuegos ordenados por precio
        System.out.println("lista videojuegos");
        System.out.println(gestion.listaViedeoJuegos());

        //usr metodo mostrarListado
        System.out.println("mostrar lista");
        gestion.mostrarLista();

    }


    //funciones
    /**
     * mostrara un menu
     */
    public static void miMenu(){
        //variables
        Scanner entrada = new Scanner(System.in);
        int respuesta;

        //do-while que termine cuando sea 0
        do {
            System.out.println("""
                    1. Aprobar con nota
                    2. Aprobar raspado
                    3. Joselito
                    4. Suspender
                    0. Continuar
                    """);
            System.out.print("Opcion: ");
            respuesta = entrada.nextInt();

            //switch para mostrar la opcion
            switch (respuesta){
                case 1:
                    System.out.println("Aprobar con nota");
                    break;

                case 2:
                    System.out.println("Aprobar raspado");
                    break;

                case 3:
                    System.out.println("Joselito");
                    break;

                case 4:
                    System.out.println("Suspender");
                    break;

                case 0:
                    System.out.println("Continuar");
                    break;

                //case default: no soportado por java 17
            }

            //si no es ninguno mensaje de error
            if(respuesta !=1 && respuesta !=2 && respuesta!=3 && respuesta!=4 && respuesta!=0)
                System.err.println("Opcion no valida");

        }while(respuesta!=0);


    }

    /**
     * comprueba si una cadena es palidroma
     * @param txt se le pasa una cadena de txt
     * @return true o false
     */
    public static boolean esPalindromo(String txt){
        StringBuilder nuevaCadena= new StringBuilder(txt);

        //recorremos la cadena
        for(int i=0;i<nuevaCadena.length();i++){
            //comprobamos si hay un espacio
            if(nuevaCadena.charAt(i) == ' ')
                //si lo hay lo borramos
                nuevaCadena.deleteCharAt(i);
        }

        String cadenaSinEspacio =nuevaCadena.toString();

        //devolvemos si es palindroma o no
        return cadenaSinEspacio.equalsIgnoreCase(nuevaCadena.reverse().toString());
    }


}

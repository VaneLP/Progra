package SegundaParte_6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Introducir por teclado el precio de las horas extraordinarias, común a todos los trabajadores.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Precio de las horas extra: ");
        Trabajador.setImporteHoraEx(entrada.nextDouble());



        //Crear un objeto t1 de la clase Trabajador y pedir los datos llamando al método leerTrabajador de la clase Trabajador.
        Trabajador t1= new Trabajador();
        t1.leerTrabajador();



        /*Crear un objeto t2 de la clase Trabajador y pedir los datos llamando a un método estático que tenemos que crear
        en la clase Principal y que se llama leerTrabajador al que se le pasa el objeto trabajador
        (utilizar mismo formato de petición de datos).*/
        Trabajador t2=new Trabajador();
        leerTrabajador(t2);



        /*Siguiendo en el main, pedir por teclado los datos de un nuevo trabajador utilizando el mismo formato de introducción
        de datos y construyendo un objeto t3 con el segundo constructor.*/
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("DNI: ");
        String dni = entrada.nextLine();

        System.out.print("Sueldo base: ");
        double sueldoBase = entrada.nextDouble();

        System.out.print("Horas extra: ");
        int horasEx = entrada.nextInt();

        System.out.print("Tipo IRPF: ");
        double irpf = entrada.nextDouble();

        Trabajador t3 = new Trabajador(dni,nombre,sueldoBase,horasEx,irpf);




        //Imprimir el número de trabajadores.
        System.out.println("Numero de trabajadores: "+Trabajador.getnTrabajadores());




        //Imprimir las nóminas de los tres trabajadores introducidos.
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

    }

    /*Crear un objeto t2 de la clase Trabajador y pedir los datos llamando a un método estático que tenemos que crear
    en la clase Principal y que se llama leerTrabajador al que se le pasa el objeto trabajador
    (utilizar mismo formato de petición de datos).*/
    public static void leerTrabajador(Trabajador t){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        t.setNombre(entrada.nextLine());

        System.out.print("DNI: ");
        t.setDni(entrada.nextLine());

        System.out.print("Sueldo base: ");
        t.setSueldoBase(entrada.nextDouble());

        System.out.print("Horas extra: ");
        t.setHorasEx(entrada.nextInt());

        System.out.print("Tipo IRPF: ");
        t.setIrpf(entrada.nextDouble());

        System.out.println("-------------------------");
    }

}

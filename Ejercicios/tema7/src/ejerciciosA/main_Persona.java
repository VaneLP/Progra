package ejerciciosA;

import java.util.Scanner;
/*
En el main de la clase principal instancia dos objetos de la clase Persona. Luego, pide por
teclado los datos de ambas personas (guárdalos en los objetos). Por último, imprime dos
mensajes por pantalla (uno por objeto) con un mensaje del estilo “Azucena Luján García
con DNI … es / no es mayor de edad”.
 */
public class main_Persona {
    public static void main(String[] args) {
        //variables
        Persona persona1= new Persona();
        Persona persona2= new Persona();
        Scanner entrada= new Scanner(System.in);
        String dni, nombre, apellido;
        int edad;

        //----------------------------------------------------
        //pedir datos
        System.out.println("Introduce el nombre de la persona");
        nombre= entrada.nextLine();
        persona1.nombre=nombre;

        System.out.println("Introduce el apellido de la persona");
        apellido= entrada.nextLine();
        persona1.apellidos=apellido;

        System.out.println("Introduce el DNI de la persona");
        dni= entrada.nextLine();
        persona1.dni=dni;

        System.out.println("Introduce el edad de la persona");
        persona1.edad=Integer.parseInt(entrada.nextLine());

        //mostrar datos y decimos si mayor de edad o no
        System.out.println(persona1.nombre+" "+persona1.apellidos+" con DNI: "+persona1.dni+ ((persona1.edad<18)?" no":"")+" es mayor de edad");

        //----------------------------------------------------
        //pedir datos
        System.out.println("Introduce el nombre de la persona");
        nombre= entrada.nextLine();
        persona2.nombre=nombre;

        System.out.println("Introduce el apellido de la persona");
        apellido= entrada.nextLine();
        persona2.apellidos=apellido;

        System.out.println("Introduce el DNI de la persona");
        dni= entrada.nextLine();
        persona2.dni=dni;

        System.out.println("Introduce el edad de la persona");
        persona2.edad=Integer.parseInt(entrada.nextLine());

        //mostrar datos y decimos si mayor de edad o no
        System.out.println(persona2.nombre+" "+persona2.apellidos+" con DNI: "+persona2.dni+ ((persona2.edad<18)?" no":"")+" es mayor de edad");
    }
}

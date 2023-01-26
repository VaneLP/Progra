package ejerciciosC;

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
        Scanner entrada= new Scanner(System.in);
        String dni, nombre, apellido;
        int edad;

        //----------------------------------------------------
        //pedir datos
        System.out.println("Introduce el nombre de la persona");
        nombre= entrada.nextLine();

        System.out.println("Introduce el apellido de la persona");
        apellido= entrada.nextLine();

        System.out.println("Introduce el DNI de la persona");
        dni= entrada.nextLine();

        System.out.println("Introduce el edad de la persona");
        edad=Integer.parseInt(entrada.nextLine());

        Persona persona1= new Persona(nombre,apellido,dni,edad);

        //----------------------------------------------------
        //pedir datos
        Persona persona2= new Persona(nombre,apellido,dni,edad);

        System.out.println("Introduce el nombre de la persona");
        persona2.setNombre(nombre= entrada.nextLine());

        System.out.println("Introduce el apellido de la persona");
        persona2.setApellidos(apellido= entrada.nextLine());

        System.out.println("Introduce el DNI de la persona");
        persona2.setDni(dni= entrada.nextLine());

        System.out.println("Introduce el edad de la persona");
        persona2.setEdad(edad=Integer.parseInt(entrada.nextLine()));


        //mostrar datos y decimos si mayor de edad o no
        System.out.println(persona1.getNombre()+" "+persona1.getApellidos()+" con DNI: "+persona1.getDni()+ ((persona1.getEdad()<18)?" no":"")+" es mayor de edad");
        System.out.println(persona2.getNombre()+" "+persona2.getApellidos()+" con DNI: "+persona2.getDni()+ ((persona2.getEdad()<18)?" no":"")+" es mayor de edad");
    }
}

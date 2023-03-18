package ejer3;

import java.time.LocalDate;
import java.util.HashSet;

public class Programa {
    public static void main(String[] args) {
        //creamos el HashSet
        HashSet<Persona> listaPersonas = new HashSet<>();

        //creamos personas
        Persona p1 = new Persona("Maria","maria@gmail.com", LocalDate.of(1996,7,25),123456789);
        Persona p2 = new Persona("Pepe","pepe@gmail.com",LocalDate.of(2020,12,1),123456789);
        Persona p3 = new Persona("Jose","jose@gmail.com",LocalDate.of(2022,2,14),123456789);
        Persona p4 = new Persona("Josefa","josefa@gmail.com",LocalDate.of(1994,3,30),123456789);
        Persona p5 = new Persona("Josefa","josefa@gmail.com",LocalDate.of(1994,3,30),123456789);

        //añadimos las personas al HashSet
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);
        listaPersonas.add(p4);
        listaPersonas.add(p5);

        //mostramos la lista
        System.out.println(listaPersonas);

        //media de los años
        long suma=0;

        for (Persona listaPersona : listaPersonas) {
            suma = suma + listaPersona.getEdad();
        }

        long media = suma/listaPersonas.size();

        System.out.println("La media de edades es de:" + media);

        //y el nombre del mayor
        long edadMayor=0;
        String nombreMayor= "";

        for (Persona listaPersona : listaPersonas) {
            if(listaPersona.getEdad()>edadMayor){
                edadMayor=listaPersona.getEdad();
                nombreMayor= listaPersona.getNombre();
            }
        }

        System.out.println("El nombre de la perona mayor es:"+nombreMayor);

        /*
        R1 = si una persona esta repetida no se añade a la lista
        R2 = Si tiene un orden, se ordenan por la fecha de nacimiento, aun que no deberian ya que los
        HashSet no tienen una ordenacion
        */
    }
}

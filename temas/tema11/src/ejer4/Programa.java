package ejer4;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Programa {
    public static void main(String[] args) {
        //creamos el HashSet
        LinkedHashSet<Persona> listaPersonas = new LinkedHashSet<>();

        //creamos personas
        Persona p1 = new Persona("Maria","maria@gmail.com", LocalDate.of(1996,07,25),123456789);
        Persona p2 = new Persona("Pepe","pepe@gmail.com",LocalDate.of(2020,12,01),123456789);
        Persona p3 = new Persona("Jose","jose@gmail.com",LocalDate.of(2022,02,14),123456789);
        Persona p4 = new Persona("Josefa","josefa@gmail.com",LocalDate.of(1994,03,30),123456789);
        Persona p5 = new Persona("Josefa","josefa@gmail.com",LocalDate.of(1994,03,30),123456789);

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
        R = Se ordenan segun como hemos ido añadiendo los elementos
        */
    }
}

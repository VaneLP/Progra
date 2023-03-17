package ejer3;

import java.time.LocalDate;
import java.util.HashSet;

public class Programa {
    public static void main(String[] args) {
        //creamos el HashSer
        HashSet<Persona> listaPersonas = new HashSet<>();

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

        //media de los años
        long suma=0;
        for (Persona listaPersona : listaPersonas) {
            suma = suma + listaPersona.getEdad();
        }

        long media = suma/listaPersonas.size();

        System.out.println(media);

        //y el nombre del mayor
        Persona mayor= new Persona();
        mayor.getEdad();

        for (Persona listaPersona : listaPersonas) {
            if(listaPersona.getEdad()>mayor.getEdad())
                mayor=listaPersona;
        }

        System.out.println(mayor.getNombre());
    }
}

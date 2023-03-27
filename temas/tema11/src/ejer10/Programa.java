package ejer10;

import java.time.LocalDate;
import java.util.TreeSet;

public class Programa {
    public static void main(String[] args) {
        //creamos el treeset
        TreeSet<Persona_v3> listaPersonas = new TreeSet<>();

        //creamos personas
        Persona_v3 p1 = new Persona_v3("Maria","maria@gmail.com", LocalDate.of(1996,07,25),123456789);
        Persona_v3 p2 = new Persona_v3("Pepe","pepe@gmail.com",LocalDate.of(2020,12,01),123456789);
        Persona_v3 p3 = new Persona_v3("Jose","jose@gmail.com",LocalDate.of(2022,02,14),123456789);
        Persona_v3 p4 = new Persona_v3("Josefa","josefa@gmail.com",LocalDate.of(1994,03,30),123456789);
        Persona_v3 p5 = new Persona_v3("Josefa","josefa@gmail.com",LocalDate.of(1994,03,30),123456789);

        //añadimos las personas al HashSet
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);
        listaPersonas.add(p4);
        listaPersonas.add(p5);

        for (Persona_v3 listaPersona : listaPersonas) {
            System.out.println(listaPersona);
        }

        //mostramos la lista
//        System.out.println(listaPersonas);

        /*
        * R1= sale un aviso de que no es compareble y por tanto no se ordena
        * r2= Si eliminamos el hashcode y el equals no funcionara igualmente, hay que añadirle el compareTo()
        */

    }
}

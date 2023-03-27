package ejer12;

import java.time.LocalDate;
import java.util.*;

public class Programa {
    public static void main(String[] args) {
        //creamos una arraylist
        ArrayList<Persona_v3> listaPersonas = new ArrayList<>();

        //creamos personas
        Persona_v3 p1 = new Persona_v3("Maria","maria@gmail.com", LocalDate.of(1996,07,25),123456789);
        Persona_v3 p2 = new Persona_v3("Pepe","pepe@gmail.com",LocalDate.of(2020,12,01),123456789);
        Persona_v3 p3 = new Persona_v3("Jose","jose@gmail.com",LocalDate.of(2022,02,14),123456789);
        Persona_v3 p4 = new Persona_v3("Josefa","josefa@gmail.com",LocalDate.of(1994,03,30),123456789);
        Persona_v3 p5 = new Persona_v3("Josefa","vjosefa@gmail.com",LocalDate.of(1994,03,30),123456789);

        //añadimos las personas al HashSet
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);
        listaPersonas.add(p4);
        listaPersonas.add(p5);

        //Las ordenados
        Collections.sort(listaPersonas);

        //mostramos la lista por nombre
//        System.out.println(listaPersonas);
//
//        System.out.println("-------------------");

        //mostramos la lista por email
        Collections.sort(listaPersonas, new CompararEmail());
        System.out.println(listaPersonas);

//        listaPersonas.sort(new CompararEmail());
//        System.out.println(listaPersonas);
//
//        listaPersonas.sort(new Comparator<Persona_v3>() {
//            @Override
//            public int compare(Persona_v3 o1, Persona_v3 o2) {
//                return o1.telefono- o2.telefono;
//            }
//        });



        System.out.println("-------------------------");

        Set conjunto = new LinkedHashSet(listaPersonas);
        System.out.println(conjunto);

    }
}

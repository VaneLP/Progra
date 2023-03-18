package ejer5;

import java.time.LocalDate;
import java.util.LinkedHashSet;

public class Programa {
    public static void main(String[] args) {
        //creamos el HashSet
        LinkedHashSet<Persona_v2> listaPersonas = new LinkedHashSet<>();

        //creamos personas
        Persona_v2 p1 = new Persona_v2("Maria","maria@gmail.com", LocalDate.of(1996,07,25),123456789);
        Persona_v2 p2 = new Persona_v2("Pepe","pepe@gmail.com",LocalDate.of(2020,12,01),123456789);
        Persona_v2 p3 = new Persona_v2("Jose","jose@gmail.com",LocalDate.of(2022,02,14),123456789);
        Persona_v2 p4 = new Persona_v2("Josefa","josefa@gmail.com",LocalDate.of(1994,03,30),123456789);
        Persona_v2 p5 = new Persona_v2("Josefa","josefa@gmail.com",LocalDate.of(1994,03,30),123456789);

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

        for (Persona_v2 listaPersona : listaPersonas) {
            suma = suma + listaPersona.getEdad();
        }

        long media = suma/listaPersonas.size();

        System.out.println("La media de edades es de:" + media);

        //y el nombre del mayor
        long edadMayor=0;
        String nombreMayor= "";

        for (Persona_v2 listaPersona : listaPersonas) {
            if(listaPersona.getEdad()>edadMayor){
                edadMayor=listaPersona.getEdad();
                nombreMayor= listaPersona.getNombre();
            }
        }

        System.out.println("El nombre de la perona mayor es:"+nombreMayor);

    }
}

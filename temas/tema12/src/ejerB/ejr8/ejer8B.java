
package ejerB.ejr8;

import utilidades.Persona;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class ejer8B {
    public static void main(String[] args) {
        File f = new File("temas\\tema12\\DOCS\\datos_personas.csv");

        Map<String, Persona> mapaPersonas = new HashMap<>();

        try(Scanner lectura= new Scanner(f);
            PrintWriter pw = new PrintWriter("temas\\tema12\\DOCS\\datos_jubilados.csv")){

            while (lectura.hasNextLine()){
                String seperacion=lectura.nextLine();

                String[] partes=seperacion.split(";");

                mapaPersonas.put(partes[0],new Persona(partes[0],partes[1],partes[2],Integer.parseInt(partes[3])));

            }

            String dni;

            do {
                System.out.println("Dime un DNI para ver si esta");
                Scanner entrada = new Scanner(System.in);
                dni= entrada.nextLine();

                if (mapaPersonas.containsKey(dni)){
                    for (String s : mapaPersonas.keySet()) {
                        if(s.equals(dni)) {
                           mapaPersonas.get(s).imprime();

                        }
                    }}

                else
                    System.out.println("No se encuentra");
            }while(!dni.equalsIgnoreCase("Salir"));

            ArrayList<Map.Entry<String,Persona>> lista = new ArrayList<>(mapaPersonas.entrySet());
            lista.sort(new Comparator<Map.Entry<String, Persona>>() {
                @Override
                public int compare(Map.Entry<String, Persona> p1, Map.Entry<String, Persona> p2) {
                    return p1.getKey().compareTo(p2.getKey());
                }
            });

            for (Map.Entry<String, Persona> p : lista) {
                Persona personita=p.getValue();
                if(personita.esJubilado())
                    pw.println(personita.getDni()+";"+personita.getNombre()+";"+personita.getApellidos()+";"+personita.getEdad());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

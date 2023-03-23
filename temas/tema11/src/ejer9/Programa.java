package ejer9;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

public class Programa {
    public static void main(String[] args) {
        //se le introduce un año
        Scanner entrada= new Scanner(System.in);

        System.out.println("Introduce un año");
        int anyo = entrada.nextInt();

        //creamos variable para temperaturas
        int[] temperaturas = new int[365];

            //la llenamos con temp
            for (int i=0;i<temperaturas.length;i++){
                int numAle = ThreadLocalRandom.current().nextInt(10,30+1);

                temperaturas[i]=numAle;
            }

        //almacenar en un mapa tº, DIAS del año que hubo esa tº
        TreeMap<Integer,Integer> listaTemp = new TreeMap<>();
        //k= tº, v=dias

        //hacemos un iter para añadir todas las temp y si no tienen un valor lo creamos
        for (int temp : temperaturas) {
            if(listaTemp.containsKey(temp))
                listaTemp.put(temp,listaTemp.get(temp)+1);
            else
                listaTemp.put(temp,0);
        }

        //mostrarlo
        for (Integer temp : listaTemp.keySet()) {
            if(temp==10 || temp==30)
                System.out.println("La temperatura "+temp+ " se repite " + listaTemp.get(temp));
        }
    }
}

package ejer13;

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
        int[] temperaturas;

        //generar un array con tº medias (int 10-30) de una ciudad para todos los dias (356 o 366) de ese año
        //comprobamos si es bisiesto o no
        if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))) {
            temperaturas = new int[366];

            for (int i=0;i<temperaturas.length;i++){
                int numAle = ThreadLocalRandom.current().nextInt(10,30+1);

                temperaturas[i]=numAle;
            }
        }
        else {
            temperaturas = new int[365];

            for (int i=0;i<temperaturas.length;i++){
                int numAle = ThreadLocalRandom.current().nextInt(10,30+1);

                temperaturas[i]=numAle;
            }
        }

        //almacenar en un mapa tº, DIAS del año que hubo esa tº
        TreeMap<Integer,Integer> listaTemp = new TreeMap<>();
        //k= tº, v=dias

        //hacemos un foreach para añadir todas las temp y si no tienen un valor lo creamos
        for (int temp : temperaturas) {
            if(listaTemp.containsKey(temp))
                listaTemp.put(temp,listaTemp.get(temp)+1);
            else
                listaTemp.put(temp,1);
        }

        //mostrarlo
        for (Integer temp : listaTemp.keySet()) {
            System.out.println("La temperatura "+temp+ " se repite " + listaTemp.get(temp));
        }
        System.out.println("-------------");

    }
}

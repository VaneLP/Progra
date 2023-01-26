package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class ejer5 {
    /*Realizar un programa que cree un ArrayList con 10.000 números aleatorios entre 1 y 6 (como si fuese lanzar un dado). Utilizando los métodos estáticos de la clase Collections
guarda en otro ArrayList la distribución de resultados obtenidos (cuantas veces ha salido el uno, cuantas veces ha salido el dos, etc…) y muestra su contenido. Finalmente,
también mediante métodos de Collections, mostrar la diferencia de veces entre el número que más ha salido y el que menos ha salido.*/
    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<>();

        for (int i=1;i<=10000;i++){
            int nAle= ThreadLocalRandom.current().nextInt(1,6+1);
            lista.add(nAle);
        }

        ArrayList<Integer> lista2 = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {
            //frequency = cuenta cuantas veces aparece algo
            lista2.add(Collections.frequency(lista, i));
        }

        for (int i = 0; i < lista2.size(); i++) {
            System.out.println("El numero "+(i+1)+" se repite: "+lista2.get(i));
        }

        System.out.println("-----------------------------------");
        System.out.println("la diferencia entre el numero mayor y el menor es: "+Collections.max(lista2) +" - " +Collections.min(lista2) +" = "+(Collections.max(lista2)-Collections.min(lista2)));

    }
}

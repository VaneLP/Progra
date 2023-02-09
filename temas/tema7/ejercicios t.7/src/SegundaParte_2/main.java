package SegundaParte_2;

public class main {
    public static void main(String[] args) {

        Aparatos bombilla = new Aparatos("bombilla", 100);
        Aparatos a2 = new Aparatos("radiador", 2000);
        Aparatos a3 = new Aparatos("plancha", 1200);


        Aparatos.imprimeConsumoTotal();
        bombilla.encender();
        a3.encender();
        bombilla.encender();
        System.out.println("--------------------------------------");
        Aparatos.imprimeConsumoTotal();
        a3.apagar();
        a2.encender();
        System.out.println("--------------------------------------");
        Aparatos.imprimeConsumoTotal();
    }
}

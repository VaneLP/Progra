package e_6_figuras;

import java.util.ArrayList;

public class ProgrmaFiguras {
    public static void main(String[] args) {
        ArrayList<iFigura2D> listaFiguras = new ArrayList<>();
        Cuadrado c=new Cuadrado(4);
        Cuadrado c1=new Cuadrado(43);
        Cuadrado c2=new Cuadrado(45);
        Cuadrado c3=new Cuadrado(46);
        Cuadrado c4=new Cuadrado(49);

        listaFiguras.add(c);
        listaFiguras.add(c1);
        listaFiguras.add(c2);
        listaFiguras.add(c3);
        listaFiguras.add(c4);

        for (iFigura2D lista : listaFiguras) {
            lista.imprimir();
        }

        c.escalar(2);
        c1.escalar(2);
        c2.escalar(2);
        c3.escalar(2);
        c4.escalar(2);

        for (iFigura2D lista : listaFiguras) {
            lista.imprimir();
        }

        c.escalar(0.1);
        c1.escalar(0.1);
        c2.escalar(0.1);
        c3.escalar(0.1);
        c4.escalar(0.1);

        for (iFigura2D lista : listaFiguras) {
            lista.imprimir();
        }
    }
}

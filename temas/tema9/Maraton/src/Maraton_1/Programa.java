package Maraton_1;

public class Programa {
    public static void main(String[] args) {
        Triangulo t1= new Triangulo();
        t1.ancho=8;
        t1.altoo=8;
        t1.setEstilo(EstiloTriangulo.EQUILATERO);

        t1.verDim();
        t1.verEstilo();
        System.out.println("Area: "+t1.area());

    }
}

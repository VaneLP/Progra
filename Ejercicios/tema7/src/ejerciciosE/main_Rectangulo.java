package ejerciciosE;

/*
En el main de la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5) y (7,9)(2,3).
Muestra por pantalla sus coordenadas, perímetros (suma de lados) y áreas (ancho x alto).
Modifica todas las coordenadas como consideres y vuelve a imprimir coordenadas,
perímetros y áreas
 */
public class main_Rectangulo {
    public static void main(String[] args) {
        //variables
        Rectangulo r1=new Rectangulo(0,0,5,5);
        Rectangulo r2=new Rectangulo(7,9,2,3);

        System.out.printf("El 1º rectangulo tiene unas coordenadas de: (" + r1.getX1() + "," + r1.getY1() + ") (" + r1.getX2() + "," + r1.getY2() + ").%n" +
                            "El perimetro es de: " + (2*Math.abs((r1.getX1()-r1.getX2())+(r1.getY1()- r1.getY2()))) + ".%n"+
                            "EL area es de: " + (Math.abs((r1.getX1()-r1.getX2()) * (r1.getY1()-r1.getY2()))) + ".%n" +
                            "----------------------------------------------------------------%n");

        System.out.printf("El 2º rectangulo tiene unas coordenadas de: (" + r2.getX1() + "," + r2.getY1() + ") (" + r2.getX2() + "," + r2.getY2() + ").%n" +
                "El perimetro es de: " + (2*Math.abs((r2.getX1()-r2.getX2())+(r2.getY1()- r2.getY2()))) + ".%n"+
                "EL area es de: " + (Math.abs((r2.getX1()-r2.getX2()) * (r2.getY1()-r2.getY2()))) + ".%n" +
                "----------------------------------------------------------------%n");

        r1.setX1(8);
        r1.setY1(9);
        r1.setX2(6);
        r1.setY2(2);

        r2.setX1(1);
        r2.setY1(2);
        r2.setX2(8);
        r2.setY2(1);

        System.out.printf("El 1º rectangulo tiene unas coordenadas de: (" + r1.getX1() + "," + r1.getY1() + ") (" + r1.getX2() + "," + r1.getY2() + ").%n" +
                "El perimetro es de: " + (2*Math.abs((r1.getX1()-r1.getX2())+(r1.getY1()- r1.getY2()))) + ".%n"+
                "EL area es de: " + (Math.abs((r1.getX1()-r1.getX2()) * (r1.getY1()-r1.getY2()))) + ".%n" +
                "----------------------------------------------------------------%n");

        System.out.printf("El 2º rectangulo tiene unas coordenadas de: (" + r2.getX1() + "," + r2.getY1() + ") (" + r2.getX2() + "," + r2.getY2() + ").%n" +
                "El perimetro es de: " + (2*Math.abs((r2.getX1()-r2.getX2())+(r2.getY1()- r2.getY2()))) + ".%n"+
                "EL area es de: " + (Math.abs((r2.getX1()-r2.getX2()) * (r2.getY1()-r2.getY2()))) + ".%n"+
                "----------------------------------------------------------------%n");

        r1.imprime();
        r1.setX1Y1(5,5);
        r1.setX2Y2(10,10);
        r1.setAll(5,5,10,10);
        System.out.println(r1.getPerimetro());
        System.out.println(r1.getArea());

        System.out.println("------------------------------");
        Rectangulo r = Rectangulo.crearRectanguloAleatorio();
        r.imprime();
    }
}

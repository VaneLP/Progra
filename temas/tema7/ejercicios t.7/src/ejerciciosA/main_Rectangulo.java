package ejerciciosA;
/*
En el main de la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5) y (7,9)(2,3).
Muestra por pantalla sus coordenadas, perímetros (suma de lados) y áreas (ancho x alto).
Modifica todas las coordenadas como consideres y vuelve a imprimir coordenadas,
perímetros y áreas
 */
public class main_Rectangulo {
    public static void main(String[] args) {
        //variables
        Rectangulo r1=new Rectangulo();
        Rectangulo r2=new Rectangulo();

        //definir variales
        r1.x1=0;
        r1.y1=0;
        r1.x2=5;
        r1.y2=5;

        r2.x1=7;
        r2.y1=9;
        r2.x2=2;
        r2.y2=3;

        System.out.printf("El 1º rectangulo tiene unas coordenadas de: (" + r1.x1 + "," + r1.y1 + ") (" + r1.x2 + "," + r1.y2 + ").%n" +
                            "El perimetro es de: " + (2*Math.abs((r1.x1-r1.x2)+(r1.y1- r1.y2))) + ".%n"+
                            "EL area es de: " + (Math.abs((r1.x1-r1.x2) * (r1.y1-r1.y2))) + ".%n" +
                            "----------------------------------------------------------------%n");

        System.out.printf("El 2º rectangulo tiene unas coordenadas de: (" + r2.x1 + "," + r2.y1 + ") (" + r2.x2 + "," + r2.y2 + ").%n" +
                            "El perimetro es de: " + (2*Math.abs((r2.x1-r2.x2)+(r2.y1- r2.y2))) + ".%n"+
                            "EL area es de: " + (Math.abs((r2.x1-r2.x2) * (r2.y1-r2.y2))) + ".%n" +
                            "----------------------------------------------------------------%n");


        r1.x1=8;
        r1.y1=9;
        r1.x2=6;
        r1.y2=2;

        r2.x1=1;
        r2.y1=2;
        r2.x2=8;
        r2.y2=1;

        System.out.printf("El 1º rectangulo tiene unas coordenadas de: (" + r1.x1 + "," + r1.y1 + ") (" + r1.x2 + "," + r1.y2 + ").%n" +
                            "El perimetro es de: " + (2*Math.abs((r1.x1-r1.x2)+(r1.y1- r1.y2))) + ".%n"+
                            "EL area es de: " + (Math.abs((r1.x1-r1.x2) * (r1.y1-r1.y2))) + ".%n" +
                            "----------------------------------------------------------------%n");

        System.out.printf("El 2º rectangulo tiene unas coordenadas de: (" + r2.x1 + "," + r2.y1 + ") (" + r2.x2 + "," + r2.y2 + ").%n" +
                            "El perimetro es de: " + (2*Math.abs((r2.x1-r2.x2)+(r2.y1- r2.y2))) + ".%n"+
                            "EL area es de: " + (Math.abs((r2.x1-r2.x2) * (r2.y1-r2.y2))) + ".%n"+
                            "----------------------------------------------------------------%n");
    }
}

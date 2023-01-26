package ejerciciosB;

public class main_Punto {
/*
En el main de la clase principal instancia 3 objetos Punto con las coordenadas (5,0),
(10,10) y (-3, 7). Muestra por pantalla sus coordenadas (utiliza un println para cada
punto). Modifica todas las coordenadas (prueba distintos operadores como = + - +=
*=...) y vuelve a imprimirlas por pantalla.
 */
    public static void main(String[] args) {
        //variables
        Punto p1=new Punto(5,0);
        Punto p2=new Punto(10,10);
        Punto p3=new Punto(3,7);

        //mostramos los valores
        System.out.println("("+p1.x+","+p1.y+")");
        System.out.println("("+p2.x+","+p2.y+")");
        System.out.println("("+p3.x+","+p3.y+")");
        System.out.println("------------------------------");

        //----------------------------------------------------
        p1.x+=2;
        p1.y+=2;

        p2.x-=15;
        p2.y-=15;

        p3.x*=2;
        p3.y*=9;

        //mostramos los valores
        System.out.println("("+p1.x+","+p1.y+")");
        System.out.println("("+p2.x+","+p2.y+")");
        System.out.println("("+p3.x+","+p3.y+")");
    }

}

package ejerciciosD;

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
        System.out.println("("+p1.getX()+","+p1.getY()+")");
        System.out.println("("+p2.getX()+","+p2.getY()+")");
        System.out.println("("+p3.getX()+","+p3.getY()+")");
        System.out.println("------------------------------");

        //----------------------------------------------------
        p1.setX(p1.getX()+2);
        p1.setY(p1.getY()+2);

        p2.setX(p2.getX()-15);
        p2.setY(p2.getY()-15);

        p3.setX(p3.getX()*2);
        p3.setY(p3.getY()*9);

        //mostramos los valores
        System.out.println("("+p1.getX()+","+p1.getY()+")");
        System.out.println("("+p2.getX()+","+p2.getY()+")");
        System.out.println("("+p3.getX()+","+p3.getY()+")");

        //metodos
        System.out.println("------------------------------");

        p1.imprime();

        p1.setXY(1,1);

        p1.desplaza(2,5);

        p1.setXY(7,5);
        System.out.println(p1.distancia(p2));

    }
}

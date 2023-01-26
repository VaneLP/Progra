package SegundaParte_1;

public class main {
    public static void main(String[] args) {
        //Creamos puntos con la clase de Punto para generar X e Y, como tenemos 3 vertices, generamos 3 puntos
        Punto p1=new Punto(8,5);
        Punto p2=new Punto(10,10);
        Punto p3=new Punto(3,7);
        //Una vez creados los puntos, creamos un triguangulo con la clase Triangulo y le asignamos esos puntos
        Triangulo t1=new Triangulo(p1,p2,p3);

        //mostramos el perimetro del triangulo
        System.out.println("El perimetro del triangulo es: "+t1.perimetro());
    }
}

package SegundaParte_4;

public class main {
    public static void main(String[] args) {
        //solo introducir titulo
        EjemplarLibro libro1= new EjemplarLibro("Los pilares de la tierra");
        EjemplarLibro libro2= new EjemplarLibro("Caperucita roja");

        //introducir la clase
        EjemplarLibro libro3= new EjemplarLibro(libro2);
        EjemplarLibro libro4= new EjemplarLibro(libro2);

        //mostramos libro 3 y 4
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println("----------------------");

        //prestar y devolver libros
        System.out.println(libro1.prestar());
        System.out.println(libro1.prestar());
        System.out.println(libro1.devolver());
        System.out.println(libro1.devolver());
    }
}

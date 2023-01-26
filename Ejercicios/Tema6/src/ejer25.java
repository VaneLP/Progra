import java.util.Scanner;

public class ejer25 {
    /*
    25.Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y su perímetro.
    Implementa y utiliza las funciones:

    double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
    double areaRectangulo(double ancho, double alto) // Devuelve el área
     */

    //-----------FUNCION 1---------------
    /**
     * Funcion para dar el perimetro del rectangulo
     * @param ancho
     * @param alto
     * @return perimetro
     */

    public static double perimetroRectangulo(double ancho, double alto){
        double perimetro= (ancho*2)+(alto*2);
        return perimetro;
    }

    //-----------FUNCION 2---------------
    /**
     * Funcion para dar el area del rectangulo
     * @param ancho
     * @param alto
     * @return area
     */

    public static double areaRectangulo(double ancho, double alto){
        double area = ancho*alto ;
        return area;
    }

    //-----------PROGRAMA---------------
    public static void main(String[] args) {
        //variable
        Scanner entrada = new Scanner(System.in);

        //pedir ancho y alto rectangulo
        System.out.println("Dime el ancho de un rectangulo");
        int ancho= entrada.nextInt();
        System.out.println("Dime el alto de un rectangulo");
        int alto= entrada.nextInt();

        //mostrar
        System.out.println("El area del rectangulo es "+areaRectangulo(ancho,alto));
        System.out.println("El perimetro del rectangulo es "+perimetroRectangulo(ancho,alto));
    }
}

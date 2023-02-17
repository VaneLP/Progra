package e_6_figuras;

public class Triangulo implements iFigura2D{
    //atributos
    private double ancho, alto;

    //constructor
    public Triangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    //getter y setters
    //ancho
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    //alto
    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }

    //metodos
    @Override
    public double perimetro() {
        return 43;
    }

    @Override
    public double area() {
        return (ancho*alto)/2;
    }

    @Override
    public void escalar(double escala) {
        this.ancho=ancho*escala;
        this.alto=alto*escala;
    }

    @Override
    public void imprimir() {
        System.out.printf("\nTriangulo"+
                "\n---------"+
                "\nPerimetro: " +perimetro()+
                "\nArea: "+area());
    }




}

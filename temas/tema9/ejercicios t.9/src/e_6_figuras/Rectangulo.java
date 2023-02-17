package e_6_figuras;

public class Rectangulo implements iFigura2D{
    //atributos
    private double alto, ancho;

    //constructor
    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    //getter y setters
    //alto
    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }

    //ancho
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    //metodos
    @Override
    public double perimetro() {
        return (ancho*2)+(alto*2);
    }

    @Override
    public double area() {
        return ancho*alto;
    }

    @Override
    public void escalar(double escala) {
        this.ancho=ancho*escala;
        this.alto=alto*escala;
    }

    @Override
    public void imprimir() {
        System.out.printf("\nRectangulo"+
                "\n---------"+
                "\nPerimetro: " + perimetro()+
                "\nArea: "+ area());
    }



}

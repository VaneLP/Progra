package Maraton_5;

public class Figura2D_v5 {
    //atributos
    private double ancho;
    private double alto;

    //constructor
    public Figura2D_v5() {
        this.ancho=0;
        this.alto=0;
    }
    public Figura2D_v5(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public Figura2D_v5(double igualBaseAltura){
        this.ancho=igualBaseAltura;
        this.alto=igualBaseAltura;
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

    //metodo
    public void verDim(){
        System.out.printf("dimension: %.2f", ancho + alto );
    }
}

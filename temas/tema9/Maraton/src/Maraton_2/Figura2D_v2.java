package Maraton_2;

public class Figura2D_v2 {
    //atributos
    private double ancho;
    private double alto;

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

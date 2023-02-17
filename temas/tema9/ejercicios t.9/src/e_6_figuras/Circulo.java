package e_6_figuras;

public class Circulo implements iFigura2D{
    //atributos
    private double radio;

    //constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //getter y setters
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //metodos
    @Override
    public double perimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public void escalar(double escala) {
        this.radio=radio*escala;
    }

    @Override
    public void imprimir() {
        System.out.printf("\nCirculo"+
                "\n---------"+
                "\nPerimetro: " +perimetro()+
                "\nArea: "+area());
    }


}

package e_6_figuras;

public class Cuadrado implements iFigura2D{
    //atributos
    private double lado;
    //constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //getter y setters
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    //metodos
    @Override
    public double perimetro() {
        return lado*4;
    }

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public void escalar(double escala) {
        this.lado=lado*escala;
    }

    @Override
    public void imprimir() {
        System.out.printf("\nCuadrado"+
                "\n---------"+
                "\nPerimetro: " + perimetro()+
                "\nArea: "+ area());
    }


}

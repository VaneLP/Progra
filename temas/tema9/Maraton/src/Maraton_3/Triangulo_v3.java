package Maraton_3;

public class Triangulo_v3 extends Figura2D_v3 {
    //atributos
    public String estilo= "";

    //constructor


    public Triangulo_v3(String estilo, double alto, double ancho) {
        this.estilo = estilo;
        setAlto(alto);
        setAncho(ancho);
    }

    //getter y setters
    //estilo
    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    //metodos
    public double area(){
        return (getAncho()*getAlto())/2;
    }

    public void verEstilo(){
        System.out.println(this.estilo);
    }

}

package Maraton_2;

public class Triangulo_v2 extends Figura2D_v2 {
    //atributos
    public String estilo= "";

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

package Maraton_5;

public class Triangulo_v5 extends Figura2D_v5 {
    //atributos
    public String estilo= "";

    //constructor


    public Triangulo_v5(String estilo, double alto, double ancho) {
        super(ancho, alto);
        this.estilo = estilo;
        setAlto(alto);
        setAncho(ancho);
    }
    public Triangulo_v5(){
        super();
        this.estilo=null;
    }

    public Triangulo_v5(double igualBaseAltura) {
        super(igualBaseAltura);
        this.estilo="Igual base por altura";
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

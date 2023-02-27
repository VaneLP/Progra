package Maraton_6;

public class TrianColor_v6 extends Triangulo_v6{
    //atributos
    private String color;

    //constructor
    public TrianColor_v6(String estilo, double alto, double ancho, String color) {
        super(estilo, alto, ancho);
        this.color = color;
    }

    //getters y setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}

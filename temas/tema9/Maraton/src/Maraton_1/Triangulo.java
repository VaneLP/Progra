package Maraton_1;

public class Triangulo extends Figura2D{
    //atributos
    public String estilo= "";

    //metodos
    public double area(){
        return (ancho*alto)/2;
    }

    public void verEstilo(){
        System.out.println(this.estilo);
    }

}

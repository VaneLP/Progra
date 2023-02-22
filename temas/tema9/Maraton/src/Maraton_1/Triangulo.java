package Maraton_1;

public class Triangulo extends Figura2D{
    //atributos
    private EstiloTriangulo estilo;

    //getter y setters
    //estilo
    public EstiloTriangulo getEstilo() {
        return estilo;
    }

    public void setEstilo(EstiloTriangulo estilo) {
        this.estilo = estilo;
    }

    //metodos
    public double area(){
        return (ancho*altoo)/2;
    }

    public void verEstilo(){
        System.out.println(this.estilo);
    }

}

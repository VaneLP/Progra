package e_5_vehiculos;

public class Motos extends Terrestre{
    //atributos
    private Color color;

    //constructor
    public Motos(String matricula, Modelo modelo, int numRuedas, Color color) {
        super(matricula, modelo, numRuedas);
        this.color = color;
    }

    //getters y setters
    //color
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    //metodos
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.printf("Moto"+
                "--------"+
                "Matricula: "+getMatricula()+
                "Modelo: "+getModelo()+
                "Numero de ruedas: "+getNumRuedas()+
                "Color: "+ color);
    }

}

package e_5_vehiculos;

public class Terrestre extends Vehiculos{
    //atributos
    private final int numRuedas;

    //constructor

    public Terrestre(String matricula, Modelo modelo, int numRuedas) {
        super(matricula, modelo);
        if(matricula.matches("[0-9]{4}[a-zA-Z]{3}")) {
            this.numRuedas = numRuedas;
        }
        else
            this.numRuedas=0;
    }

    //getters y setters
    //numero de ruedas
    public int getNumRuedas() {
        return numRuedas;
    }

    //metodos
    @Override
    public void imprimir() {
        System.out.printf("Vehiculo Terrestre");
    }

}

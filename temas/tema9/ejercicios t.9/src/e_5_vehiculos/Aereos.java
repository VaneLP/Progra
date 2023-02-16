package e_5_vehiculos;

public class Aereos extends Vehiculos{
    //atributos
    private final int numAsientos;

    //constructor

    public Aereos(String matricula, Modelo modelo, int numAsientos) {
        super(matricula, modelo);
        this.numAsientos = numAsientos;
    }

    //getters y setters
    //numero asientos
    public int getNumAsientos() {
        return numAsientos;
    }

    //metodos
    @Override
    public void imprimir() {
        System.out.println("Vehiculo aereo");
    }
}

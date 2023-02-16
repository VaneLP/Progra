package e_5_vehiculos;

public class Acuatico extends Vehiculos{
    //atributos
    private final double eslora;

    //constructor
    public Acuatico(String matricula, Modelo modelo, double eslora) {
        super(matricula, modelo);
        if(matricula.matches("[a-zA-Z]{3,10}")) {
            this.eslora = eslora;
        }
        else
            this.eslora=0;
    }

    //getters y setters
    //eslora
    public double getEslora() {
        return eslora;
    }

    //metodos
    @Override
    public void imprimir() {
        System.out.println("Vehiculo acuatico");
    }

}

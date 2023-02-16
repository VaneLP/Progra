package e_5_vehiculos;

public abstract class Vehiculos {
    //atributos
    private final String matricula;
    private final Modelo modelo;

    //constructor
    public Vehiculos(String matricula, Modelo modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    //getters y setters
    //matricula
    public String getMatricula() {
        return matricula;
    }

    //modelo
    public Modelo getModelo() {
        return modelo;
    }

    //metodos
    public abstract void imprimir();

}

package e_5_vehiculos;

public class Aviones extends Aereos{
    //atributos
    private int tiempoMaxVuelo;

    //constructor
    public Aviones(String matricula, Modelo modelo, int numAsientos, int tiempoMaxVuelo) {
        super(matricula, modelo, numAsientos);
        this.tiempoMaxVuelo = tiempoMaxVuelo;
    }

    //getters y setters
    //tiempo maximo de vuelo
    public int getTiempoMaxVuelo() {
        return tiempoMaxVuelo;
    }
    public void setTiempoMaxVuelo(int tiempoMaxVuelo) {
        this.tiempoMaxVuelo = tiempoMaxVuelo;
    }

    //metodos
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.printf("\nAviones"+
                "\n--------"+
                "\nMatricula: "+getMatricula()+
                "\nModelo: "+getModelo()+
                "\nNumero de asientos: "+getNumAsientos()+
                "\nTiempo maximo de vuelo: "+ tiempoMaxVuelo);
    }
}

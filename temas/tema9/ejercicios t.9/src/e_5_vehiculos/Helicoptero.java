package e_5_vehiculos;

public class Helicoptero extends Aereos{
    //atributos
    private int numHelices;

    //constructor
    public Helicoptero(String matricula, Modelo modelo, int numAsientos, int numHelices) {
        super(matricula, modelo, numAsientos);
        this.numHelices = numHelices;
    }

    //getters y setters
    //numero de helices
    public int getNumHelices() {
        return numHelices;
    }
    public void setNumHelices(int numHelices) {
        this.numHelices = numHelices;
    }

    //metodos
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.printf("\nHelicoptero"+
                "\n--------"+
                "\nMatricula: "+getMatricula()+
                "\nModelo: "+getModelo()+
                "\nNumero de asientos: "+getNumAsientos()+
                "\nNumero de helices: "+ numHelices);
    }
}

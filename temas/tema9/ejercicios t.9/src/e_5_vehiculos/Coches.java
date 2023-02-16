package e_5_vehiculos;

public class Coches extends Terrestre{
    //atributos
    private boolean aireAcondicionado;

    //constructor
    public Coches(String matricula, Modelo modelo, int numRuedas, boolean aireAcondicionado) {
        super(matricula, modelo, numRuedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    //getters y setters
    //aire acondicionado
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    //metodos
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.printf("Coche"+
                        "--------"+
                        "Matricula: "+getMatricula()+
                        "Modelo: "+getModelo()+
                        "Numero de ruedas: "+getNumRuedas()+
                        "Aire acondicionado: "+ aireAcondicionado);
    }
}

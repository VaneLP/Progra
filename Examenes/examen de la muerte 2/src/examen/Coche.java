package examen;

public class Coche extends Terrestres{
    //atributos
    private final boolean aireAcondicionado;


    //constructor
    public Coche(String matricula, String modelo, int pasos, int numRuedas, boolean aireAcondicionado) throws Exception {
        super(matricula, modelo, pasos, numRuedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String Mostrar(){

        return String.format("%10", "Aire acondicionado"+
                "%10",aireAcondicionado);
    }

    @Override
    public void recorrer(int numPasos) {
        setPasos(numPasos*2);
    }

}

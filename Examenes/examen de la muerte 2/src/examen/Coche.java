package examen;

public class Coche extends Terrestres{
    //atributos
    private final boolean aireAcondicionado;


    //constructor
    public Coche(String matricula, String modelo, int numRuedas, boolean aireAcondicionado) throws VehiculoExcepcion {
        super(matricula, modelo, numRuedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String Mostrar(){

        return String.format("%10", "Aire acondicionado"+
                "%10",aireAcondicionado);
    }

    @Override
    public void recorrer(int numPasos) throws VehiculoExcepcion{
        if(getPasos()+(numPasos*2)>LIMITEPASOS) {
            throw new VehiculoExcepcion("Excepcion en vehiculos, limite de pasos alcanzado: " + numPasos);
        }
        setPasos(getPasos()+(numPasos*2));
    }

}

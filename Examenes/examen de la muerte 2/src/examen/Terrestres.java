package examen;

public class Terrestres extends Vehiculos{
    //atributos
    private final int numRuedas;
    static final int LIMITEPASOS=100000;

    //constructor
    public Terrestres(String matricula, String modelo, int numRuedas) throws VehiculoExcepcion{
        super(matricula, modelo);

        if(matricula.matches("[0-9]{4}[a-zA-Z]{3}")) {
           this.numRuedas=numRuedas;
        }
        else
            throw new VehiculoExcepcion("Excepcion en vehiculos con el valor: : "+matricula);

    }

    //getter
    //numero de ruedas
    public int getNumRuedas() {
        return numRuedas;
    }



    //metodos
    @Override
    public String Mostrar() {
        return String.format("%s10","Numero de ruedas"+
                                    "%10",numRuedas);
    }

    @Override
    public void recorrer(int numPasos) throws VehiculoExcepcion{
        if(getPasos()+(numPasos*2)>LIMITEPASOS) {
            throw new VehiculoExcepcion("Excepcion en vehiculos, limite de pasos alcanzado: " + numPasos);
        }
        setPasos(getPasos()+(numPasos*2));
    }


}
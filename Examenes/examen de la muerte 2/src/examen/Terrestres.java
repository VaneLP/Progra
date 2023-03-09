package examen;

public class Terrestres extends Vehiculos{
    //atributos
    private final int numRuedas;
    private static int limitePasos=100000;

    //constructor
    public Terrestres(String matricula, String modelo, int pasos, int numRuedas) throws Exception{
        super(matricula, modelo, pasos);

        if(matricula.matches("[0-9]{4}[a-zA-Z]{3}")) {
           this.numRuedas=numRuedas;
        }

        throw new Exception("Excepcion en vehiculos con el valor: : "+matricula);

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
    public void recorrer(int numPasos) throws VehiculoException{
        if(numPasos>limitePasos)
            throw new VehiculoException("Excepcion en vehiculos, limite de pasos alcanzado: "+ numPasos);
    }


}
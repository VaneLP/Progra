package examen;

public class Motos extends Terrestres{
    //atributos
    private final Color color;

    //constructor
    public Motos(String matricula, String modelo, int numRuedas, Color color) throws VehiculoExcepcion {
        super(matricula, modelo, numRuedas);
        this.color = color;
    }

    //metodos
    @Override
    public String Mostrar(){
        return String.format("%10s Color",color);
    }

    @Override
    public void recorrer(int numPasos) throws VehiculoExcepcion{
        if(getPasos()+(numPasos*3)>LIMITEPASOS) {
            throw new VehiculoExcepcion("Excepcion en vehiculos, limite de pasos alcanzado: " + numPasos);
        }
        setPasos(getPasos()+(numPasos*3));
    }

}

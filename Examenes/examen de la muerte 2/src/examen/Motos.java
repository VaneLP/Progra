package examen;

public class Motos extends Terrestres{
    //atributos
    private final Color color;

    //constructor
    public Motos(String matricula, String modelo, int pasos, int numRuedas, Color color) throws Exception {
        super(matricula, modelo, pasos, numRuedas);
        this.color = color;
    }

    //metodos
    @Override
    public String Mostrar(){
        return String.format("%10", "Color"+
                "%10",color);
    }

    @Override
    public void recorrer(int numPasos) {
        setPasos(numPasos*3);
    }

}

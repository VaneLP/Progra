package e_5_vehiculos;

public class Submarinos extends Acuatico{
    //atributos
    private double profundidadMax;

    //constructor
    public Submarinos(String matricula, Modelo modelo, double eslora, double profundidadMax) {
        super(matricula, modelo, eslora);
        this.profundidadMax = profundidadMax;
    }

    //getters y setters
    //prundidad maxima
    public double getProfundidadMax() {
        return profundidadMax;
    }
    public void setProfundidadMax(double profundidadMax) {
        this.profundidadMax = profundidadMax;
    }

    //metodos
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.printf("\nSubmarino"+
                "\n--------"+
                "\nMatricula: "+getMatricula()+
                "\nModelo: "+getModelo()+
                "\nEslora: "+getEslora()+
                "\nProfundidad maxima: "+ profundidadMax);
    }
}

public class Triatleta implements Nadador, Saltador {
    //atributos
    private String nombre;
    private int velCorriendo;
    private int velNadando;
    private int velBicicleta;

    //constructor
    public Triatleta(String nombre, int velCorriendo, int velNadando, int velBicicleta) {
        this.nombre = nombre;
        this.velCorriendo = velCorriendo;
        this.velNadando = velNadando;
        this.velBicicleta = velBicicleta;
    }


    @Override
    public boolean saltar(int centimetros) {
        return false;
    }

    @Override
    public int nadar(int metros) {
        double metrosSegundo=this.velNadando / 0.27777778;
        return (int)(metros*metrosSegundo);
    }


}

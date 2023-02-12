public class AnimalTerrestre extends Animal implements Saltador {
    //atributos
    private int recinto;
    private int longitudSalto;

    //contructor
    public AnimalTerrestre(String nombre, int estancia, int recinto, int longitudSalto) {
        super(nombre, estancia);
        this.recinto = recinto;
        this.longitudSalto = longitudSalto;
    }

    //getters y setters
    //recinto
    public int getRecinto() {
        return recinto;
    }
    public void setRecinto(int recinto) {
        this.recinto = recinto;
    }

    //longitud salto
    public int getLongitudSalto() {
        return longitudSalto;
    }
    public void setLongitudSalto(int longitudSalto) {
        this.longitudSalto = longitudSalto;
    }

    @Override
    public void ejercicio() {
        System.out.println("El animal terrestre hace ejercicio");
    }

    @Override
    public boolean saltar(int centimetros) {
        return this.longitudSalto>centimetros;
    }

}


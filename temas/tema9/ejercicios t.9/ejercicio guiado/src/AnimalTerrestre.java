public class AnimalTerrestre extends Animal {
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


}


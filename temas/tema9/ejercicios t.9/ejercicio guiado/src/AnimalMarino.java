public class AnimalMarino extends Animal {
    private TipoAgua tipoAgua;
    private int velocidad;

    public AnimalMarino(String nombre, int estancia, TipoAgua tipoAgua, int velocidad) {
        super(nombre, estancia);
        this.tipoAgua = tipoAgua;
        this.velocidad = velocidad;
    }

    //getters y setters
    //tipo de agua
    public TipoAgua getTipoAgua() {
        return tipoAgua;
    }
    public void setTipoAgua(TipoAgua tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    //velocidad
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


}

package e_7_monopoly;

public abstract class Propiedad extends Casilla {
    //atributos
    private final int precio, hipoteca;
    private int propietario;

    public Propiedad(String nombre, int precio, int hipoteca) {
        super(nombre);
        this.precio = precio;
        this.hipoteca = hipoteca;
        this.propietario = -1;
    }

    public int getPropietario() {
        return propietario;
    }

    public void setPropietario(int propietario) {
        this.propietario = propietario;
    }

    public abstract int getAlquiler(int modificacion);
}

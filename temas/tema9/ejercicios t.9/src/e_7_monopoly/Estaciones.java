package e_7_monopoly;

public class Estaciones extends Propiedad{
    private static final int VALOR_ESTACION=0;
    public Estaciones(String nombre) {
        super(nombre, VALOR_ESTACION, VALOR_ESTACION);
    }

    @Override
    public int getAlquiler(int modificacion) {
        return VALOR_ESTACION/modificacion;
    }
}

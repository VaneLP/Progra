package e_1_astros;

public class Planetas extends Astros {
    //atributos
    private double distanciaSol, orbitaSol;
    private boolean tieneSatelites;

    //constructor
    public Planetas(double radioEcuatorial, double rotacionEje, double masa, double temperaturaMedia, double gravedad, double distanciaSol, double orbitaSol, boolean tieneSatelites) {
        super(radioEcuatorial, rotacionEje, masa, temperaturaMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelites = tieneSatelites;
    }

    //getters y setters
    //distancia al sol
    public double getDistanciaSol() {
        return distanciaSol;
    }
    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    //orbita al sol
    public double getOrbitaSol() {
        return orbitaSol;
    }
    public void setOrbitaSol(double orbitaSol) {
        this.orbitaSol = orbitaSol;
    }

    //tiene satelites
    public boolean isTieneSatelites() {
        return tieneSatelites;
    }
    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }

    //metodos

    @Override
    public void muestra() {
        super.muestra();

        System.out.printf("\nPlanetas"+
                "\n------------"+
                "\nDistancia al sol: "+distanciaSol+
                "\nOrbita al sol: "+orbitaSol+
                "\nTiene satelites: "+tieneSatelites+
                "\n---------------------------------------");
    }

}

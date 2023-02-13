package e_1_astros;

public class Satelites extends Astros{
    //atributos
    double distanciaPlaneta, orbitaPlanetaria;
    String planetaPertenece;

    //constructor

    public Satelites(double radioEcuatorial, double rotacionEje, double masa, double temperaturaMedia, double gravedad, double distanciaPlaneta, double orbitaPlanetaria, String planetaPertenece) {
        super(radioEcuatorial, rotacionEje, masa, temperaturaMedia, gravedad);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaPertenece = planetaPertenece;
    }

    //getters y setters
    //distancia al planeta
    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }
    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    //orbita planetaria
    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }
    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    //planeta al que pertenece
    public String getPlanetaPertenece() {
        return planetaPertenece;
    }
    public void setPlanetaPertenece(String planetaPertenece) {
        this.planetaPertenece = planetaPertenece;
    }

    //metodos
    @Override
    public void muestra() {
        super.muestra();

        System.out.printf("\nSatelites"+
                        "\n------------"+
                        "\nPlaneta al que pertenece: "+planetaPertenece+
                        "\nDistancia al planeta: "+distanciaPlaneta+
                        "\nOrbita planetaria: "+orbitaPlanetaria+
                        "\n---------------------------------------");
    }


}

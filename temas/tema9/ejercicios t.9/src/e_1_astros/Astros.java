package e_1_astros;

public abstract class Astros {
    //atributos
    private double radioEcuatorial, rotacionEje, masa,temperaturaMedia, gravedad;

    //constructor

    public Astros(double radioEcuatorial, double rotacionEje, double masa, double temperaturaMedia, double gravedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionEje = rotacionEje;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }

    //getters y setters
    //radio ecuatorial
    public double getRadioEcuatorial() {
        return radioEcuatorial;
    }
    public void setRadioEcuatorial(double radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }

    //rotacion sobre su eje
    public double getRotacionEje() {
        return rotacionEje;
    }
    public void setRotacionEje(double rotacionEje) {
        this.rotacionEje = rotacionEje;
    }

    //masa
    public double getMasa() {
        return masa;
    }
    public void setMasa(double masa) {
        this.masa = masa;
    }

    //temperatura media
    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }
    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    //gravedad
    public double getGravedad() {
        return gravedad;
    }
    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    //metodos
    public void muestra() {
        System.out.printf("\nAstros"+
                        "\n---------"+
                        "\nRadio ecuatorial: "+radioEcuatorial+
                        "\nRotacion sobre su eje: "+rotacionEje+
                        "\nMasa: "+masa+
                        "\nTemperatura media: "+temperaturaMedia+
                        "\nGravedad: "+gravedad+
                        "\n---------------------------------------");
    }

}

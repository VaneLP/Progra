package e_2_mascotas;

public class Canario extends Aves {
    //atributos
    private ColorCanario color;
    private boolean canta;

    //constructor
    public Canario(String nombre, String fechaNacimiento, Estado estado, int edad, boolean vuela, Pico pico, ColorCanario color, boolean canta) {
        super(nombre, fechaNacimiento, estado, edad, vuela, pico);
        this.color = color;
        this.canta = canta;
    }

    //getters y setters
    //color
    public ColorCanario getColor() {
        return color;
    }
    public void setColor(ColorCanario color) {
        this.color = color;
    }

    //canta
    public boolean isCanta() {
        return canta;
    }
    public void setCanta(boolean canta) {
        this.canta = canta;
    }

    //metodos
    public void muestra(){
        super.muestra();

        System.out.printf("\nCanario"+
                        "\n-----------"+
                        "\nColor: " +color+
                        "\nCanta: " + canta);
    }

    @Override
    public void hablar() {
        System.out.println("pio pio");
    }

    @Override
    public void volar(){
        System.out.println("El canario esta volando");
    }

}

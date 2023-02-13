package e_2_mascotas;

public abstract class Aves extends Mascotas{
    //atributos
    private boolean vuela=true;
    private Pico pico;

    //constructor
    public Aves(String nombre, String fechaNacimiento, Estado estado, int edad, boolean vuela, Pico pico) {
        super(nombre, fechaNacimiento, estado, edad);
        this.vuela = vuela;
        this.pico = pico;
    }

    //getters y setters
    //vuela
    public boolean isVuela() {
        return vuela;
    }
    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    //pico
    public Pico getPico() {
        return pico;
    }
    public void setPico(Pico pico) {
        this.pico = pico;
    }

    //metodos
    public abstract void volar();

}

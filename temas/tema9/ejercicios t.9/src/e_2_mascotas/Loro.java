package e_2_mascotas;

public class Loro extends Aves {
    //atributos
    private String origen;
    private boolean habla;

    //constructor
    public Loro(String nombre, String fechaNacimiento, Estado estado, int edad, boolean vuela, Pico pico, String origen, boolean habla) {
        super(nombre, fechaNacimiento, estado, edad, vuela, pico);
        this.origen = origen;
        this.habla = habla;
    }


    //getters y setters
    //origen
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    //habla
    public boolean isHabla() {
        return habla;
    }
    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    //metodos
    public void muestra(){
        super.muestra();

        System.out.printf("\nLoro"+
                        "\n--------"+
                        "\nOrigen: "+origen+
                        "\nHabla: "+habla);
    }

    @Override
    public void hablar() {
    }

    public void saluda(){
        System.out.println("holaa praaaa");
    }

    @Override
    public void volar(){
        System.out.println("El loro esta volando");
    }

}

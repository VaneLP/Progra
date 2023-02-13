package e_2_mascotas;

public class Gato extends Mascotas{
    //atributos
    private ColorGato color;
    private boolean peloLargo=false;

    //constructor
    public Gato(String nombre, String fechaNacimiento, Estado estado, int edad, ColorGato color, boolean peloLargo) {
        super(nombre, fechaNacimiento, estado, edad);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    //getters y setters
    //color
    public ColorGato getColor() {
        return color;
    }
    public void setColor(ColorGato color) {
        this.color = color;
    }

    //pelo largo
    public boolean isPeloLargo() {
        return peloLargo;
    }
    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }

    //metodos
    public void muestra(){
        super.muestra();

        System.out.printf("\nGato"+
                        "\n--------"+
                        "\nColor: "+color+
                        "\nPelo largo: "+peloLargo);
    }

    @Override
    public void hablar() {
        System.out.println("miau");
    }

}

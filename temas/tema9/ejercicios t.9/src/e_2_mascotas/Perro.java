package e_2_mascotas;

public class Perro extends Mascotas{
    //atributos
    private Raza raza;
    private boolean pulgas=false;

    //constructor
    public Perro(String nombre, String fechaNacimiento, Estado estado, int edad, Raza raza, boolean pulgas) {
        super(nombre, fechaNacimiento, estado, edad);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    //getters y setters
    //raza
    public Raza getRaza() {
        return raza;
    }
    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    //pulgas
    public boolean isPulgas() {
        return pulgas;
    }
    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    //metodos
    public void muestra(){
        super.muestra();

        System.out.printf("\nPerro"+
                        "\n----------"+
                        "\nRaza: "+raza+
                        "\nPulgas: "+pulgas);
    }

    @Override
    public void hablar() {
        System.out.println("guau");
    }

}

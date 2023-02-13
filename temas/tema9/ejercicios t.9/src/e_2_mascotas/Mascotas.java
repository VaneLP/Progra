package e_2_mascotas;

public abstract class Mascotas {
    //atributos
    private String nombre, fechaNacimiento;
    private Estado estado;
    private int edad;

    //constructor
    public Mascotas(String nombre, String fechaNacimiento, Estado estado, int edad) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.edad = edad;
    }

    //getters y setters
    //nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //estado
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = Estado.VIVO;
    }

    //fecha de nacimiento
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //edad
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //metodos
    public void muestra(){
        System.out.printf("\nAnimal"+
                        "\n----------"+
                        "\nNombre: "+ nombre+
                        "\nEdad: "+ edad+
                        "\nEstado: "+estado+
                        "\nFecha de nacimiento: "+fechaNacimiento);
    }

    public void cumpleanos(){
        this.edad++;
    }

    public void morir(){
        estado = Estado.MUERTO;
    }

    public abstract void hablar();

}

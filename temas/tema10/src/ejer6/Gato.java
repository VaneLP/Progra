package ejer6;

public class Gato {
    //atributos
    private String nombre;
    private int edad;

    //constructor
    public Gato(String nombre, int edad) throws Exception{
        if(nombre.matches("[a-zA-Z]{3}+") && edad>0) {
            this.nombre = nombre;
            this.edad = edad;
        }
        else
            throw new Exception("No se pudo crear el animal");
    }

    //getters y setters
    //nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) throws Exception{
        if(nombre.matches("[a-zA-Z]{3}+"))
            this.nombre = nombre;
        else
            throw new Exception("No se pudo guardar el nombre");
    }

    //edad
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) throws Exception {
        if(edad>0)
            this.edad = edad;
        else
            throw new Exception("No se pudo guardar la edad");
    }

    //metodos
    @Override
    public String toString() {
        return "nombre=" + nombre +
                "\nEdad=" + edad;
    }
}

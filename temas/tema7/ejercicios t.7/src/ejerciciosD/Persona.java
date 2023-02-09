package ejerciciosD;
/*
Crea un programa con una clase llamada Persona que representará los datos principales
de una persona: dni, nombre, apellidos y edad.
 */
public class Persona {
    private String dni, nombre, apellidos;
    private int edad;

    //Añade un constructor
    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    //getters and setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //-------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //-------------------------------------------------------------------------
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //-------------------------------------------------------------------------
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //añadir metodos
    public void imprime() {
        System.out.println("Nombre: " + nombre + ". Apellidos: " + apellidos + ". DNI: " + dni + ". Edad: " + edad);
    }

    public boolean esMayorEdad() {
        if (this.edad < 18)
            return false;
        else
            return true;
    }

    public boolean esJubilado(){
        if (this.edad <65)
            return false;
        else
            return true;
    }
    public int diferenciaEdad (Persona p){
        return Math.abs(this.edad-p.getEdad());
    }

}

package ejerciciosE;
/*
Crea un programa con una clase llamada Persona que representará los datos principales
de una persona: dni, nombre, apellidos y edad.
 */
public class Persona {
    private String nombre, apellidos;
    private final String dni;
    private int edad;
    private static final int mayoriaEdad=18;

    //Añade un constructor
    public Persona(String nombre, String apellidos, String dni, int edad) {
        if (Persona.validarDNI(dni)) {
            this.dni = dni;
        }else{
            System.err.println("Error DNI no correcto");
            this.dni=null;
        }
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //getters and setters
    public String getDni() {
        return dni;
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
        if (this.edad < Persona.mayoriaEdad)
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

    public static boolean validarDNI(String dni){
        String letras="TRWAGMYFPDXBNJZSQVHLCKE";
        dni= dni.toUpperCase();
        return dni.matches("\\d{8}[a-zA-Z]") && dni.charAt(8)==letras.charAt(Integer.parseInt(dni.substring(0,8))%23);
    }

}

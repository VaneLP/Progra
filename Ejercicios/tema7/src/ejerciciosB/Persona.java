package ejerciciosB;
/*
Crea un programa con una clase llamada Persona que representará los datos principales
de una persona: dni, nombre, apellidos y edad.
 */
public class Persona {
    String dni, nombre, apellidos;
    int edad;

    //Añade un constructor
    public Persona(String nombre, String apellidos, String dni, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.edad=edad;
    }
}

package ejer4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Persona {
    //atributos
    String nombre, email;
    LocalDate fechaNacimiento;
    int telefono;

    //constructor
    public Persona(String nombre, String email, LocalDate fechaNacimiento, int telefono) {
        this.nombre = nombre;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public Persona() {

    }

    //getters y setters
    //nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //añadir getEdad
    public long getEdad() {
        return ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
    }

    //metodos
    @Override
    public String toString() {
        return "\nPersona{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", telefono=" + telefono +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(fechaNacimiento, persona.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, fechaNacimiento);
    }
}

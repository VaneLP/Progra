package ejer10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Persona_v2 implements Comparable<Persona_v2>{
    //atributos
    String nombre, email;
    LocalDate fechaNacimiento;
    int telefono;

    //constructor
    public Persona_v2(String nombre, String email, LocalDate fechaNacimiento, int telefono) {
        this.nombre = nombre;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public Persona_v2() {

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
    public int compareTo(Persona_v2 o) {
        return 0;
    }
}

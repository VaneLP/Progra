package ejer12;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Objects;

public class Persona_v3 implements Comparable<Persona_v3>{
    //atributos
    String nombre, email;
    LocalDate fechaNacimiento;
    int telefono;

    //constructor
    public Persona_v3(String nombre, String email, LocalDate fechaNacimiento, int telefono) {
        this.nombre = nombre;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public Persona_v3() {

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

    //equals y hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona_v3 that = (Persona_v3) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    //al ser un treeset necesitamos el comparable
    @Override
    public int compareTo(Persona_v3 p) {
        return this.nombre.compareToIgnoreCase(p.nombre);
    }

}

//creamos una clase externa
class CompararEmail implements Comparator<Persona_v3>{
    @Override
    public int compare(Persona_v3 p1, Persona_v3 p2) {
        return p1.email.compareToIgnoreCase(p2.email);
    }
}
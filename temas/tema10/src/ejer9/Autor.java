package ejer9;

import java.util.Objects;

public record Autor(String nombre, String psudonimo) implements Comparable<Autor>{
    //el record es equivalente a lo de abajo (donde todos sus atributos son finales), pero en registro

    /*
    //atributos
    private final String nombre;
    private final String psudonimo;

    //constructor
    public Autor(String nombre, String psudonimo) {
        this.nombre = nombre;
        this.psudonimo = psudonimo;
    }

    //getters
    //nombre
    public String getNombre() {
        return nombre;
    }

   //psudonimo
    public String getPsudonimo() {
        return psudonimo;
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nombre, autor.nombre) && Objects.equals(psudonimo, autor.psudonimo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, psudonimo);
    }

    @Override
    public int compareTo(Autor o) {
        return 0;
    }
}

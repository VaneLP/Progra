package repasoEx;

import java.util.Objects;

public class Asignatura {
    //atributos
    public final String nombre;
    public final int codigo;
    private static int codigoGlobal=0;

    //contructor
    public Asignatura(String nombre) {
        this.nombre = nombre;
        codigoGlobal++;
        this.codigo = codigoGlobal;
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asignatura that = (Asignatura) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}

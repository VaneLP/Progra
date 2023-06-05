package final1_VanesaLopez;

import java.util.Objects;

//realizamos la clase asignatura
public class Asignatura {
    //atributos, no podran ser modificados una vez establecidos
    final String nombre;
    final int codigoAsignatura;
    static int codigoGlobal;

    //constructor
    public Asignatura(String nombre) {
        this.nombre = nombre;
        codigoGlobal++;
        codigoAsignatura = codigoGlobal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigoAsignatura() {
        return codigoAsignatura;
    }

    //equals para decir que dos asignaturas son iguales si tienen el mismo nombre
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

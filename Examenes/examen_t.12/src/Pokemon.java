/*crear una clase para representar a estos pokemon, los datos en el
fichero son nombre, nivel, salud y tipo. Siendo nombre y tipo cadenas
de caracteres y nivel y salud de tipo entero.*/

import java.util.Objects;

public class Pokemon  {
    //atributos
    String nombre, tipo;
    int nivel, salud;

    //constructor
    public Pokemon(String nombre, int nivel, int salud, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.salud = salud;
    }

    //getters y setters
    //nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //tipo
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //lvl
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //salud
    public int getSalud() {
        return salud;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }

    //toString
    @Override
    public String toString() {
        return "nombre=" + nombre +
                ", tipo=" + tipo +
                ", nivel=" + nivel +
                ", salud=" + salud;
    }

}

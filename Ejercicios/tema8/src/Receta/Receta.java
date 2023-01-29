package Receta;

import java.util.ArrayList;

public class Receta {
    //atributos
    private String nombre, elaboracion;
    private int duracion;
    private ArrayList<Ingredientes> ingrediente;

    //constructor
    public Receta(String nombre, String elaboracion, int duracion){
        this.nombre=nombre;
        this.elaboracion=elaboracion;
        this.duracion=duracion;
        this.ingrediente= new ArrayList<>();
    }

    //getter y setters
    //nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //elaboracion
    public String getElaboracion() {
        return elaboracion;
    }
    public void setElaboracion(String elaboracion) {
        this.elaboracion = elaboracion;
    }

    //duracion
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //metodos
    public void anyadirIngre(Ingredientes ingredien){
        this.ingrediente.add(ingredien);
    }
    public void anyadirIngre(String nombre, int cantidad, String unidad){
        anyadirIngre(new Ingredientes(nombre,cantidad,unidad));
    }

    @Override
    public String toString() {
        return "---- Receta ----" +
                "\nNombre: " + nombre +
                "\nElaboracion: " + elaboracion +
                "\nDuracion: " + duracion +
                "\nIngredientes: " + ingrediente;
    }
}

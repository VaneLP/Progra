package examen;

import java.util.Objects;

public abstract class Vehiculos {
    //Atributos
    private final String matricula, modelo;
    private int pasos=0;

    //constructor
    public Vehiculos(String matricula, String modelo, int pasos) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.pasos = pasos;
    }

    //getter y setters
    //matricula
    public String getMatricula() {
        return matricula;
    }

    //modelo
    public String getModelo() {
        return modelo;
    }

    //pasos
    public int getPasos() {
        return pasos;
    }
    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    //metodos
    public String Mostrar(){
        return String.format("%10 %10 %10","Matricula", "Modelo", "Pasos"+
                "%10 %10 %10",matricula,modelo,pasos);
    }

    public abstract void recorrer(int numPasos) throws VehiculoException;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculos vehiculos = (Vehiculos) o;
        return pasos == vehiculos.pasos && Objects.equals(matricula, vehiculos.matricula) && Objects.equals(modelo, vehiculos.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, modelo, pasos);
    }
}

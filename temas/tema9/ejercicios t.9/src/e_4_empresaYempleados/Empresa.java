package e_4_empresaYempleados;

import java.util.ArrayList;

public class Empresa {
    //atributos
    private final String name,cif;
    private String direccion;
    private int tfl;
    private ArrayList<Empleados> listaEmpleados = new ArrayList<>();

    //constructor
    public Empresa(String name, String cif, String direccion, int tfl, ArrayList<Empleados> listaEmpleados) {
        this.name = name;
        this.cif = cif;
        this.direccion = direccion;
        this.tfl = tfl;
        this.listaEmpleados = listaEmpleados;
    }

    //getters y setters
    //nombre
    public String getName() {
        return name;
    }

    //CIF
    public String getCif() {
        return cif;
    }

    //direccion
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //telefono
    public int getTfl() {
        return tfl;
    }
    public void setTfl(int tfl) {
        this.tfl = tfl;
    }

    public ArrayList<Empleados> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleados> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    //metodos
    public void anyadirEmpleado(Empleados e){
        listaEmpleados.add(e);
    }

    public void eliminarEmpleado(Empleados e){
        listaEmpleados.remove(e);
    }

    public void mostrarDNI(String nombre){
        for (Empleados empleado : listaEmpleados) {
            if(empleado.getName().equals(nombre))
                System.out.printf(empleado.getDni());
        }
    }

    public void calcularSumaTotalSueldosBruto(){
        double suma=0;

        for (Empleados empleado : listaEmpleados) {
            suma = suma + empleado.getSueldoBruto();
        }
    }

    public void calcularSumaTotalSueldosNetos(){
        double suma=0;

        for (Empleados empleado : listaEmpleados) {
            suma = suma + empleado.calcularSueldoNeto(empleado.getSueldoBruto());
        }
    }

}

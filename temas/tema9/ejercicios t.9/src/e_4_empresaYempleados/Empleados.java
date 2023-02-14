package e_4_empresaYempleados;

public class Empleados {
    //atributos
    private final String name, dni;
    private String direccion;
    private double sueldoBruto;
    private int edad, tlf;

    //constructor
    public Empleados(String name, String dni, double sueldoBruto) {
        this.name = name;
        this.dni = dni;
        this.sueldoBruto = sueldoBruto;
    }

    //getters y setters
    //nombre
    public String getName() {
        return name;
    }

    //DNI
    public String getDni() {
        return dni;
    }

    //direccion
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //sueldo bruto
    public double getSueldoBruto() {
        return sueldoBruto;
    }
    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    //edad
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //telefono
    public int getTlf() {
        return tlf;
    }
    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    //metodos


    @Override
    public String toString() {
        return "\nEmpleado" +
                "\n--------"+
                "\nNombre: " + name + '\'' +
                "\nDNI: " + dni + '\'' +
                "\nDireccion: '" + direccion + '\'' +
                "\nSueldo bruto: " + sueldoBruto +
                "\nEdad: " + edad +
                "\nTelefono: " + tlf;
    }

    public double calcularSueldoNeto(double sueldoBruto){
        if (sueldoBruto < 12000){
            return sueldoBruto-(20*0.01);
        }
        else if (sueldoBruto > 12000 || sueldoBruto < 25000){
            return sueldoBruto-(30*0.01);
        }
        else if (sueldoBruto > 25000){
            return sueldoBruto-(40*0.01);
        }

        return sueldoBruto;
    }

}

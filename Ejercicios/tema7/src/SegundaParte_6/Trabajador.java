package SegundaParte_6;

import java.util.Scanner;

public class Trabajador {
    //atributos
    private static double importeHoraEx;
    private double sueldoBase, irpf;
    private static int nTrabajadores;
    private int horasEx;
    private String dni, nombre;

    //constructor
    public Trabajador(){
        nTrabajadores=nTrabajadores+1;
    }

    public Trabajador(String dni, String name, double sueldoBase, int horasEx, double irpf){
        this.dni=dni;
        this.nombre =name;
        this.sueldoBase=sueldoBase;
        this.horasEx=horasEx;
        this.irpf=irpf;
        nTrabajadores=nTrabajadores+1;
    }

    //getters and setters
    //importe horas extras
    public static double getImporteHoraEx() {
        return importeHoraEx;
    }
    public static void setImporteHoraEx(double importeHoraEx) {
        Trabajador.importeHoraEx = importeHoraEx;
    }

    //sueldo base
    public double getSueldoBase() {
        return sueldoBase;
    }
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    //IRPF
    public double getIrpf() {
        return irpf;
    }
    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    //numero trabajadores
    public static int getnTrabajadores() {
        return nTrabajadores;
    }
    public static void setnTrabajadores(int nTrabajadores) {
        Trabajador.nTrabajadores = nTrabajadores;
    }

    //horas extras
    public int getHorasEx() {
        return horasEx;
    }
    public void setHorasEx(int horasEx) {
        this.horasEx = horasEx;
    }

    //dni
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    //nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //metodos
    public double calcularImporteHorasExtras(){
        return this.horasEx*importeHoraEx;
    }

    public double calcularSueldoBruto(){
        return sueldoBase+calcularImporteHorasExtras();
    }

    public double calcularRetencionIrpf(){
        return (calcularSueldoBruto()/100)*this.irpf;
    }

    public double calcularSueldo(){
        return calcularSueldoBruto()-calcularRetencionIrpf();
    }

    @Override
    public String toString() {
        return "Trabajador: " + nombre + " con DNI " + dni + '\n' +
                "Sueldo base: " + sueldoBase + '\n' +
                "Horas extras: " + horasEx + '\n' +
                "Tipo de IRPF: " + irpf + '\n' +
                "Sueldo bruto: " + calcularSueldoBruto() + '\n' +
                "Retencion por IRPF: " + calcularRetencionIrpf() + '\n' +
                "Sueldo neto: " + calcularSueldo() + '\n' +
                "-------------------------";
    }

    public void leerTrabajador(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        this.nombre=entrada.nextLine();

        System.out.print("DNI: ");
        this.dni=entrada.nextLine();

        System.out.print("Sueldo base: ");
        this.sueldoBase=entrada.nextDouble();

        System.out.print("Horas extra: ");
        this.horasEx=entrada.nextInt();

        System.out.print("Tipo IRPF: ");
        this.irpf=entrada.nextDouble();

        System.out.println("-------------------------");
    }

}

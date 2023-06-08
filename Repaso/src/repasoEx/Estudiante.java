package repasoEx;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Estudiante {
    //atributos
    private final String identificador;
    private String nombre, apellido, correo;
    Map<Asignatura, Double> asignaturas;

    //constructor
    public Estudiante(String identificador, String nombre, String apellido, String correo) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        asignaturas = new HashMap<>();
    }

    public long obtenerPin(int numero) {
        if (numero > 10 || numero < 1)
            numero = 10;

        String pin;

        do {
            StringBuilder cadenaNumeros = new StringBuilder("0123456789");
            pin = "";

            for (int i = 1; i <= numero; i++) {
                int numAle = ThreadLocalRandom.current().nextInt(0, cadenaNumeros.length());
                pin = pin.concat(String.valueOf(cadenaNumeros.charAt(numAle)));
                cadenaNumeros.deleteCharAt(numAle);
            }
        } while (pin.charAt(0) == '0');

        return Long.parseLong(pin);
    }

    public long obtenerPin() {
        return obtenerPin(4);
    }

    public String obtenerLogin() {
        String[] a = this.apellido.split(" ");

        String nombre = this.nombre;
        String apellido = a[0];

        int finNombre = 3;
        int finApe = 3;

        if (nombre.length() < 3)
            finNombre = nombre.length();

        if (apellido.length() < 3)
            finApe = apellido.length();

        return nombre.substring(0, finNombre).concat(apellido.substring(0, finApe));
    }

    public boolean esCorreoValido() {
        return this.correo.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
    }

    public void matricular(Asignatura asig) {
        asignaturas.put(asig, 0.0);
    }

    public void cambiarNota(int codigoAsig, double numReal) throws Exception {
        for (Asignatura a : asignaturas.keySet()) {
            if (a.codigo == codigoAsig) {
                asignaturas.replace(a, numReal);
                break;
            }
        }

        throw new Exception("No matriculado");

    }

    public void cambiarNota(String nombre, double numReal) throws Exception {
        for (Asignatura a : asignaturas.keySet()) {
            if (a.nombre.equalsIgnoreCase(nombre)) {
                asignaturas.replace(a, numReal);
                break;
            }
        }

        throw new Exception("No matriculado");

    }

    public boolean promociona(){
        int cont=0;

        for (Double v : asignaturas.values()) {
            if(v>=5)
                cont++;
        }

        return cont == asignaturas.size();
    }

    public void mostrarNotas(){
        ArrayList<Map.Entry<Asignatura,Double>> arrayAsig = new ArrayList<>(asignaturas.entrySet());

        arrayAsig.sort(new Comparator<Map.Entry<Asignatura, Double>>() {
            @Override
            public int compare(Map.Entry<Asignatura, Double> o1, Map.Entry<Asignatura, Double> o2) {
                return o1.getKey().nombre.compareToIgnoreCase(o2.getKey().nombre);
            }
        });

        for (Map.Entry<Asignatura, Double> entry : arrayAsig) {
            System.out.printf("%10s:%-35s::%.2f%n", entry.getKey().codigo,entry.getKey().nombre,entry.getValue());
        }
    }

    public static void main(String[] args) {
        Estudiante e = new Estudiante("sd", "asdasd", "sdasd", "asdasd");
        System.out.println(e.obtenerPin(10));


        System.out.println(Integer.toHexString(255) + Integer.toHexString(255) + Integer.toHexString(255));
    }
}

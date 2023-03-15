package examen;

import java.util.ArrayList;

public class FlotaVehiculos {
    //atributos
    private final String nombreEmpresa;
    private ArrayList<Vehiculos> flota= new ArrayList<Vehiculos>();

    //constructor
    public FlotaVehiculos(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    //metodos
    public void agregarVehiculo(Vehiculos v){
        flota.add(v);
    }

    /**
     * @param v
     * @return devolverá si se encuentra o no
     */
    public boolean buscarVehiculo (Vehiculos v){
        for (Vehiculos vehiculo : flota) {
            if(vehiculo.equals(v))
                return true;
        }
        return false;
    }

    /**
     * @param c
     * @return va a devolver un Array con todos los coches que tenemos
     */
    public int[] arrayCoches(Coche c){
        int[] arraycoches= new int[flota.size()];

        for(int i=0; i<arraycoches.length;i++){
//            if(c.equals())
                arraycoches[i]=i++;
        }

        return arraycoches;
    }

}

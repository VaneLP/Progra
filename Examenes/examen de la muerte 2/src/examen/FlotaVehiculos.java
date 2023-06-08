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
    public void agregarVehiculo(String matricula, String modelo,int numrudas){
        try {
            flota.add(new Terrestres(matricula,modelo,numrudas));
        } catch (VehiculoExcepcion e) {
            throw new RuntimeException(e);
        }
    }

    public void agregarVehiculo(String matricula, String modelo,int numrudas,boolean aireAcondicionado){
        try {
            flota.add(new Coche(matricula,modelo,numrudas,aireAcondicionado));
        } catch (VehiculoExcepcion e) {
            throw new RuntimeException(e);
        }
    }

    public void agregarVehiculo(String matricula, String modelo,int numrudas,Color color){
        try {
            flota.add(new Motos(matricula,modelo,numrudas,color));
        } catch (VehiculoExcepcion e) {
            throw new RuntimeException(e);
        }
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
     * @return va a devolver un Array con todos los coches que tenemos
     */
    public Coche[] arrayCoches(){
        Coche[] arraycoches= new Coche[flota.size()];

        int cont=0;
        for (Vehiculos v : flota) {
            if (v instanceof Coche) {
                arraycoches[cont] = (Coche) v;
                cont++;
            }
        }

        return arraycoches;
    }

}
